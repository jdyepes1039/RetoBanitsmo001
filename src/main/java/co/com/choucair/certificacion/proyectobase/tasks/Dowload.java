package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.DowloadPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Dowload implements Task {

    public static Dowload theFilepdf() {
        return Tasks.instrumented(Dowload.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DowloadPage.BUTTON_LEARN),
                Click.on(DowloadPage.BUTTON_LEGAL),
                Click.on(DowloadPage.BUTTON_FATCA),
                (WaitUntil.the(DowloadPage.DOCUMENT_PDF, isCurrentlyVisible()).forNoMoreThan(3).seconds()),
                Click.on(DowloadPage.DOCUMENT_PDF));



    }
}
