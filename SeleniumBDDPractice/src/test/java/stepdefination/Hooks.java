package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pageobject.LaunchDriver;

public class Hooks {

    public static WebDriver chromelauncher = null;

    @Before
    public void launchChrome() throws InterruptedException {
        chromelauncher = new LaunchDriver().setChromeDriv();
        chromelauncher.manage().window().maximize();


    }

    @After
    public void closeChrome() throws InterruptedException {

        Thread.sleep(1000);
        chromelauncher.quit();
    }


}
