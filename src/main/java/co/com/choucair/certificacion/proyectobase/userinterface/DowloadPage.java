package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DowloadPage extends PageObject {

    public static final Target BUTTON_LEARN = Target.the("Click on button aprender" +
            "es facil").located(By.xpath("//a[normalize-space()='Aprender es Fácil']"));
    public static final Target BUTTON_LEGAL = Target.the("Click on button Legales").located(
            By.xpath("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales/']"));
    public static final Target BUTTON_FATCA = Target.the("Click on elment Fatca")
            .located(By.xpath("//a[@title='ENSA']"));
    public static final Target DOCUMENT_PDF = Target.the("Open document PDF")
            .located(By.cssSelector("body.toolbar-closed:nth-child(2) div.wpthemeLayoutContainers.wpthemeLayoutContainersHidden:nth-child(2) div.wpthemeInner div.component-control.id-Z7_8252I1C0M0O260A72B17TR28M1:nth-child(2) section.ibmPortalControl.wpthemeControl.wpthemeHidden.a11yRegionTarget:nth-child(2) div.wpthemeControlBody.wpthemeOverflowAuto.wpthemeClear div.container-fluid.none:nth-child(2) div.row div.col-xs-12 div.tabs-verticales.container-fluid.tabs-horizontal div.row div.tab-content.responsive.col-sm-9.hidden-xs.hidden-sm div.tab-pane.active:nth-child(1) table.table-responsive:nth-child(8) tr:nth-child(3) td:nth-child(2) span.bt-content a:nth-child(1) > img:nth-child(1)"));

}
