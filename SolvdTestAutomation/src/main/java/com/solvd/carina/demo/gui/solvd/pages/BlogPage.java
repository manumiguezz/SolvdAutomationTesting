package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends AbstractPage {

    @FindBy(xpath = "//*[@placeholder='Search']")
    private ExtendedWebElement searchInputField;

    @FindBy(xpath = "//*[@data-testid='CloseIcon']")
    private ExtendedWebElement clearInputFieldButton;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public void typeSearchText (String searchText) {
        searchInputField.type(searchText);
    }

    public boolean clearInputFieldButtonClickable() {
        return clearInputFieldButton.isClickable();
    }

    public void clickClearInputFieldButton () {
        clearInputFieldButton.click();
    }
}
