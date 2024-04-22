package com.ilCarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCarPage extends LoginPage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".ng-pristine:nth-child(1)")
    WebElement location;
    @FindBy(id = "make")
    WebElement manufacture;
    @FindBy(id = "model")
    WebElement model;
    @FindBy(id = "year")
    WebElement year;
    @FindBy(id = "fuel")
    WebElement fuel;
    @FindBy(id = "seats")
    WebElement seats;
    @FindBy(id = "class")
    WebElement carClass;
    @FindBy(id = "serialNumber")
    WebElement carRegistrationNumber;
    @FindBy(id = "price")
    WebElement price;

    @FindBy(id = "about")
    WebElement about;

    public AddCarPage enterDataOfCar(String city, String manufactureText, String modelText, String yearText, int fuelNumber, String seatsText, String classText, String serialNumber, String priceText, String aboutText) {
        type(location, city);
        pause(500);
        location.sendKeys(Keys.DOWN, Keys.ENTER);

        type(manufacture, manufactureText);
        type(model, modelText);
        type(year, yearText);

        click(fuel);
        for (int i = 0; i < fuelNumber; i++) {
            fuel.sendKeys(Keys.DOWN);
        }
        fuel.sendKeys(Keys.ENTER);

        type(seats,seatsText);

        type(carClass, classText);
        type(carRegistrationNumber, serialNumber);
        type(price, priceText);
        type(about, aboutText);

        return this;
    }

    @FindBy(css = ".file-input-label")
    WebElement fileInput;

    public AddCarPage uploadPhoto(String link) {
        fileInput.sendKeys(link);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submitButton;

    public AddCarPage clickOnSubmit() {
        click(submitButton);
        return this;
    }

    @FindBy(css = "h1")
    WebElement message;

    public AddCarPage verifySuccessMessageCar(String text) {
        assert message.getText().contains(text);
        return this;
    }
}
