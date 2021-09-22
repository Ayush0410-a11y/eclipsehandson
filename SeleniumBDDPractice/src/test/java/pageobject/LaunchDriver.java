package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {

    WebDriver driver= null;



    public WebDriver getDriver(){
        if(driver == null){
            setChromeDriv();
        }
        return driver;
    }


    public WebDriver setChromeDriv( ) {


        String projectFolderPath = System.getProperty("user.dir");
        String chromeDriverPath = projectFolderPath + "/Drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();

    }
    }







