package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.maxTimeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginMaxTime implements Task {

    public static LoginMaxTime onThePage() {
        return Tasks.instrumented(LoginMaxTime.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("jyepesj").into(maxTimeLoginPage.INPUT_USER));
        actor.attemptsTo(Enter.theValue("Deliod123.").into(maxTimeLoginPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(maxTimeLoginPage.CONECT_BUTTON));

    }
}
