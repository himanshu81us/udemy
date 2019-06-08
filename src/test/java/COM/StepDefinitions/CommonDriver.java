package COM.StepDefinitions;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonDriver {

    public static WebDriver driver;
    public void OpenBrowser(){


        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();


    }

    public void CloseBrowser(){

        driver.close();
    }
}
