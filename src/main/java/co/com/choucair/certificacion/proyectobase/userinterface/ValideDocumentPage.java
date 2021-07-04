package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValideDocumentPage extends PageObject {

    public static final Target FATCA_CRS_PDF = Target.the("File document pdf").located(
            By.id("//*[@id=\"title\"]"));
}
