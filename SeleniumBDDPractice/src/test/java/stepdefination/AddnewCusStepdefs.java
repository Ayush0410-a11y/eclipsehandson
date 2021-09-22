package stepdefination;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageobject.AddCustomer;

public class AddnewCusStepdefs {

    AddCustomer addcust = new AddCustomer(Hooks.chromelauncher);
    @When("user clicks on customer main menu")
    public void userClicksOnCustomerMainMenu() throws InterruptedException {
        addcust.customerMainMenu();
        Thread.sleep(1000);
    }

    @And("user clicks on customers option")
    public void userClicksOnCustomersOption() throws InterruptedException {
        addcust.customerMenuItem();
        Thread.sleep(1000);
    }

    @Then("user should navigate to customer page {string}")
    public void userShouldNavigateToCustomerPage(String pagetittle) throws InterruptedException {
        String actualTittle = addcust.getPageTitle();
        Assert.assertEquals(actualTittle,pagetittle);
        Thread.sleep(1000);
    }

    @When("user clicks on Add new Button")
    public void userClicksOnAddNewButton() {
        addcust.addNewButton();
    }

    @Then("user should navigate to addnew customer page {string}")
    public void userShouldNavigateToAddnewCustomerPage(String pagetittle) throws InterruptedException {
        String actualTittle = addcust.getPageTitle();
        Assert.assertEquals(actualTittle,pagetittle);
        Thread.sleep(1000);
    }

    @When("user enter the new customers details")
    public void userEnterTheNewCustomersDetails() throws InterruptedException {
        addcust.setCompanyName("Ar org");
        addcust.addComment("this is practice");
        addcust.clickCheckBox();
        addcust.dateOfBirth("10/28/1996");
        addcust.selectGender("Male");
        addcust.setEmailId("raj21@gmail.com");
        addcust.setPassword("text123");
        addcust.setFirstName("Raj");
        addcust.setLastName("Shikhar");
        Thread.sleep(1000);
        addcust.setVendorManager("Vendor 2");
        addcust.setNewLetter("Test store 2");
        addcust.setCustomerRole("Vendors");


    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        addcust.clickSaveButton();
    }

    @Then("user should validate the message {string}")
    public void userShouldValidateTheMessage(String successfullyMessage) {
        String acutalMessage = addcust.getText();
        Assert.assertTrue(acutalMessage.contains(successfullyMessage));

    }
}
