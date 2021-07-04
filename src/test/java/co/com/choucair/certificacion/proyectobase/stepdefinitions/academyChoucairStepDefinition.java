package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.tasks.LoginMaxTime;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class academyChoucairStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to learn automation at the academy Choucair$")
    public void thanJuanWantsToLearnAutomationAtTheAcademyChoucair() {
       //OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (LoginMaxTime.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(search.the(course));

    }

    @Then("^he finds the course called Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia() {


    }
}
