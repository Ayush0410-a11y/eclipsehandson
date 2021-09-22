package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchCustomer extends AddCustomer {
    By tableCusDetails = By.xpath("//table[@id='customers-grid']");
    By tableRow = By.xpath("//table[@id='customers-grid']/tbody/tr");
    By tableCol = By.xpath("//table[@id='customers-grid']/tbody/tr/td");
    By searchEmailId = By.xpath("//input[@id='SearchEmail']");
    By searchFirstName = By.xpath("//input[@id='SearchFirstName']");
    By searchLastName = By.xpath("//input[@id='SearchLastName']");
    By searchButton = By.xpath("//button[@id='search-customers']");


//    WebElement table= chromelauncher.findElement(tableRow);
//    int tablerows = table.findElements(By.xpath("tr")).size();


    public SearchCustomer(WebDriver chromelauncher) {
        super(chromelauncher);
    }

    public void setSearchEmailId(String emailId) {
        chromelauncher.findElement(searchEmailId).clear();
        sendkeys(searchEmailId, emailId);
    }

    public void setSearchFirstName(String firstName) {
        chromelauncher.findElement(searchFirstName).clear();
        sendkeys(searchFirstName, firstName);
    }

    public void setSearchLastName(String Lastname) {
        chromelauncher.findElement(searchLastName).clear();
        sendkeys(searchLastName, Lastname);
    }

    public int getrowsNumber() {
        return chromelauncher.findElements(tableRow).size();
    }

    public int getColNumber() {
        return chromelauncher.findElements(tableCol).size();

    }

    public Boolean searchCusByEmail(String Email) {
        Boolean flag = false;

        for (int i = 1; i <= getrowsNumber(); i++) {
            String emailID = chromelauncher.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(emailID);
            if(emailID.equals(Email)){
                flag= true;
                break;
            }


        }
                return flag;
    }

    public Boolean searchCusByName(String name) {
        Boolean flag = false;

        for (int i = 1; i <= getrowsNumber(); i++) {
            String _name = chromelauncher.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr[" + i + "]/td[3]")).getText();
            System.out.println(_name);
            String names[] = _name.split(" ");
            if(names[0].equals("Victoria") && names[1].equals("Terces")){
                flag= true;
                break;
            }


        }
        return flag;
    }

    public void clickSearchButton() {
        click(searchButton);
    }

}






