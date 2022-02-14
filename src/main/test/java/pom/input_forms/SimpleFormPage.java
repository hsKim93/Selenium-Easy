package pom.input_forms;

import runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormPage {

    @Given("I am on simple form page")
    public void iAmOnSimpleFormPage() {
        TestRunner.driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    @When("I enter {string} into Enter message box")
    public void iEnterIntoEnterMessageBox(String arg0) {

    }

    @When("I click Show Message Button")
    public void iClickShowMessageButton() {


    }

    @Then("I should see {string} displayed next to Your Message")
    public void iShouldSeeDisplayedNextToYourMessage(String arg0) {

    }
}
