package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.cucumber.listener.Reporter;

import java.io.File;

public class SharedSteps {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        Reporter.loadXMLConfig(new File("/Users/sagar/IdeaProjects/poc-bdd/src/test/resources/Cofigurations/extent-config.xml"));

        driver.close();
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
