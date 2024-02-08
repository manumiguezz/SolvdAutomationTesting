package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends AbstractPage {

    @FindBy(xpath = "//*[@placeholder='Search']")
    private ExtendedWebElement searchInputField;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public void typeSearchText (String searchText) {
        searchInputField.type(searchText);
    }
}
