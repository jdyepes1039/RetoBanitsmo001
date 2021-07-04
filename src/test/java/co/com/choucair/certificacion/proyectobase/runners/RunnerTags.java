package co.com.choucair.certificacion.proyectobase.runners;

import co.com.choucair.certificacion.proyectobase.util.BeforeSuite;
import co.com.choucair.certificacion.proyectobase.util.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

//@RunWith(CucumberWithSerenity.class)
@RunWith(RunnerPersonalizado.class)
@CucumberOptions (features = "src/test/resources/features/maxTimeChoucair.feature",
        glue = {"co.com.choucair.certificacion.proyectobase.stepdefinitions"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
    private RunnerTags(){

    }

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException  {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/maxTimeChoucair.feature");
    }

}

