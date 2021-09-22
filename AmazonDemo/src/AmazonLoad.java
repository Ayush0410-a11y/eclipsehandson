import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//register webdriver
		System.out.println("pleae provide the url");
		Scanner sc1 = new Scanner(System.in);
		String weburl= sc1.next();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HELLO\\Downloads\\chromedriver.exe");
		//create an object for your drivers
		WebDriver wb = new ChromeDriver();
		//maximize the window
		wb.manage().window().maximize();
		//load the we page
		wb.get(weburl);
		

		//wb.get("https://www.amazon.in/");
		wb.manage().window().maximize();
		//webelements 
        wb.findElement(By.linkText("Start here.")).click();
        wb.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("abcdef");
       // wb.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).clear();
            
        String text=wb.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div/h1")).getText();
        System.out.println(text);
        
        wb.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("900000000");
        wb.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abcd@deA67");
        
        wb.findElement(By.xpath("//*[@id=\"continue\"]")).submit();
//        System.out.println(wb.getTitle());
//        System.out.println(wb.getCurrentUrl());
//      //navigate commands
//        wb.navigate().to("https://www.google.com/");
//        wb.navigate().back();
//        wb.navigate().forward();
//        wb.navigate().refresh();
//        wb.close();
//        wb.quit();
//		//for use our own file
//		//wb.get("file:///C:/Users/kkart/OneDrive/Desktop/demo.html");
//		wb.findElement(By.linkText("Start here.")).click();
//	    //wb.findElement(By.partialLinkText("Start")).click();
//	    //wb.findElement(By.id("ap_customer_name")).sendKeys("ayush");
//	    //wb.findElement(By.name("customerName")).sendKeys("ayush");
//	    //wb.findElement(By.name("input")).sendKeys("ayush");
//	    //wb.findElement(By.cssSelector("#ap_customer_name")).sendKeys("ayush	");
//	    wb.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("ayush");
//	    //drop down
//	    WebElement we=wb.findElement(By.name("subj"));
//	    Select sc=new Select(we);
//	    //sc.selectByIndex(2);
//	   // sc.selectByValue("c#");
//	    List<WebElement> list= sc.getOptions();
//	    int size=list.size();
//	    for(int i=0;i<size;i++) {
//	        System.out.println(list.get(i).getText());
//	    }
	    
	    
	  //  wb.close();
		

		
	}

}
