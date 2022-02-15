package pom.input_forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage {

    /**
     * https://demo.seleniumeasy.com/basic-first-form-demo.html
     */

    public SimpleFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-message")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    public WebElement showMessageButton;

    @FindBy(id = "display")
    public WebElement yourMessage;

    @FindBy(id = "sum1")
    public WebElement aBox;

    @FindBy(id = "sum2")
    public WebElement bBox;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    public WebElement getTotalButton;

    @FindBy(id = "displayvalue")
    public WebElement displayValue;
}
