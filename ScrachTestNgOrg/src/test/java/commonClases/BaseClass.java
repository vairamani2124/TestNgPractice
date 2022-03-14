package commonClases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LogInPage;

public class BaseClass {
	
	public static FileInputStream fis;
	
	public static Properties properties;
	
	
	public static WebDriver driver;
	
	
	
	public static List<String> li;
	public static List<String> li1;
	
	
	
	public void browserLaunch(String browser) throws IOException {
		
              
		
		
		
		if(browser.equalsIgnoreCase("chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
			
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
	
	}
	
	
	
	public void logIn(String userName, String passWord, String url) {
		
		driver.navigate().to(url);
		

		
		LogInPage lp=new LogInPage(driver);
		
		lp.getUserName().sendKeys(userName);
		lp.getPassWord().sendKeys(passWord);
		lp.getBtn().click();
		
		
			
			
		}

	
	public void propertyFileLoad() {
		
		try {
			 fis=new FileInputStream("config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 properties=new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public  void excelRead(String path) throws IOException {
		
		li=new ArrayList<String>();
		li1=new ArrayList<String>();
		
		
		
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		
		Workbook worbook=new XSSFWorkbook(fis);
		
		Sheet sheet = worbook.getSheetAt(0);
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		
		for(int i=1; i<physicalNumberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			int condition=2;
			for(int j=0; j<physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
			    
			    if(condition%2==0) {
			    	li.add(cell.getStringCellValue());
				
			    }
			    else {
			    	li1.add(cell.getStringCellValue());
			    	
			    }
				
			    condition++;
				}
			
			
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}
	}
