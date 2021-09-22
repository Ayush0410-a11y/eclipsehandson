package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommereceLoginPage {

    // url==https://admin-demo.nopcommerce.com/login
    By userid = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By loginButton = By.xpath("//button[@type='submit' and contains(text(),\"Log in\")]");

    WebDriver chromelauncher;
    String url = "https://admin-demo.nopcommerce.com/login";

    public CommereceLoginPage(WebDriver chromelauncher) {
        this.chromelauncher = chromelauncher;
    }

    public void click(By byObject){
        chromelauncher.findElement(byObject).click();
    }

    public void sendkeys(By byObject, CharSequence argo){
        chromelauncher.findElement(byObject).sendKeys(argo);
    }

    public void geturl() {
        chromelauncher.get(url);

    }

    public String getPageTitle() {
        return chromelauncher.getTitle();
    }

    public String setUserId(String _userid) {
        chromelauncher.findElement(userid).clear();
        chromelauncher.findElement(userid).sendKeys(_userid);
        return _userid;

    }

    public String setUserPassword(String _password) {
        chromelauncher.findElement(password).clear();
        chromelauncher.findElement(password).sendKeys(_password);
        return _password;
    }

    public void loginButton() {
        click(loginButton);

    }

    public String getText() {
        String message = chromelauncher.findElement(By.xpath("//body")).getText();
        return message;


    }
}




