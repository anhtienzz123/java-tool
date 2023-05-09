package selenium;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class WebDriverDemo {

    public static void main(String[] args) throws Exception {
        // open browser
        WebDriver driver = SeleniumConfig.getChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(SeleniumConfig.LOCAL_HOST);

        // id of browser
        String handle = driver.getWindowHandle();
        System.out.println("handle: " + handle);
        
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("allWindows: " + allWindows);
        
        // cookie
        Cookie newCookie = new Cookie("customName", "customValue");
        driver.manage().addCookie(newCookie);

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("cookies: " + cookies);

        driver.manage().deleteCookieNamed("CookieName");

        driver.manage().deleteAllCookies();
        
        // quit browser
        Thread.sleep(2000);
        driver.quit();
    }
}
