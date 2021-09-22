import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class UploadFile {
    public static void main(String[] args) throws IOException, InterruptedException, FindFailed {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HELLO\\Downloads\\chromedriver.exe");    
        WebDriver wb=new ChromeDriver();
        wb.manage().window().maximize();
        wb.get("https://www.google.com/");
//        wb.get("https://www.easyupload.io/");
//        wb.findElement(By.xpath("//*[@id=\"dropzone\"]/div/button")).click();
//        Thread.sleep(2000);
//        Runtime.getRuntime().exec("E:\\file.exe");
//        Thread.sleep(4000);
        Screen sc =new Screen();
        Pattern p1=new Pattern("C:\\Users\\HELLO\\Desktop\\find.png");
        Pattern p2=new Pattern("C:\\Users\\HELLO\\Desktop\\googlesearch.png");
        sc.type(p1,"amazon");
        sc.click(p2);
    //    wb.close();
    }
}
