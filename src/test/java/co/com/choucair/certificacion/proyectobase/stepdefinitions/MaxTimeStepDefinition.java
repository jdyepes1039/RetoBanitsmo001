package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.tasks.LoginMaxTime;
import co.com.choucair.certificacion.proyectobase.tasks.OpenUp;
import co.com.choucair.certificacion.proyectobase.tasks.SelectDate;
import co.com.choucair.certificacion.proyectobase.tasks.FillData;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class MaxTimeStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Juan wants to automation at the Maxtime Choucair$")
    public void thanJuanWantsToAutomationAtTheMaxtimeChoucair() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (LoginMaxTime.onThePage()));

    }

    @When("^select the current working day$")
    public void selectTheCurrentWorkingDay() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDate.actual());

    }

    @When("^he register the job times on the choucair Maxtime platform$")
    public void heRegisterTheJobTimesOnTheChoucairMaxtimePlatform(DataTable dtDatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillData.maxtime(dtDatos));

    }

    @Then("^he should find the times registered on the platform$")
    public void heShouldFindTheTimesRegisteredOnThePlatform() {

    }

}
