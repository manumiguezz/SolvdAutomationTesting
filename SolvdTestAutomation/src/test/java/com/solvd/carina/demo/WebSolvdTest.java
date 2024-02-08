package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.solvd.pages.HomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;

public class WebSolvdTest implements IAbstractTest {

    @Test
    public void contactUsTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        homePage.clickContactUsButton();
    }
}
