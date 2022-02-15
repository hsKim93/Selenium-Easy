package steps.input_forms.checkbox;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.input_forms.CheckboxPage;
import runner.TestRunner;

public class CheckboxStep {

    private final CheckboxPage checkboxPage = TestRunner.checkboxPage;
    private final WebDriver driver = TestRunner.driver;
    private final WebDriverWait explicitWait = TestRunner.explicitWait;

    @Given("I am on checkbox page")
    public void iAmOnCheckboxPage() {
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        explicitWait.until(ExpectedConditions.visibilityOf(checkboxPage.checkBox));
    }

    @When("I click on click on this check box")
    public void iClickOnClickOnThisCheckBox() {
        checkboxPage.checkBox.click();
    }

    @Then("I should see Success - Check box is checked")
    public void iShouldSeeSuccessCheckBoxIsChecked() {
        explicitWait.until(ExpectedConditions.visibilityOf(checkboxPage.successMessage));
        Assert.assertEquals("block", checkboxPage.successMessage.getCssValue("display"));
    }

    @Then("I should no longer see Success - Check box is checked")
    public void iShouldNoLongerSeeSuccessCheckBoxIsChecked() {
        explicitWait.until(ExpectedConditions.invisibilityOf(checkboxPage.successMessage));
        Assert.assertEquals("none", checkboxPage.successMessage.getCssValue("display"));
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        switch (arg0) {
            case "1":
                checkboxPage.option1.click();
                break;
            case "2":
                checkboxPage.option2.click();
                break;
            case "3":
                checkboxPage.option3.click();
                break;
            case "4":
                checkboxPage.option4.click();
                break;
            default:
                Assert.fail();
                return;
        }
    }

    @Then("{string} will be checked")
    public void willBeChecked(String arg0) {
        switch (arg0) {
            case "1":
                Assert.assertTrue(checkboxPage.box1.isSelected());
                break;
            case "2":
                Assert.assertTrue(checkboxPage.box2.isSelected());
                break;
            case "3":
                Assert.assertTrue(checkboxPage.box3.isSelected());
                break;
            case "4":
                Assert.assertTrue(checkboxPage.box4.isSelected());
                break;
            default:
                Assert.fail();
                return;
        }
    }

    @Then("{string} will be not be checked")
    public void willBeNotBeChecked(String arg0) {
        switch (arg0) {
            case "1":
                Assert.assertTrue(!checkboxPage.box1.isSelected());
                break;
            case "2":
                Assert.assertTrue(!checkboxPage.box2.isSelected());
                break;
            case "3":
                Assert.assertTrue(!checkboxPage.box3.isSelected());
                break;
            case "4":
                Assert.assertTrue(!checkboxPage.box4.isSelected());
                break;
            default:
                Assert.fail();
                return;
        }
    }

    @Then("{string} and {string} will be checked")
    public void andWillBeChecked(String arg0, String arg1) {
        WebElement a, b;
        switch (arg0) {
            case "1":
                a = checkboxPage.box1;
                break;
            case "2":
                a = checkboxPage.box2;
                break;
            case "3":
                a = checkboxPage.box3;
                break;
            case "4":
                a = checkboxPage.box4;
                break;
            default:
                Assert.fail();
                return;
        }
        switch (arg1) {
            case "1":
                b = checkboxPage.box1;
                break;
            case "2":
                b = checkboxPage.box2;
                break;
            case "3":
                b = checkboxPage.box3;
                break;
            case "4":
                b = checkboxPage.box4;
                break;
            default:
                Assert.fail();
                return;
        }
        Assert.assertTrue(a.isSelected() && b.isSelected());
    }

    @When("I click on Check All button")
    public void iClickOnCheckAllButton() {
        checkboxPage.checkAllBox.click();
    }

    @Then("I should see all options checked")
    public void iShouldSeeAllOptionsChecked() {
        Assert.assertTrue(checkboxPage.box1.isSelected() &&
                        checkboxPage.box2.isSelected() &&
                        checkboxPage.box3.isSelected() &&
                        checkboxPage.box4.isSelected()
                );
    }

    @When("I click on Uncheck All button")
    public void iClickOnUncheckAllButton() {
        checkboxPage.checkAllBox.click();
    }

    @Then("I should see all options unchecked")
    public void iShouldSeeAllOptionsUnchecked() {
        Assert.assertFalse(checkboxPage.box1.isSelected() &&
                checkboxPage.box2.isSelected() &&
                checkboxPage.box3.isSelected() &&
                checkboxPage.box4.isSelected()
        );
    }

    @Then("I should see Check All instead of Uncheck All")
    public void iShouldCheckAllInsteadOfUncheckAll() {
        System.out.println(checkboxPage.checkAllBox.getCssValue("value"));
        Assert.assertEquals("Check All", checkboxPage.checkAllBox.getAttribute("value"));
    }
}
