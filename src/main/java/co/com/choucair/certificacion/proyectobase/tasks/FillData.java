package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.model.Maxtime;
import co.com.choucair.certificacion.proyectobase.model.MaxtimeBL;
import co.com.choucair.certificacion.proyectobase.userinterface.FillDataPage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.ENTER;


public class FillData implements Task {

    Maxtime objMaxtime = new Maxtime();
    MaxtimeBL objMaxtimeBL = new MaxtimeBL();
    private DataTable dtDatos;

    public FillData(DataTable dtDatos) {
        this.dtDatos = dtDatos;
    }

    public FillData(Maxtime objMaxtime) {
        this.objMaxtime = objMaxtime;
    }

    public static FillData maxtime(DataTable dtDatos) {
        return Tasks.instrumented(FillData.class, dtDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        objMaxtime = objMaxtimeBL.cargarDatos(dtDatos);

        actor.attemptsTo(Click.on(FillDataPage.SELECT_PROJECT));
        actor.attemptsTo(Enter.theValue(objMaxtime.getProyecto()).into(FillDataPage.FIELD_PROJECT),
                Click.on(FillDataPage.SELECT_TIME_TYPE),
                Click.on(FillDataPage.SELECT_HOUR),
                Click.on(FillDataPage.SELECT_SERVICE),
                Enter.theValue(objMaxtime.getServicio()).into(FillDataPage.FIELD_SERVICE),
                (Performable) Hit.the(ENTER),
                Click.on(FillDataPage.SEARCH_SERVICE),
                Click.on(FillDataPage.SELECT_ACTIVITY),
                Enter.theValue(objMaxtime.getActividad()).into(FillDataPage.FIELD_ACTIVITY),
                Click.on(FillDataPage.SELECT_EJECUCION_PRUEBAS),
                (Performable) Hit.the(Keys.DELETE),
                Enter.theValue(objMaxtime.getHoras()).into(FillDataPage.FIELD_HOURS),
                Enter.theValue(objMaxtime.getComentario()).into(FillDataPage.FIELD_COMENT),
                Click.on(FillDataPage.SAVE_AND_CLOSE));

    }
}
