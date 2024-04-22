package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.AddCarPage;
import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

import static com.ilCarro.pages.BasePage.driver;

public class AddCarPageSteps {

    @Given("User clicks on Login link")
    public void click_on_Login_link_for_add_car() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data_of_car() {
        new LoginPage(driver).enterData("ua_test@mail.com", "Pass12345!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();

    }

    @And("User clicks on Ok button")
    public void click_Ok_Button() {
        new LoginPage(driver).clickOkButton();

    }

    @When("When User clicks on Let the car work")
    public void click_Let_Car_Work() {
        new HomePage(driver).clickLetCarWork();
    }

    @And("User enters the date")
    public void enter_date() {
        new AddCarPage(driver).enterDataOfCar("Jerusalem, Israel", "Tesla", "Y", "2020", 4, "4", "B", "M885YA", "200", "Test text");
    }

    @And("User uploads a photo")
    public void upload_Photo(){
        new AddCarPage(driver).uploadPhoto("R:/tesla.jpg");
    }

    @And("User clicks on Submit butoon")
    public void click_on_Submit_butoon(){
        new AddCarPage(driver).clickOnSubmit();

    }
 @Then("User verifies Success Message is displayed Car added")
    public void verify_Success_Message_Car(){
        new AddCarPage(driver).verifySuccessMessageCar("Car added");
    }

}
