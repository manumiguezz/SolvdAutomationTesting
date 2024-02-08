package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "//*[@aria-label='Scroll to contact form']")
    private ExtendedWebElement ScrollToContactFormButton;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }


}
