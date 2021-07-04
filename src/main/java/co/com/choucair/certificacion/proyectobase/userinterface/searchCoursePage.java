package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class searchCoursePage extends PageObject {

    public static final Target BUTTON_UNIV_CHOUCAIR = Target.the("Select Choucair university" +
            "University").located(By.xpath("//strong[contains(text(),'Universidad')]"));
    public static final Target SELECTOR = Target.the("Select course").located(By.name(
            "categoryid"));
    public static final Target SELECT_AUTOMATION = Target.the("Select course automation").located(
            By.xpath("//option[@value='19']"));
    public static final Target SERENITY_BDD_WEB = Target.the("Course of Cucumber " +
            "Serenity BDD + Screenplay").located(By.xpath("//h4[normalize-space()='Cucumber - SerenityBDD + Screenplay (WEB)']"));

}
