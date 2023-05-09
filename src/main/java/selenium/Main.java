package selenium;

import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver =  SeleniumConfig.getChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://anhtester.com");
        
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
