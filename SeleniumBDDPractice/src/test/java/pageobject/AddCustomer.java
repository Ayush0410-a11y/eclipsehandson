package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer extends CommereceLoginPage{
    //Customers / nopCommerce administration
    //Add a new customer / nopCommerce administration
    By _customersMainMenu = By.xpath("//a[@href='#' and @class='nav-link']//p[contains(text(),'Customers')]");
    By _customerMenuItem = By.xpath("//a[@href='/Admin/Customer/List' and @class='nav-link']//p[contains(text(),'Customers')]");
    By _addNewButton = By.xpath("//a[@class='btn btn-primary']");
    By newEmailId = By.xpath("//input[@id='Email']");
    By newPassword = By.xpath("//input[@id='Password']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By genderMale = By.xpath("//input[@id='Gender_Male' and @type='radio']");
    By genderFemale = By.xpath("//input[@id='Gender_Female' and @type='radio']");
    By textDOB = By.xpath("//input[@id='DateOfBirth' and @type='text']");
    By companyName = By.xpath("//input[@id='Company' and @type='text']");
    By isTaxEmptyCheck = By.xpath("//input[@id='IsTaxExempt' and @type='checkbox']");
    By newLetter = By.xpath("(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[1]");
    By customerRole =By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
    By managerOfVendor = By.xpath("//select[@id='VendorId']");
    By adminComment = By.xpath("//textarea[@id='AdminComment']");
    By saveButton = By.xpath("//button[@type='submit' and @name='save']");
    By storeName_newsLetter = By.xpath("//li[@class='k-item' and contains(text(),'Your store name')]");
    By testStore_newsLetter = By.xpath("//li[@class='k-item' and contains(text(),'Test store 2')]");
    By role_Administrators = By.xpath("//li[@role='option' and contains(text(),'Administrators')]");
    By role_ForumModerators= By.xpath("//li[@role='option' and contains(text(),'Forum Moderators')]");
    By role_Guests = By.xpath("//li[@role='option' and contains(text(),'Guests')]");
    By role_Registered = By.xpath("//li[@role='option' and contains(text(),'Registered')]");
    By role_Vendor = By.xpath("//li[@role='option' and contains(text(),'Vendors')]");

    public AddCustomer(WebDriver chromelauncher) {
        super(chromelauncher);
    }

    public void customerMainMenu(){
        click(_customersMainMenu);
    }
    public void customerMenuItem(){
        click(_customerMenuItem);
    }
    public void addNewButton(){
        click(_addNewButton);
    }
    public void setEmailId(String emailId){
        sendkeys(newEmailId, emailId);
    }
    public void setPassword(String password){
        sendkeys(newPassword, password);
    }
    public void setFirstName(String _firstName){
        sendkeys(firstName, _firstName);
    }
    public void setLastName(String _lastName){
        sendkeys(lastName, _lastName);
    }
    public void selectGender(String gender){
        if(gender.equals("Male")){
            click(genderMale);
        }
        else if(gender.equals("Female")){
            click(genderFemale);
        }
        else{
            click(genderMale);
        }
    }
    public void dateOfBirth(String DOB){
        sendkeys(textDOB, DOB);
    }
    public void setCompanyName(String _companyName){
        sendkeys(companyName, _companyName);
    }

    public void clickCheckBox(){
        click(isTaxEmptyCheck);
    }

    public void setNewLetter(String storeName) throws InterruptedException {
        click(newLetter);
        Thread.sleep(1000);
        WebElement listItem = null;
        if(storeName.equals("Your store name")){
            listItem= chromelauncher.findElement(storeName_newsLetter);
        }
        else if(storeName.equals("Test store 2")){
            listItem = chromelauncher.findElement(testStore_newsLetter);
        }
        listItem.click();
        Thread.sleep(1000);
    }
    public void setCustomerRole(String role) throws InterruptedException {
       click(customerRole);
       Thread.sleep(1000);
        WebElement listItem = switch (role) {
            case "Administrators" -> chromelauncher.findElement(role_Administrators);
            case "Forum Moderators" -> chromelauncher.findElement(role_ForumModerators);
            case "Guests" -> chromelauncher.findElement(role_Guests);
            case "Registered" -> chromelauncher.findElement(role_Registered);
            case "Vendors" -> chromelauncher.findElement(role_Vendor);
            default -> null;
        };
        listItem.click();
        Thread.sleep(1000);

    }
    public void setVendorManager(String value){
        Select dropdown = new Select(chromelauncher.findElement(managerOfVendor));
        dropdown.selectByVisibleText(value);
    }

    public void addComment(String comment) {
        sendkeys(adminComment, comment);
    }
    public void clickSaveButton(){
        click(saveButton);
    }



}
