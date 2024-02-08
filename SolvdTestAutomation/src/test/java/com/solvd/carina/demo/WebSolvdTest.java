package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.solvd.components.HeaderNavigatorBar;
import com.solvd.carina.demo.gui.solvd.pages.BlogPage;
import com.solvd.carina.demo.gui.solvd.pages.CasesPage;
import com.solvd.carina.demo.gui.solvd.pages.ContactUsPage;
import com.solvd.carina.demo.gui.solvd.pages.HomePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebSolvdTest implements IAbstractTest {

    @Test(dataProvider = "SearchBlogData")
    @MethodOwner(owner = "manumiguezz")
    public void BlogPageTest(String searchText){
        HomePage homePage = new HomePage(getDriver());
        BlogPage blogPage = new BlogPage(getDriver());
        HeaderNavigatorBar headerNavigatorBar = homePage.getHeaderNavigatorBar();

        homePage.open();

        headerNavigatorBar.clickBlogButton();
        blogPage.typeSearchText(searchText);
    }

    @Test
    @MethodOwner(owner = "manumiguezz")
    public void CasesPageTest(){
        HomePage homePage = new HomePage(getDriver());
        CasesPage casesPage = new CasesPage(getDriver());
        HeaderNavigatorBar headerNavigatorBar = homePage.getHeaderNavigatorBar();

        homePage.open();

        headerNavigatorBar.clickCasesButton();
        casesPage.clickGoToPageTwoButton();
    }

    @Test(dataProvider = "ContactUsData")
    @MethodOwner(owner = "manumiguezz")
    public void contactUsPageTest(String fullName, String email, String phone, String message) {
        HomePage homePage = new HomePage(getDriver());
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        HeaderNavigatorBar headerNavigatorBar = homePage.getHeaderNavigatorBar();

        homePage.open();

        headerNavigatorBar.clickContactUsButton();

        contactUsPage.clickGetInTouchWithUsButton();
        contactUsPage.typeFullName(fullName);
        contactUsPage.typeEmail(email);
        contactUsPage.typePhone(phone);
        contactUsPage.typeMessage(message);
        contactUsPage.clickPrivacyPolicyCheckBox();
//        commented part of test to not send anything
//        contactUsPage.clickSendFormButton();

    }

    @DataProvider(name = "ContactUsData")
    public Object[][] contactUsDataProvider() {
        return new Object[][] {
                {"Manu", "manu@gmail.com", "114121431", "I want to talk to Ivan"},
                {"Ivan", "ivan@gmail.com", "413987874", "I want to talk to Manu"},
                {"Carlos", "carlos@gmail.com", "513213456", "I want to help solve"}
        };
    }

    @DataProvider(name = "SearchBlogData")
    public Object[][] searchBlogDataProvider() {
        return new Object[][] {
                {"QA"},
                {"Test Automation"},
                {"Mobile"}
        };
    }
}
