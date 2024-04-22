package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class SearchPageSteps {
    
    @And("User enters the city and date")
    public void enter_city_and_data(){
        new HomePage(driver).enterCityDate("Jerusalem, Israel", "4/22/2024 - 4/30/2024");
    }
    
    @And("User clicks in Yalla button on Home")
    public void click_on_Yalla_button_on_Home(){
        new HomePage(driver).clickOnYallaButtonOnHome();

    }

    @Then("A page with pictures of available cars will load")
    public void verify_search_car(){
        new SearchPage(driver).isImagesDisplayed();

    }


    
    
}
