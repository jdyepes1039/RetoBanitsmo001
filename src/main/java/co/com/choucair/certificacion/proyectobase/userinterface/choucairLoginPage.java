package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class choucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows " +
            "us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where do write the user name")
            .located(By.xpath("//input[@id='username']"));
    public static final Target INPUT_PASSWORD = Target.the("where do write the password")
            .located(By.xpath("//input[@id='password']"));
    public static final Target ACCESS_BUTTON = Target.the("button to confirm login" +
            "web page").located(By.xpath("//button[normalize-space()='Acceder']"));



}
