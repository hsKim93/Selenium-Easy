package pom.input_forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {

    /**
     * https://demo.seleniumeasy.com/basic-checkbox-demo.html
     */

    public CheckboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div/div[2]/div/label")
    public WebElement checkBox;

    @FindBy(id = "txtAge")
    public WebElement successMessage;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label")
    public WebElement option1;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label")
    public WebElement option2;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label")
    public WebElement option3;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label")
    public WebElement option4;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")
    public WebElement box1;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")
    public WebElement box2;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")
    public WebElement box3;

    @FindBy(xpath= "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")
    public WebElement box4;

    @FindBy(id = "check1")
    public WebElement checkAllBox;


}
