package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void clicks_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data(){
        new LoginPage(driver).enterData("ua_test@mail.com", "Pass12345!");
    }

    @And("User clicks in Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();

    }

    @Then("User verifies Success Message is displayed")
    public void verify_Success_Message(){
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }




}
