package co.com.choucair.certificacion.proyectobase.util;

import co.com.choucair.certificacion.proyectobase.exceptions.BackEndExceptions;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DataToFeature {

    protected static String data;
    protected static boolean foundHashTag = false;
    protected static boolean featureData = false;

    protected static String sheetName;
    protected static String excelFilePath;

    private DataToFeature() {
    }

    private static List<String> setExcelDataToFeature(File featureFile) throws IOException, InvalidFormatException {
        List<String> fileData = new ArrayList<>();
        try (BufferedReader buffReader = new BufferedReader(
                new InputStreamReader(new BufferedInputStream(new FileInputStream(featureFile)), "UTF-8"))) {
            foundHashTag = false;
            featureData = false;

            while ((data = buffReader.readLine()) != null) {
                sheetName = null;
                excelFilePath = null;

                if (data.trim().contains("##@externaldata")) {
                    foundHashTag = true;
                    fileData = getDataExcel(fileData);
                }
                if (foundHashTag) {
                    foundHashTag = false;
                    featureData = true;
                } else {
                    if ((data.startsWith("|") || data.endsWith("|")) && featureData) {
                        continue;
                    }
                    featureData = false;
                    fileData.add(data);
                }
            }
        }
        return fileData;
    }

    private static List<File> listOfFeatureFiles(File folder) {

        List<File> featureFiles = null;
        try {
            featureFiles = new ArrayList<>();
            if (folder.getName().endsWith(".feature")) {
                featureFiles.add(folder);
            } else {

                for (File fileEntry : folder.listFiles()) {
                    if (fileEntry.isDirectory()) {
                        featureFiles.addAll(listOfFeatureFiles(fileEntry));
                    } else {
                        if (fileEntry.isFile() && fileEntry.getName().endsWith(".feature")) {
                            featureFiles.add(fileEntry);
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new BackEndExceptions(e);
        }
        return featureFiles;
    }

    public static void overrideFeatureFiles(String featuresDirectoryPath)
            throws IOException, InvalidFormatException {

        List<File> listOfFeatureFiles = listOfFeatureFiles(new File(featuresDirectoryPath));

        try {
            for (File featureFile : listOfFeatureFiles) {

                List<String> featureWithExcelData = setExcelDataToFeature(featureFile);

                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(featureFile), "UTF-8"));) {
                    for (String string : featureWithExcelData) {
                        writer.write(string);
                        writer.write("\n");
                    }
                }
            }
        } catch (InvalidFormatException e) {
            throw new BackEndExceptions(e);
        }catch (IOException e2) {
            throw new BackEndExceptions(e2);
        }
    }

    private static List<String> getDataExcel(List<String> fileData) {

        List<Map<String, String>> excelData = null;

        try {
            excelFilePath = data.substring(StringUtils.ordinalIndexOf(data, "@", 2) + 1, data.lastIndexOf('@'));
            sheetName = data.substring(data.lastIndexOf('@') + 1, data.length());

            fileData.add(data);

            excelData = new LectorExcel().getData( excelFilePath, sheetName);
            for (int rowNumber = 0; rowNumber < excelData.size() - 1; rowNumber++) {
                StringBuilder cellData = new StringBuilder();
                cellData.append("      ");
                for (Entry<String, String> mapData : excelData.get(rowNumber).entrySet()) {
                    cellData.append("|" + mapData.getValue());
                }
                cellData.append("|");
                fileData.add(cellData.toString());
            }
        } catch (InvalidFormatException e) {
            throw new BackEndExceptions(e);
        } catch (IOException e2) {
            throw new BackEndExceptions(e2);
        }

        return fileData;
    }
}
