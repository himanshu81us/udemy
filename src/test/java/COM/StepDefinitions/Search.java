package COM.StepDefinitions;

import COM.PageFile.Search_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

import static org.junit.Assert.assertEquals;

public class Search extends CommonDriver{

Search_Page SP = PageFactory.initElements(driver,Search_Page.class);
    @Given("^i enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {


//         WebDriver driver;

//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();

        System.out.println(url);
        OpenBrowser();
        driver.get(url);
        CloseBrowser();



    }

    @Then("null")
    public void iShouldSeeLearnItDoItAsPageTitle() {

        String ActualPageTitle;
        String ExpectedPageTitle = "Learn it. Do it";
        ActualPageTitle= driver.findElement(By.className("notice-streamer__headline")).getText();
        assertEquals(ExpectedPageTitle,ActualPageTitle);

    }
}
