package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.time.Duration;

public class RegistrationTest {
    public static WebDriver driver;
    public static RegistrationPage registrationPage;
    public static LoginPage loginPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfProperties.properties.getProperty("url"));

        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
    }
    

    @Test
    public void registrationFailed() throws InterruptedException {
        registrationPage.clickJoinBtn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        registrationPage.inputFirstName(ConfProperties.properties.getProperty("firstName"));
        registrationPage.inputLastName(ConfProperties.properties.getProperty("lastName"));
        Thread.sleep(2000);
        registrationPage.inputEmail(ConfProperties.properties.getProperty("email"));
        registrationPage.inputUsername(ConfProperties.properties.getProperty("username"));
        registrationPage.inputPassword(ConfProperties.properties.getProperty("password"));
        registrationPage.clickJoinRegistration();
        String title = driver.getTitle();
        Assert.assertEquals("Join | Unsplash", title);
        if(title != null) {
            System.out.println("In this example, we considered the case when the captcha was not passed.");
        }
    }

    @Test
    public void login() {
        loginPage.inputLoginEmail(ConfProperties.properties.getProperty("email"));
        loginPage.inputLoginPassword(ConfProperties.properties.getProperty("password"));
        loginPage.clickLoginBtn();
    }

    @AfterTest
    public void ternDown() {
        driver.quit();
    }

}
