package com.choucairtesting.automation.stepdefinitions;

import com.choucairtesting.automation.interactions.OpenTheBrowser;
import com.choucairtesting.automation.task.FillAllFields;
import com.choucairtesting.automation.ui.FromPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class FromStepDefinitions {
    @Managed
    private WebDriver driver;
    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Yuli").can(BrowseTheWeb.with(driver));


    }
    @Given("^a web user wants to enter text box$")
    public void aWebUserWantsToEnterTextBox() {
          theActorInTheSpotlight().attemptsTo(OpenTheBrowser.on(FromPage.URL));
    }


    @When("^he fills all the requested fields in text box section$")
    public void heFillsAllTheRequestedFieldsInTextBoxSection() {
        theActorInTheSpotlight().attemptsTo(FillAllFields.successful());

    }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {

    }


}
