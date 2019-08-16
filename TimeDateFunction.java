package PracticePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeDateFunction extends CommandRepository {
	By D1 = By.id("d1");
	By M1 = By.id("m1");
	By Y1 = By.id("y1");
	By D2 = By.id("d2");
	By M2 = By.id("m2");
	By Y2 = By.id("y2");
	By Bt =By.id("subbut2");
	String url = "https://www.timeanddate.com/date/duration.html";
	
	public void DateCheckFn(WebDriver driver, String d1, String m1,String y1, String d2, String m2,String y2) {
		OpenWebPage(driver, url);
		InputFn(driver, D1, d1);
		InputFn(driver, M1, m1);
		InputFn(driver, Y1, y1);
		InputFn(driver, D2, d2);
		InputFn(driver, M2, m2);
		InputFn(driver, Y2, y2);			
		
	}
}
