package selenium.interactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import selenium.SeleniumConfig;

public class Demo {

    public static void main(String[] args) throws Exception {
        // open browser
        WebDriver driver = SeleniumConfig.getChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(SeleniumConfig.LOCAL_HOST);

        Actions action = new Actions(driver);
        
        // quit browser
        Thread.sleep(2000);
        driver.quit();
    }
}
