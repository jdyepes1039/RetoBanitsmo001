package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.choucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//      actor.attemptsTo(Enter.theValue("jyepesj").into(choucairLoginPage.INPUT_USER));
//       actor.wasAbleTo((WaitUntil.the(choucairLoginPage.LOGIN_BUTTON, isCurrentlyVisible()).forNoMoreThan(3).seconds()));
       actor.attemptsTo(Click.on(choucairLoginPage.LOGIN_BUTTON));
        actor.wasAbleTo((WaitUntil.the(choucairLoginPage.INPUT_USER, isCurrentlyVisible()).forNoMoreThan(3).seconds()));
        actor.attemptsTo(Enter.theValue("jyepesj").into(choucairLoginPage.INPUT_USER));
        actor.attemptsTo(Enter.theValue("Deliod789.").into(choucairLoginPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(choucairLoginPage.ACCESS_BUTTON));
    }
}
