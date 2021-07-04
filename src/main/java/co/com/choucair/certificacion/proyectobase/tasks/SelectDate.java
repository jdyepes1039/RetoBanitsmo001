package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.SelectDatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDate implements Task {

    public static SelectDate actual() {
        return Tasks.instrumented(SelectDate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectDatePage.SELECT_FECHA));
        actor.attemptsTo(Click.on(SelectDatePage.SELECT_NEW));

    }
}
