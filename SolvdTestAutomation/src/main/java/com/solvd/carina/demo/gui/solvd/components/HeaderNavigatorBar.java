package com.solvd.carina.demo.gui.solvd.components;

import com.solvd.carina.demo.gui.solvd.pages.BlogPage;
import com.solvd.carina.demo.gui.solvd.pages.CasesPage;
import com.solvd.carina.demo.gui.solvd.pages.ContactUsPage;
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

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body3 mui-4v521x' and text()='Company']")
    private ExtendedWebElement companyButton;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body3 mui-4v521x' and text()='Innovations']")
    private ExtendedWebElement innovationsButton;

    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body3 mui-4v521x' and text()='Blog']")
    private ExtendedWebElement blogButton;

    @FindBy(xpath = "//*[@aria-label='Open contact us form']")
    private ExtendedWebElement contactUsButton;

    public HeaderNavigatorBar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CasesPage clickCasesButton () {
        casesButton.click();
        return new CasesPage(getDriver());
    }

    public BlogPage clickBlogButton () {
        blogButton.click();
        return new BlogPage(getDriver());
    }

    public ContactUsPage clickContactUsButton () {
        contactUsButton.click();
        return new ContactUsPage(getDriver());
    }
}
