

public class Amezonload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//register webdriver
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HELLO\\Downloads\\chromedriver.exe");
//create an object for your drivers
WebDriver wb = new ChromeDriver();
//maximize the window
wb.manage().window().maximize();
//load the we page
wb.get("https://www.amazon.in/");

	}

}
