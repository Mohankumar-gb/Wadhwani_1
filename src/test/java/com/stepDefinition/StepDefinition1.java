package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.LoginPom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition1 {
	WebDriver driver;
	@Given("Student is on the Learnwise Login Page")
	public void studentIsOnTheLearnwiseLoginPage() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    
	}

	@When("Student should enter valid {string}")
	public void studentShouldEnterValid(String string) {
		LoginPom.username(driver).sendKeys(string);
	}

	@When("Student should select next Button")
	public void studentShouldSelectnextButton() {
	  LoginPom.nextBtn(driver).click();
	}

	@Then("Student should verify success message")
	public void studentShouldVerifySuccessMessage() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("LOGIN Successful", Expectedtest.equals(actualtext));
	

		driver.quit();
	    	}
	@When("Student should not enter any mail id {string}")
	public void studentShouldNotEnterAnyMailId(String string) {
		LoginPom.username(driver).sendKeys(string);	    
	}

	@When("Student should check next button is enabled")
	public void studentShouldCheckNextButtonIsEnabled() {
		boolean enabled = LoginPom.nextBtn(driver).isEnabled();	
		if (enabled==true) {
			System.out.println("enable");
		}else
		System.out.println("not enable");
	}
	@Then("Student should verify its enabled or not")
	public void studentShouldVerifyItsEnabledOrNot() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("Not enable", Expectedtest.equals(actualtext));
	

		driver.quit();
	    
	}
	@When("Student should enter invalid {string}")
	public void studentShouldEnterInvalid(String string) {
		LoginPom.username(driver).sendKeys(string);	 
	}
	@Then("Student should verify get accept message")
	public void studentShouldVerifyGetAcceptMessage() {
		

			String Expectedtest ="PLATFORM FEATURES";
			String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
			System.out.println(actualtext);
	Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
		

			driver.quit();
		
	}
	
	@When("Student should enter the valid email{string}")
	public void studentShouldEnterTheValidEmail(String string) {
		LoginPom.username(driver).sendKeys(string);
	}

	@When("Student should select the next Button")
	public void studentShouldSelectTheNextButton() {
		LoginPom.nextBtn(driver).click();
	} 

	@Then("Student should enter the valid password {string}")
	public void studentShouldEnterTheValidPassword(String string2) {
		LoginPom.passKey(driver).sendKeys(string2);
	}

	@Then("Should should verify passkey successfully entered")
	public void shouldShouldVerifyPasskeySuccessfullyEntered() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("Not enable", Expectedtest.equals(actualtext));
	

		driver.quit();
		
	   
	}
	@When("Student should enter  valid email{string}")
	public void studentShouldEnterValidEmail(String string) {
		LoginPom.username(driver).sendKeys(string);
	    
	}

	@When("Student should select  next Button")
	public void studentShouldSelectNextButton() {
		LoginPom.nextBtn(driver).click();
	}

	@Then("Student should enter  valid  uppercase password {string}")
	public void studentShouldEnterValidUppercasePassword(String string2) {
		LoginPom.passKey(driver).sendKeys(string2);
	}

	@Then("Should should verify uppercase passkey successfully entered")
	public void shouldShouldVerifyUppercasePasskeySuccessfullyEntered() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	

		driver.quit();
	    
	}








	

}
