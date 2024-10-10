package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/label[1]/input")
    private WebElement loginEmail;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/label[2]/input")
    private WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[1]/form[2]/button")
    private WebElement loginBtn;

    public void inputLoginEmail(String email) {
        loginEmail.sendKeys(email);
    }

    public void inputLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
