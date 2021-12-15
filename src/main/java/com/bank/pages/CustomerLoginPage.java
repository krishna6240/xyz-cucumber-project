package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginButton;
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement logOut;

    public void searchCustomerFromDropDown(String value) {
        selectFromDropDown(searchCustomer, value);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void verifyLogoutTabAndClickOnLogoutPage(String exp) {
        Boolean isDisplay = driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
        if (isDisplay) {
            verifyPage(exp, logOut);
        } else {
            System.out.println("logOut tab is not display");
        }
    }


}