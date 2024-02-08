package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.solvd.pages.ContactUsPage;
import com.solvd.carina.demo.gui.solvd.pages.HomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class WebSolvdTest implements IAbstractTest {

    @Test
    public void contactUsTest() {
        HomePage homePage = new HomePage(getDriver());
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());

        homePage.open();
        homePage.clickContactUsButton();

        contactUsPage.clickGetInTouchWithUsButton();
        contactUsPage.typeFullName("Manuel Miguez");
        contactUsPage.typeEmail("manu@gmail.com");
        contactUsPage.typePhone("+54 11987654321");
        contactUsPage.typeMessage("I want to talk to Ivan");
        contactUsPage.clickPrivacyPolicyCheckBox();
//        commented part of test to not send anything
//        contactUsPage.clickSendFormButton();


    }
}
