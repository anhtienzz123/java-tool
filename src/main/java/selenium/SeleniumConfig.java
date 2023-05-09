package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {

    private static WebDriver chromeDriver;

    public static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";

    public static final String CHROME_DRIVER_PATH = "D:/app/selenium/chromedriver.exe";
    
    public static final String LOCAL_HOST = "http://localhost:5500";

    public static WebDriver getChromeDriver() {

        if (chromeDriver == null) {
            System.setProperty(SeleniumConfig.WEBDRIVER_CHROME_DRIVER,
                    SeleniumConfig.CHROME_DRIVER_PATH);
            
            chromeDriver = new ChromeDriver();
        }

        return chromeDriver;
    }
}
