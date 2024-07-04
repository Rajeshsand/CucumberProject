package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	 
	public static WebDriver driver;
	public static Actions a;
	
	public static void launchBrowser(String browser) {
		
		if (browser=="Chrome") {	
	     driver = new ChromeDriver();   
		}
		
		else if (browser.equals("edge")) {	
		 driver = new EdgeDriver();
		}
		
		else {	
	     driver = new SafariDriver();
		}	
	}
	
	public static void maxiWindow() {
		
		 driver.manage().window().maximize();
      
	}
	
	public static void getPageUrl() {
		
		 driver.getCurrentUrl();
		
		
	}
	public static void launchUrl(String url) {
		
		  driver.get(url);
		
		
		}
	
	public static void txtEnter(WebElement s , String v) {
		
		s.sendKeys(v);
		
	}
	
    public static void btnClick(WebElement btn) {
	   
    	btn.click();
}
    
    public static void dragDrop(WebElement s , WebElement t) {
		
    	a= new Actions(driver);
    	
    	a.dragAndDrop(s, t).perform();
	}
    
    public static void closeBrowser() {
		
    	driver.close(); 	
	}
    
    public static void doubleClick() {
		
    	a.doubleClick().perform();
    	
	}
    
//    public static String takeDataFromExcel(int rowNo,int cellNo,int sheetNo)throws Exception{
//    	
//    	String name;
//    	
//		File fi= new File("C:\\\\Users\\\\A\\\\eclipse-workspace\\\\MavenSample\\\\ExcelFiles\\\\Book1.xlsx");
//		
//		FileInputStream is = new FileInputStream(fi);
//		
//		Workbook work = new XSSFWorkbook(is);
//		
//		Sheet s = work.getSheetAt(sheetNo);
//		
//		Row r = s.getRow(rowNo);
//		
//		Cell c = r.getCell(cellNo);	
//				
//			int ct = c.getCellType();
//			
//			if (ct==1) {
//				
//				 name = c.getStringCellValue();
//				
//			}
//			
//			else if (DateUtil.isCellDateFormatted(c)) {
//				
//				Date da = c.getDateCellValue();
//				
//				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yy");
//				 name = sim.format(c);
//				
//				
//			}
//			
//			else {
//				
//				double dou = c.getNumericCellValue();
//				
//				long l = (long)dou;
//				
//				 name = String.valueOf(l);
//				
//				
//			}
//			
//			
//	        return name;
//			
//    }
    
    
    
        
				
			
			
			

		
		
	}

