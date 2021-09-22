package stepdefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobject.CommereceLoginPage;

import java.util.Map;


public class LoginPagedefs {

    CommereceLoginPage loginPage = new CommereceLoginPage(Hooks.chromelauncher);

    @Given("user navigates the commerce site having tittle")
    public void user_navigates_the_commerce_site_having_tittle() {
        System.out.println("*********launching commerce site************");
        loginPage.geturl();

    }

    @Then("user validates the page {string}")
    public void userValidatesThePage(String pageTittle) {
        String actualTitle = loginPage.getPageTitle();
        Assert.assertEquals(actualTitle, pageTittle);

    }

    @And("user enter the usserid as {string} and password as {string}")
    public void userEnterTheUsseridAsAndPasswordAs(String _userid, String _password) throws InterruptedException {
        loginPage.setUserId(_userid);
        Thread.sleep(1000);
        loginPage.setUserPassword(_password);

    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        loginPage.loginButton();
        Thread.sleep(1000);
        String actualTitle = loginPage.getPageTitle();
      // Assert.assertEquals(actualTitle, "Dashboard / nopCommerce administration");
        String actualTittle = loginPage.getPageTitle();
        String actualText = loginPage.getText();
        String  expectedText= "Login was unsuccessful.";
        String expectedTittle = "Dashboard / nopCommerce administration";
        if(actualTittle.equals(expectedTittle)){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(actualText.contains(expectedText));
        }

    }

    @Then("user should be navigated to dashboard page {string}")
    public void userShouldBeNavigatedToDashboardPage(String pageTittle) {
       String actualTittle = loginPage.getPageTitle();
       Assert.assertEquals(actualTittle, pageTittle);

    }

    @And("enters following login details")
    public void entersFollowingLoginDetails(DataTable dataTable) {
        Map<String,String> dataMap =dataTable.asMap(String.class,String.class);

        String username= dataMap.get("username");
        String password= dataMap.get("password");

        loginPage.setUserId(username);
        loginPage.setUserPassword(password);

    }


}
