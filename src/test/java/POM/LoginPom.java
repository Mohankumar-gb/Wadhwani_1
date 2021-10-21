package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPom {
<<<<<<< HEAD

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
=======
	
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
                      
                      public static WebElement dashboardButton(WebDriver driver) {
                  		
                          return driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[1]/a"));
                          }
                      
                      
                      public static WebElement indexButton(WebDriver driver) {
                  		
                          return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]"));
                          } 
                  //    /html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a/div
                      public static WebElement resumeButton(WebDriver driver) {
                    		
                          return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a/div"));
                          } 
                      public static WebElement coursePlan(WebDriver driver) {
                  		
                          return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/a/div"));
                          } 
                      ///html/body/div[4]/div[2]/div[1]/div/div[2]/div/div[1]
	
public static WebElement otherCourses(WebDriver driver) {
		
    return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[2]/div/div[1]/div[5]/a/div"));
    } 
public static WebElement studentcourses(WebDriver driver) {
	
    return driver.findElement(By.xpath(" /html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[2]/a"));
    } 

public static WebElement studentpassword(WebDriver driver) {
	
    return driver.findElement(By.id("password"));
    } 
public static WebElement studentcoursebatchid(WebDriver driver) {
	
    return driver.findElement(By.id("batchUniqueID"));
    } 
public static WebElement studentcoursebatchbutton(WebDriver driver) {
	
    return driver.findElement(By.id("batchJoinButton"));
    } 
>>>>>>> 2cd53d93a05bc246d68a2c707b680ac689eb4f9f
}














