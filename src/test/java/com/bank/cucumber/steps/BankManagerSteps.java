package com.bank.cucumber.steps;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankManagerSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^User clicks on Bank Manager Login Tab$")
    public void userClicksOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogin();
    }

    @And("^User click on add customer tab$")
    public void userClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^User enter firstame <\"([^\"]*)\">$")
    public void userEnterFirstame(String fName) {
        new AddCustomerPage().fillFistName(fName);
    }

    @And("^User enter lastname <\"([^\"]*)\">$")
    public void userEnterLastname(String lName) {
        new AddCustomerPage().fillLastName(lName);
    }

    @And("^User enter postcode <\"([^\"]*)\">$")
    public void userEnterPostcode(String postcode) {
        new AddCustomerPage().fillPostCode("SE75TB");
    }

    @And("^User click on add customer button$")
    public void userClickOnAddCustomerButton() {
        new AddCustomerPage().addCustomerButton();
    }

    @Then("^User should see customer added successfully message$")
    public void userShouldSeeCustomerAddedSuccessfullyMessage() {
    }

    @And("^User should accept alert$")
    public void userShouldAcceptAlert() {
        new AddCustomerPage().verifyPopUpWindowAndClick("Customer added successfully with customer id :6");
    }

    @And("^User click on home button$")
    public void userClickOnHomeButton() {
        new HomePage().clickOnHomeButton();
    }

    @And("^User select customer search <\"([^\"]*)\">$")
    public void userSelectCustomerSearch(String searchValue)  {
        new AccountPage().selectCustomerSearch("6");
    }

    @And("^User select currency <\"([^\"]*)\">$")
    public void userSelectCurrency(String currency)  {
        new AccountPage().selectCurrency("Pound");
    }

    @And("^User click on process button$")
    public void userClickOnProcessButton() {
        new AccountPage().clickOnProcessButton();
    }

    @Then("^User should see customer account details <\"([^\"]*)\">$")
    public void userShouldSeeCustomerAccountDetails(String expectedText)  {
        new AccountPage().verifyPopWindowTextAndAccept(expectedText);
    }

    @And("^User clicks on open account tab$")
    public void userClicksOnOpenAccountTab() {
        new AccountPage().clickOnOpenAccount();
    } }