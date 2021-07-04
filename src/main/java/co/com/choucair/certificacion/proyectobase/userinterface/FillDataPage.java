package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FillDataPage extends PageObject {

    public static final Target SELECT_PROJECT = Target.the("Select project Sinapsis").located(
            By.id("Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg"));
    public static final Target FIELD_PROJECT = Target.the("").located(By.id(
            "Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target SELECT_TIME_TYPE = Target.the("Select time type to report")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1Img"));
    public static final Target SELECT_HOUR = Target.the("Select hours to report")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L_LBI4T0"));
    public static final Target SELECT_SERVICE = Target.the("Select the service to report").located(
            By.id("Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_BImg"));
    public static final Target FIELD_SERVICE = Target.the("Enter the service type")
            .located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target SEARCH_SERVICE = Target.the("Search the service")
            .located(By.id("Dialog_v9_LE_v10_cell0_0_xaf_Nombre_View"));
    public static final Target SELECT_ACTIVITY = Target.the("Select activity type")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1Img"));
    public static final Target FIELD_ACTIVITY = Target.the("Enter the field activity")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_I"));
    public static final Target SELECT_EJECUCION_PRUEBAS = Target.the("Select option Ejecución de pruebas")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_LBI25T0"));
    public static final Target FIELD_HOURS = Target.the("Enter the hours worked in the day").located(
            By.id("Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I"));
    public static  final Target FIELD_COMENT = Target.the("Enter the comentary").located(By.id
            ("Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I"));
    public static final Target SAVE_AND_CLOSE = Target.the("Press the button save and close").located(
            By.xpath("//div[@id='Vertical_EditModeActions2_Menu_DXI1_T']//a[@title='Guardar y cerrar'][normalize-space()='Guardar y cerrar']"));
}
