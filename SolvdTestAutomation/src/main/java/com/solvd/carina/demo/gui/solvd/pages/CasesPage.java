package com.solvd.carina.demo.gui.solvd.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CasesPage extends AbstractPage {

    @FindBy(xpath = "//*[@aria-label='Go to page 2']")
    private ExtendedWebElement goToPageTwoButton;

    @FindBy(xpath = "//*[@aria-label='Go to page 3']")
    private ExtendedWebElement goToPageThreeButton;

    @FindBy(xpath = "//*[@aria-label='Go to page 4']")
    private ExtendedWebElement goToPageFourButton;

    @FindBy(xpath = "//*[@aria-label='Go to next page']")
    private ExtendedWebElement goToNextPageButton;


    public CasesPage(WebDriver driver) {
        super(driver);
    }

    public void clickGoToPageTwoButton () {
        goToPageTwoButton.click();
    }
}
