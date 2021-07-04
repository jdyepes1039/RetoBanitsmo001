package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class maxTimeLoginPage extends PageObject {

    public static final Target INPUT_USER = Target.the("where do write the user name")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target INPUT_PASSWORD = Target.the("where do write the password")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target CONECT_BUTTON = Target.the("button to confirm login" +
            "web page").located(By.xpath("//a[normalize-space()='Conectarse']"));



}
