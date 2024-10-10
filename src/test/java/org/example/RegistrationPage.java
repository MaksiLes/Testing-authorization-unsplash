package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/header/nav/div[2]/div[2]/div[5]/a")
    private WebElement logInBtn;

    public void clickLogInBtn() {
        logInBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[3]/div/div[2]/a")
    private WebElement joinBtn;

    public void clickJoinBtn() {
        joinBtn.click();
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/div[1]/label[1]/input")
    private WebElement FirstName;

    public void inputFirstName(String firstName) {
        FirstName.sendKeys(firstName);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/div[1]/label[2]/input")
    private WebElement LastName;

    public void inputLastName(String lastName) {
        LastName.sendKeys(lastName);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/label[1]/input")
    private WebElement Email;

    public void inputEmail(String email) {
        Email.sendKeys(email);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/label[2]/input")
    private WebElement Username;

    public void inputUsername (String userName) {
        Username.sendKeys(userName);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/label[3]/input")
    private WebElement Password;

    public void inputPassword(String password) {
        Password.sendKeys(password);
    }

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[3]/div[2]/form/button")
    private WebElement JoinRegistration;

    public void clickJoinRegistration() {
        JoinRegistration.click();
    }
}
