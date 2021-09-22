import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonproduct {
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
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
        Connection con=DBConnection.getConnection();
        String product_name = productname1;
        String productprice = productprice1;
        String sql="insert into productinfo values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, product_name);
		ps.setString(2, productprice);
		int i=ps.executeUpdate();
		 String product_name1 = productname2;
	     String product_price = productprice2;
	        String sql1="insert into productinfo values(?,?)";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setString(1, product_name1);
			ps1.setString(2, product_price);
			int j=ps1.executeUpdate();
		
		if(i>0) {
		System.out.println("insertion is done");
	}
	else {
		System.out.println("insertion is not done");
	}
		if(j>0) {
			System.out.println("insertion is done");
		}
		else {
			System.out.println("insertion is not done");
		}
		ps.close();
		ps1.close();
		
		String retrivesql="select * from productinfo";
		PreparedStatement rsl=con.prepareStatement(retrivesql);
		ResultSet rs=rsl.executeQuery();
		boolean status=false;
		while(rs.next()) {
			String sqlproductname=rs.getString("product_name");
			String sqlproductprice=rs.getString("productprice");

			
			
			System.out.println("product name :  "+sqlproductname);
			System.out.println("product price : "+sqlproductprice);

			
			
			if(sqlproductname.equals(product_name)&&sqlproductprice.equals(productprice))
			{
				System.out.println("test case passed");
				status=true;
				break;
			}
			System.out.println("test case passed");
		}
		
		if(status==false) {
			System.out.println("testcase failed");
		}
		con.close();
        

	}

}
