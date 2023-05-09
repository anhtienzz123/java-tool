package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

    public static void main(String[] args) throws Exception {
        // open browser
        WebDriver driver = SeleniumConfig.getChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(SeleniumConfig.LOCAL_HOST);

        // login form, test id name
        WebElement loginBtn = driver.findElement(By.id("login-btn"));
        loginBtn.click();

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("test@gmail.com");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("test@gmail.com");

        WebElement submitBtn = driver.findElement(By.name("submit"));
        submitBtn.click();

        // test LinkText, PartialLinkText
        Thread.sleep(2000);
        driver.navigate().to(SeleniumConfig.LOCAL_HOST);
        WebElement productPageLink = driver.findElement(By.linkText("product page"));
        // WebElement productPageLink = driver.findElement(By.partialLinkText("product"));
        productPageLink.click();

        // quit browser
        Thread.sleep(2000);
        driver.quit();
    }
}
