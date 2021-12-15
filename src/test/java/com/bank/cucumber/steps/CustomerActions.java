package com.bank.cucumber.steps;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerActions {
    @When("^User clicks on customer login tab$")
    public void userClicksOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^User search for customer from dropdown <\"([^\"]*)\">$")
    public void userSearchForCustomerFromDropdown(String value) {
        new CustomerLoginPage().searchCustomerFromDropDown(value);
    }

    @And("^User click on login button$")
    public void userClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @And("^User should see logout button and logout successfully<\"([^\"]*)\">$")
    public void userShouldSeeLogoutButtonAndLogoutSuccessfully(String exp) {
        new CustomerLoginPage().verifyLogoutTabAndClickOnLogoutPage(exp);
    }

    @Given("^Given User is on homepage$")
    public void givenUserIsOnHomepage() {
    }

    @And("^User click on deposit money tab$")
    public void userClickOnDepositMoneyTab() {
        new CustomersPage().clickOnDeposit();
    }

    @And("^User enter amount <\"([^\"]*)\">$")
    public void userEnterAmount(String amount) {
        new CustomersPage().enterAmount100(amount);
    }

    @Then("^User should see money deposited successfully message$")
    public void userShouldSeeMoneyDepositedSuccessfullyMessage() {
        new CustomersPage().verifyDepositSuccessfully("Deposit Successful");
    }

    @And("^User click on deposit amount button$")
    public void userClickOnDepositAmountButton() {
        new CustomersPage().clickOnDepositButtonLast();
    }

    @And("^User should click on withdrawal tab$")
    public void userShouldClickOnWithdrawalTab() {
        new CustomersPage().clickOnWithDrawl();
    }

    @And("^User enter withdraw amount <\"([^\"]*)\">$")
    public void userEnterWithdrawAmount(String wdAmount) throws InterruptedException {
        new CustomersPage().enterWithDrawlAmount50(wdAmount);
    }

    @And("^User click on withdraw button$")
    public void userClickOnWithdrawButton() {
        new CustomersPage().clickOnWithdrawButton();
    }

    @Then("^User should see withdrawal successful message$")
    public void userShouldSeeWithdrawalSuccessfulMessage() {
        new CustomersPage().verifyWithdrawSuccessfully("Transaction successful");
    }


}

