import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("pleae provide the url");
//		Scanner sc1 = new Scanner(System.in);
//		String weburl= sc1.next();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HELLO\\Downloads\\chromedriver.exe");
		//create an object for your drivers
		WebDriver wb = new ChromeDriver();
		//maximize the window
		wb.manage().window().maximize();
		//load the we page
		
		

		//wb.get("https://www.amazon.in/");
		wb.manage().window().maximize();
		wb.get("file:///C:/Users/HELLO/Desktop/alert.html");
		wb.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
		//wb.get("file:///C:/Users/HELLO/Desktop/alert.html");
        wb.manage().timeouts().implicitlyWait(400,TimeUnit.MILLISECONDS);
        wb.close();
        
        
//        wb.findElement(By.name("submit")).submit();
//        Thread.sleep(2000);
//        Alert al= wb.switchTo().alert();
//        String s=al.getText();
//        Thread.sleep(2000);
//        al.accept();

	}

}
