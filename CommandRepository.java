package PracticePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommandRepository {
	
	public void OpenWebPage(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public void InputFn(WebDriver driver, By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public void ClickFn(WebDriver driver, By element) {
		driver.findElement(element).click();
	}


}
