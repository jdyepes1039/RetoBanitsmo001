package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.searchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class search implements Task {

    private String course;

    public search(String course) {
        this.course = course;
    }

    public static search the(String course) {
        return Tasks.instrumented(search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(searchCoursePage.BUTTON_UNIV_CHOUCAIR));
        actor.attemptsTo(Click.on(searchCoursePage.SELECTOR));
        actor.attemptsTo(Click.on(searchCoursePage.SELECT_AUTOMATION));
        actor.wasAbleTo((WaitUntil.the(searchCoursePage.SERENITY_BDD_WEB, isCurrentlyVisible()).forNoMoreThan(3).seconds()));
        actor.attemptsTo(Click.on(searchCoursePage.SERENITY_BDD_WEB));

    }
}
