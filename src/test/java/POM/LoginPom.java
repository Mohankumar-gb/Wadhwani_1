package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPom {

	static WebDriver driver;

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("input_0"));
	}
	public static WebElement nextBtn(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/button"));

	}
	public static WebElement passKey(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='password']"));

	}
	public static WebElement courses(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@title='Courses']"));
	}
	public static WebElement signin(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
//	public static WebElement ClickOn_CreateBatch() {
//		return driver.findElement(By.xpath("//span[contains(text(),'Basic Course in Entrepreneurship')]//following::button[2]"));
//		
//	}
}
