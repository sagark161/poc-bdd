package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LandingPageStepDef {
    WebDriver driver;
    SharedSteps sharedSteps;

    public  LandingPageStepDef(SharedSteps sharedSteps){
        this.sharedSteps = sharedSteps;
        driver = sharedSteps.getDriver();
    }

    @Given("User launches Demo QA web application")
    public void user_launches_demo_qa_web_application() {
        driver.get("https://demoqa.com/");
    }

    @Then("Title of page should be DEMOQA")
    public void title_of_page_should_be_demoqa() {
        Assert.assertEquals("DEMOQA",driver.getTitle());
    }

//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
