package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends AbstractPage {

    @FindBy(xpath = "//*[@aria-label='Scroll to contact form']")
    private ExtendedWebElement getInTouchWithUsButton;

    @FindBy(xpath = "//*[@aria-label='Full name']")
    private ExtendedWebElement fullNameInputField;

    @FindBy(xpath = "//*[@aria-label='Email']")
    private ExtendedWebElement emailInputField;

    @FindBy(xpath = "//*[@aria-label='Phone number']")
    private ExtendedWebElement phoneInputField;

    @FindBy(xpath = "//*[@aria-label='Message']")
    private ExtendedWebElement messageInputField;

    @FindBy(xpath = "//*[@name='checkboxPrivacy']")
    private ExtendedWebElement privacyPolicyCheckBox;

    @FindBy(xpath = "//*[@aria-label='Submit the form']")
    private ExtendedWebElement sendFormButton;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickGetInTouchWithUsButton () {
        getInTouchWithUsButton.click();
    }

    public void typeFullName (String fullName) {
        fullNameInputField.type(fullName);
    }

    public void typeEmail (String email) {
        emailInputField.type(email);
    }

    public void typePhone (String phone) {
        phoneInputField.type(phone);
    }

    public void typeMessage (String message) {
        messageInputField.type(message);
    }

    public void clickPrivacyPolicyCheckBox () {
        privacyPolicyCheckBox.click();
    }

    public void clickSendFormButton () {
        sendFormButton.click();
    }


}
