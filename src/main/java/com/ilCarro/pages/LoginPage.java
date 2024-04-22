package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;


    public LoginPage enterData(String mail, String password) {
        type(emailInput, mail);
        type(passwordInput, password);
        return this;

    }

    @FindBy(css = "[type='submit']")
    WebElement yalla_button;

    public LoginPage clickOnYallaButton() {
        click(yalla_button);
        return this;
    }

    @FindBy(css = ".message")
    WebElement message;

    public LoginPage isMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }

    @FindBy(css = "[type='button']")
    WebElement okButton;

    public LoginPage clickOkButton() {
        click(okButton);
        return this;
    }
}
