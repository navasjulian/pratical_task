package example.pages.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import example.page.Page;
import example.pages.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static example.util.StringConstants.*;

/**
 * LoginPageTest
 *
 * Automation tests for the Login Page
 *
 */
public class LoginPageTest extends TestBase {
    Page page;
    WebDriver webDriver;

    @BeforeMethod
    public void testInit() {
        String path = LOGIN_PATH;
        // Open the page
        page = open(websiteUrl + path, Page.class);
    }


    @Test(description = "Test login admin successful")
    public void testLoginAdminSuccess() {


        webDriver = getWebDriver();
        webDriver.get("https://www.shop-apotheke.com/nl/login.htm");
        WebDriverWait wait = new WebDriverWait(webDriver, 40);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-email")));
        webDriver.findElement(By.id("login-email")).sendKeys("juliannavas@gmail.com");
        webDriver.findElement(By.id("login-password")).sendKeys("Elbrus98");
        webDriver.findElement(By.id("btn-login")).click();
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.className("a-Button")).click();
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
