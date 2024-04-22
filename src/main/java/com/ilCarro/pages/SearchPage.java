package com.ilCarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".car-img-container"
    )
    List<WebElement> imagesOfCar;

    public SearchPage isImagesDisplayed() {
        pause(1000);
        assert !imagesOfCar.isEmpty();
        return this;
    }
}
