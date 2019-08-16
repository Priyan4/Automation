package PracticePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExecuteTest {
	
	TimeDateFunction tdf = new TimeDateFunction();
	WebDriver driver;
	
	@BeforeMethod
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver1.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="getData")
	public void TestDateFn(String d1, String m1, String y1, String d2, String m2, String y2) {
	 tdf.DateCheckFn(driver, d1, m1, y1, d2, m2, y2);
		
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();		
	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			new Object[] {"23","09","1993","13","08","2019"},
			new Object[] {"28","03","1997","13","08","2019"}
		};
	
	
}
}


