package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageHome {
    WebDriver driver;
    public PageHome(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='category-cards']")
    public WebElement ele_menubar;

    public List<WebElement> getRelativeWebElements(WebElement webElement, String relativeXpathOfChild){
        return webElement.findElements(By.xpath(relativeXpathOfChild));
    }
}
