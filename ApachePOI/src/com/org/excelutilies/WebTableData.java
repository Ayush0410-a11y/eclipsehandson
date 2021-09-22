package com.org.excelutilies;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HELLO\\Downloads\\chromedriver.exe");    
        WebDriver driver=new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
       
        
        System.out.println("***********chrome and excel operation starts*******************");
        
        
        String path =".\\Datafiles\\popluation.xlsx";
        ExcelOperation action = new ExcelOperation(path);
        action.setCellData("countrydata", 0, 0, "CountryName");
        action.setCellData("countrydata", 0, 1, "Region");
        action.setCellData("countrydata", 0, 2, "Population");
        action.setCellData("countrydata", 0, 3, "percenworld");
        action.setCellData("countrydata", 0, 4, "date_");
        action.setCellData("countrydata", 0, 5, "Source_finder");
        
        WebElement table= driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody"));
        int tablerows = table.findElements(By.xpath("tr")).size();
        
       // System.out.println(tablerows);
       
        
        for(int i=2;i<=tablerows;i++) {
        	String CountryName = table.findElement(By.xpath("tr["+i+"]/td[1]")).getText();
        //	System.out.println(CountryName);
        	String Region = table.findElement(By.xpath("tr["+i+"]/td[2]")).getText();
        	String Population = table.findElement(By.xpath("tr["+i+"]/td[3]")).getText();
        	String percentageOfWorld = table.findElement(By.xpath("tr["+i+"]/td[4]")).getText();
        	String Date = table.findElement(By.xpath("tr["+i+"]/td[5]")).getText();
        	String Source = table.findElement(By.xpath("tr["+i+"]/td[6]")).getText();
        	
        //	System.out.println(CountryName+"/"+Region+"/"+Population+"/"+percentageOfWorld+"/"+Date+"/"+Source);
        	
        	action.setCellData("countrydata", i-1, 0, CountryName);
            action.setCellData("countrydata", i-1, 1, Region);
            action.setCellData("countrydata", i-1, 2, Population);
            action.setCellData("countrydata", i-1, 3, percentageOfWorld);
            action.setCellData("countrydata", i-1, 4, Date);
            action.setCellData("countrydata", i-1, 5, Source);
        	
        }
        	   
        driver.close();	
        
        
        System.out.println("*****************Chrome and excel opreation ended*********************");
        System.out.println("********************sql operation start*************");
        
        
        Connection connectionToDB=DBConnection.getConnection();
        Statement stmt = connectionToDB.createStatement();
        
        String sqlstmt= "create table contrypouplations(CountryName varchar(200),\r\n"
        		+ "Region varchar(190), Population varchar(200),\r\n"
        		+ "percenworld varchar(190), date_ varchar(190),\r\n"
        		+ "source_finder varchar(300));";
        stmt.execute(sqlstmt);
        System.out.println("data insertion in db start");
        
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("countrydata");
        int rows = sheet.getLastRowNum();
        for(int r=1;r<=rows;r++) {
        	XSSFRow row_1 = sheet.getRow(r);
        	
        	String CountryName = row_1.getCell(0).getStringCellValue();
        	String Region = row_1.getCell(1).getStringCellValue();
        	String Population = row_1.getCell(2).getStringCellValue();
        	String percenworld = row_1.getCell(3).getStringCellValue();
        	String date_ = row_1.getCell(4).getStringCellValue();
        	String Source_finder = row_1.getCell(5).getStringCellValue();
        	
        	sqlstmt ="insert into contrypouplations values('"+CountryName+"','"+Region+"','"+Population+"','"+percenworld+"','"+date_+"','"+Source_finder+"') ";
        	stmt.execute(sqlstmt);
        	stmt.execute("commit");
        	
        }
        workbook.close();
        fis.close();
        connectionToDB.close();
        System.out.println("excel operation done");
        	
        }
                      
	}


