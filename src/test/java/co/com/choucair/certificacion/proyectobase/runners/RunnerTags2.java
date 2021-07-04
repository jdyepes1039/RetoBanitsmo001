package co.com.choucair.certificacion.proyectobase.runners;

import co.com.choucair.certificacion.proyectobase.util.BeforeSuite;
import co.com.choucair.certificacion.proyectobase.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.ini4j.InvalidFileFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

//@RunWith(CucumberWithSerenity.class)
@RunWith(RunnerPersonalizado.class)
@CucumberOptions (features = "src/test/resources/features/academyChoucair.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags2 {
    private RunnerTags2(){

    }
    @BeforeSuite
    public static void test() throws InvalidFileFormatException, IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/academyChoucair.feature");
    }
}

