package steps.input_forms.simple_form;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.input_forms.SimpleFormPage;
import runner.TestRunner;

public class SimpleFormStep {

    private final WebDriver driver = TestRunner.driver;
    private final SimpleFormPage simpleFormPage = TestRunner.simpleFormPage;
    private final WebDriverWait explicitWait = TestRunner.explicitWait;

    @Given("I am on simple form page")
    public void iAmOnSimpleFormPage() {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        explicitWait.until(ExpectedConditions.visibilityOf(simpleFormPage.messageBox));
    }

    @When("I enter {string} into Enter message box")
    public void iEnterIntoEnterMessageBox(String arg0) {
        simpleFormPage.messageBox.sendKeys(arg0);
    }

    @When("I click Show Message button")
    public void iClickShowMessageButton() {
        simpleFormPage.showMessageButton.click();
    }

    @Then("I should see {string} displayed next to Your Message")
    public void iShouldSeeDisplayedNextToYourMessage(String arg0) {
        Assert.assertEquals(arg0, simpleFormPage.yourMessage.getText());
    }

    @When("I scroll down to the bottom")
    public void iScrollDownToTheBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @When("I enter {string} into Enter a box")
    public void iEnterIntoEnterABox(String arg0) {
        simpleFormPage.aBox.sendKeys(arg0);
    }

    @When("I enter {string} into Enter b box")
    public void iEnterIntoEnterBBox(String arg0) {
        simpleFormPage.bBox.sendKeys(arg0);
    }

    @When("I click Get Total button")
    public void iClickGetTotalButton() {
        simpleFormPage.getTotalButton.click();
    }

    @Then("I should see {string} displayed next to Total")
    public void iShouldSeeDisplayedNextToTotal(String arg0) {
        Assert.assertEquals(arg0, simpleFormPage.displayValue.getText());
    }
}
