package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty(SeleniumConfig.WEBDRIVER_CHROME_DRIVER, SeleniumConfig.CHROME_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();  
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://anhtester.com");
        
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
