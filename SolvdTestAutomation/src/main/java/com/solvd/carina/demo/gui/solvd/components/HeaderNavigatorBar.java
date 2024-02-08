package com.solvd.carina.demo.gui.solvd.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderNavigatorBar extends AbstractUIObject {

    @FindBy(xpath = "//*[@class='MuiBox-root mui-1c80o2h']")
    private ExtendedWebElement solvdIcon;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body3 mui-qwm6la' and text()='Services']")
    private ExtendedWebElement servicesButton;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body3 mui-4v521x' and text()='Cases']")
    private ExtendedWebElement casesButton;

    private ExtendedWebElement companyButton;

    private ExtendedWebElement innovationsButton;

    private ExtendedWebElement blogButton;

    public HeaderNavigatorBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickCasesButton () {
        casesButton.click();
    }
}
