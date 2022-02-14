package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.input_forms.SimpleFormPage;

import java.io.File;
import java.time.Duration;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "step")
public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait explicitWait;

    /**
     * Input Form POM
     */
    public static SimpleFormPage simpleFormPage;

    @BeforeClass
    public static void setup() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // POMs

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}

