package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.PageHome;

public class HomePageStepDef {
    WebDriver driver;
    SharedSteps sharedSteps;
    PageHome pageHome;

    public HomePageStepDef(SharedSteps sharedSteps){
        this.sharedSteps = sharedSteps; // Dependency Injection
        driver = sharedSteps.getDriver();

        pageHome = new PageHome(driver);
    }

    @Given("User launches Demo QA web application")
    public void user_launches_demo_qa_web_application() {
        driver.get("https://demoqa.com/");
    }

    @Then("Title of page should be DEMOQA")
    public void title_of_page_should_be_demoqa() {
        Assert.assertEquals("DEMOQA",driver.getTitle());
    }

    @Then("Count of menus should be six")
    public void count_of_menus_should_be_six() {
        Assert.assertEquals(6, pageHome.getRelativeWebElements(pageHome.ele_menubar, "./div").size());
    }
}
