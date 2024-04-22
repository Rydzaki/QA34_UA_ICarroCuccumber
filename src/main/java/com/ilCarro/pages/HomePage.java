package com.ilCarro.pages;

import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = "[formcontrolname=\"city\"]")
    WebElement cityInput;
    @FindBy(css = "[formcontrolname=\"dates\"]")
    WebElement datesInput;

    public HomePage enterCityDate(String city, String data) {
        //type(cityInput,city);
        type(cityInput, city);
        pause(500);
        cityInput.sendKeys(Keys.DOWN, Keys.ENTER);

        click(datesInput);
        //datesInput.sendKeys(Keys.CONTROL, "a");

        datesInput.sendKeys(data);
        datesInput.sendKeys(Keys.ENTER, Keys.ESCAPE);

        return new HomePage(driver);
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;
    public HomePage clickOnYallaButtonOnHome() {
        click(yallaButton);
        return this;
    }

    @FindBy (id = "1")
    WebElement letCarWorkLink;

    public AddCarPage clickLetCarWork() {
        click(letCarWorkLink);
        return new AddCarPage(driver);
    }

}
