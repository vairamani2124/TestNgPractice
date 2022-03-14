package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonClases.BaseClass;

public class LoginTestCases extends BaseClass {
	

	
		
	@DataProvider(name="data1")
	public String[][] dataprovide() throws IOException  {
		
		propertyFileLoad();
		excelRead(properties.getProperty("path"));
				
		
	
		
		
		
       String[][]  data= {{li.get(0),li1.get(0)},
			{li.get(1),li1.get(1)},
			{li.get(2),li1.get(2)},
			{li.get(3),li1.get(3)},
	};
	
       return data;
	
	}
	
	
	@Test(dataProvider="data1")
	public void LoginTest(String uName, String pWord) throws IOException {
                  
		
		browserLaunch(properties.getProperty("browser"));
		
		
		logIn(uName, pWord,properties.getProperty("url"));
		
		
	}

}
