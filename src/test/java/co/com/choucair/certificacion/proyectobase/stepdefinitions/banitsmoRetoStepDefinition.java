package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.questions.Answers;
import co.com.choucair.certificacion.proyectobase.tasks.Dowload;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.Openthe;
import co.com.choucair.certificacion.proyectobase.tasks.search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class banitsmoRetoStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to automation at the banitsmo page$")
    public void thanJuanWantsToAutomationAtTheBanitsmoPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(Openthe.page());

    }

    @When("^he dowload the document of banitsmo of Autocertificacion unificado$")
    public void heDowloadTheDocumentOfBanitsmoOfAutocertificacionUnificado() {
        OnStage.theActorInTheSpotlight().attemptsTo(Dowload.theFilepdf());

    }

    @Then("^he shoul verify the pdf document(.*)$")
    public void heShoulVerifyThePdfDocument(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answers.toThe(question)));

    }
}
