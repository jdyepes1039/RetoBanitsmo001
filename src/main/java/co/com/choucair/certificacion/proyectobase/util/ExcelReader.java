package co.com.choucair.certificacion.proyectobase.util;

import co.com.choucair.certificacion.proyectobase.exceptions.BackEndExceptions;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

	public class ExcelReader {
		private static XSSFSheet excelWSheet;
		private static XSSFWorkbook excelWBook;

		private ExcelReader() {
		}

		public static void setExcelFile(String path, String sheetName) {
			try {
				FileInputStream excelFile = new FileInputStream(path);
				excelWBook = new XSSFWorkbook(excelFile);
				excelWSheet = excelWBook.getSheet(sheetName);

			} catch (Exception e) {
				throw new BackEndExceptions(e);
			}

		}

		public static int contarFilas() {
			int numFilas = 0;

			try {
				numFilas = excelWSheet.getLastRowNum();
			} catch (Exception e) {
				throw new BackEndExceptions(e);
			}

			return numFilas;
		}

		public static void setCellData(int rowNum, int colNum, String textObtenido) {
			try {
				excelWSheet.getRow(rowNum).createCell(colNum).setCellValue(textObtenido);
				excelWSheet.getRow(rowNum).getCell(colNum).setCellValue(textObtenido);
			} catch (Exception e) {
				throw new BackEndExceptions(e);
			}
		}

		public static void saveData(String path) {
			try {
				FileOutputStream excelFileOut = new FileOutputStream(path);
				excelWBook.write(excelFileOut);
			} catch (Exception e) {
				throw new BackEndExceptions(e);
			}
		}

		public static void cerrarBook() throws IOException {
			excelWBook.close();
		}
	}