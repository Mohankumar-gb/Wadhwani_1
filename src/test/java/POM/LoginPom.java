package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPom {
	
		 WebDriver driver;
			
			public static WebElement username(WebDriver driver) {
				return driver.findElement(By.id("input_0"));
			}
			public static WebElement nextBtn(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/button"));
			
			}
			public static WebElement passKey(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"input_4\"]"));
			}
			public static WebElement confirmPassword(WebDriver driver) {
				return driver.findElement(By.id("input_5"));
}
			public static WebElement institutioncode(WebDriver driver) {
				return driver.findElement(By.id("input_2"));
			
}
			public static WebElement reentrymail(WebDriver driver) {
				return driver.findElement(By.id("input_3"));
			
			}
			public static WebElement selectLanguage(WebDriver driver) {
				
              return driver.findElement(By.id("select_6"));
				
			}
			public static WebElement eulaBox(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/div/md-checkbox/div[1]"));
			
			}		
			//*[@id="select_option_13"]//*[@id="select_option_13"]
			public static WebElement selectLanguage1(WebDriver driver) {
				return driver.findElement(By.id("select_option_12"));
			}
			public static WebElement eulaLink(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/div/div/a[1]"));			}
			

                      public static WebElement facultyforgotPAss(WebDriver driver) {
	
                      return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/div[2]"));
                      }

                      public static WebElement facultyPassword(WebDriver driver) {
	
                      return driver.findElement(By.id("password"));
                      }
                      
                      public static WebElement facultySigninButton(WebDriver driver) {
                    		
                          return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/button"));
                          }
                      
                      
                      
                      
                      
                      
                     
	}
