package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerSearch;
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement process;


    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
    }

    public void selectCustomerSearch(String searchValue) {

        selectFromDropDown(customerSearch, searchValue);

    }

    public void selectCurrency(String currencyType) {

        selectFromDropDown(currency,currencyType);
    }

    public void clickOnProcessButton() {

        clickOnElement(process);
    }

    public void verifyPopWindowTextAndAccept(String exp) {

        alertPopUpWindowAndVerifyText(exp);
    }


}