package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@aria-label='Open contact us form']")
    private ExtendedWebElement contactUsHomeButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage clickContactUsButton() {
        contactUsHomeButton.click();
        return new ContactUsPage(getDriver());
    }

}
