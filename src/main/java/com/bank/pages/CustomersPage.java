package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessfully;
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withDrawlTeb;
    @FindBy(xpath = "//input[@type='number']")
    WebElement withDrawlAmount;
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withDrawlButton;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withDrawlSuccessfully;

    public void clickOnDeposit() {
        clickOnElement(deposit);
    }

    public void enterAmount100(String amountEnter) {
        sendTextToElement(amount, amountEnter);
    }

    public void clickOnDepositButtonLast() {
        clickOnElement(depositButton);
    }

    public void verifyDepositSuccessfully(String exp) {
        verifyPage(exp, depositSuccessfully);

    }

    public void clickOnWithDrawl() {
        clickOnElement(withDrawlTeb);
    }

    public void enterWithDrawlAmount50(String wdAmount) throws InterruptedException {
        Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //  wait.until(ExpectedConditions.visibilityOf(withDrawlAmount));
        // wait.until(ExpectedConditions.elementToBeClickable(withDrawlAmount));
        sendTextToElement(withDrawlAmount, wdAmount);
    }

    public void clickOnWithdrawButton() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        // wait.until(ExpectedConditions.visibilityOf(withDrawlButton));
        //wait.until(ExpectedConditions.elementToBeClickable(withDrawlButton));
        // waitUntilVisibilityOfElementLocated((By) withDrawlButton, 15);
        clickOnElement(withDrawlButton);
    }

    public void verifyWithdrawSuccessfully(String expWdMsg) {
        // waitUntilVisibilityOfElementLocated((By) withDrawlSuccessfully, 15);
        verifyPage(expWdMsg, withDrawlSuccessfully);
    }


}