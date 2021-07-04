package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectDatePage extends PageObject {

    public static final Target SELECT_FECHA = Target.the("Click on actual date").located(
            By.xpath("//span[@id='Vertical_v1_LE_v2_cell0_0_xaf_Fecha_View']"));

    public static final Target SELECT_NEW = Target.the("Click on New working time").located(
            By.xpath("//a[normalize-space()='Nuevo']"));

}
