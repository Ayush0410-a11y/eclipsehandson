import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expicitdemo {
	
	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\HELLO\\Downloads\\chromedriver.exe");    
	        WebDriver wb=new ChromeDriver();
	        wb.manage().window().maximize();
	        wb.manage().deleteAllCookies();
	        wb.get("https://www.amazon.in/");
	        //wb.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
	        wb.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
	        //wb.get("https://www.amazon.in/");
	        wb.findElement(By.linkText("Start here.")).click();
	        wb.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
	        wb.findElement(By.xpath("//*[@id=\"ap_customer_na")).sendKeys("ayush");
	        wb.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("aysuh@g.c");
	        wb.close();
	        //send(wb,name,2000,"abcd");
	        //send(wb,email,4000,"abcd@co.com");
	    }
	    //webdriver,webelement,expl timeout,value
//	    public static void send(WebDriver wd,WebElement we,int timeout,String value) {
//	    new WebDriverWait(wd, timeout).until(ExpectedConditions.visibilityOf(we));
//	    we.sendKeys(value);
//	    }
	}




