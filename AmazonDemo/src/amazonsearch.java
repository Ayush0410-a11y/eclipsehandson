import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("pleae provide the url"); //amazon url link as per project requirment
		String weburl= scanner.next();
		System.out.println("pleae enter the product name: ");
		String productName =scanner.next();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HELLO\\Downloads\\chromedriver.exe");    
        WebDriver wb=new ChromeDriver();
        wb.manage().window().maximize();
        wb.manage().deleteAllCookies();
        wb.get(weburl);
       // wb.get("https://www.amazon.in/");
        WebElement searchBox=wb.findElement(By.cssSelector(("#twotabsearchtextbox")));
        //searchBox.sendKeys("Book");
        searchBox.sendKeys(productName);
        WebElement searchButton=wb.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();
        String productname1=wb.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
        System.out.println("1st product name: "+productname1);
        String productname2=wb.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).getText();
        System.out.println("2nd product name: "+productname2);
        Thread.sleep(2000);
        String productprice1 =wb.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        System.out.println("1st product price: "+productprice1);
        String productprice2 =wb.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
        System.out.println("2nd product price: "+productprice2);
        wb.close();

	}

}
