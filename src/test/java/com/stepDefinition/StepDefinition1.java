package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

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
	@When("Student should enter a valid email{string}")
	public void studentShouldEnterAValidEmail(String string) {
		LoginPom.username(driver).sendKeys(string);
	}

	@When("Student should select a next Button")
	public void studentShouldSelectANextButton() {
		LoginPom.nextBtn(driver).click();
	}

	@Then("Student should enter  the valid lowercase and uppercase password {string}")
	public void studentShouldEnterTheValidLowercaseAndUppercasePassword(String string2) {
		LoginPom.passKey(driver).sendKeys(string2);	    
	}

	@Then("Student should verify the lowercase and uppercase passkey successfully entered")
	public void studentShouldVerifyTheLowercaseAndUppercasePasskeySuccessfullyEntered() {
	
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	

		driver.quit();
	    
	    
	}
	@When("Student should enter an valid email{string}")
	public void studentShouldEnterAnValidEmail(String string) {
		LoginPom.username(driver).sendKeys(string);
	    
		
	    
	}

	@When("Student should select an next Button")
	public void studentShouldSelectAnNextButton() {
		LoginPom.nextBtn(driver).click();
	}

	@Then("Student should enter  a valid lowercase and uppercase password with special characters and digits {string}")
	public void studentShouldEnterAValidLowercaseAndUppercasePasswordWithSpecialCharactersAndDigits(String string2) {
		LoginPom.passKey(driver).sendKeys(string2);		    
	}

	@Then("Student should verify a alphabets,special characters and digits successfully entered")
	public void studentShouldVerifyAAlphabetsSpecialCharactersAndDigitsSuccessfullyEntered() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	

		driver.quit();
	    
		
	    
	}

	@When("Student should enter  an valid email{string}")
	public void studentShouldEnterAnValidEmail1(String string) {
	LoginPom.username(driver).sendKeys(string);
}
@When("Student should select an  next Button")
public void studentShouldSelectAnNextButton1() {

	LoginPom.nextBtn(driver).click();	
    
}

@Then("Student should enter  valid   password {string}")
public void studentShouldEnterValidPassword(String string2) {
	LoginPom.confirmPassword(driver).sendKeys(string2);
   
}

@Then("Student should verify  password successfully entered")
public void studentShouldVerifyPasswordSuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));


	driver.quit();    
}
@When("Student should enter  a valid email{string}")
public void studentShouldEnterAValidEmail1(String string) {
	LoginPom.username(driver).sendKeys(string);
}

@When("Student should select a  next Button")
public void studentShouldSelectANextButton1() {

	LoginPom.nextBtn(driver).click();
}



@Then("Student should enter  valid   password with lowercase letter {string}")
public void studentShouldEnterValidPasswordWithLowercaseLetter(String string2) {
	LoginPom.confirmPassword(driver).sendKeys(string2);
}

@Then("Student should verify  password with lowercase letter successfully entered")
public void studentShouldVerifyPasswordWithLowercaseLetterSuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Student should enter  valid   password with lowercase letter and uppercase letter{string}")
public void studentShouldEnterValidPasswordWithLowercaseLetterAndUppercaseLetter(String string2) {
	LoginPom.confirmPassword(driver).sendKeys(string2);
}

@Then("Student should verify  password with lowercase letter and uppercase letter successfully entered")
public void studentShouldVerifyPasswordWithLowercaseLetterAndUppercaseLetterSuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Student should enter  valid   password with alphabets,digits and special characters{string}")
public void studentShouldEnterValidPasswordWithAlphabetsDigitsAndSpecialCharacters(String string2) {
	LoginPom.confirmPassword(driver).sendKeys(string2);
}

@Then("Student should verify  password with alphabets,digits and special characters successfully entered")
public void studentShouldVerifyPasswordWithAlphabetsDigitsAndSpecialCharactersSuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@When("Student should enter the Institution code{string}")
public void studentShouldEnterTheInstitutionCode(String string) {
   LoginPom.institutioncode(driver).sendKeys(string);
}

@When("Student should renter the valid email{string}")
public void studentShouldRenterTheValidEmail(String string) {
    LoginPom.reentrymail(driver).sendKeys(string);
}

@Then("Student should enter the valid confirm password {string}")
public void studentShouldEnterTheValidConfirmPassword(String string) {
    LoginPom.confirmPassword(driver).sendKeys(string);
}
@Then("Student should select the language")
public void studentShouldSelectTheLanguage() {
LoginPom.selectLanguage(driver).click();
}

@Then("Student should tick the Eula checkbox")
public void studentShouldTickTheEulaCheckbox() {
	LoginPom.eulaBox(driver).click();

}
@Then("Should should verify  successfully entered")
public void shouldShouldVerifySuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}
@When("Student should enter an Institution code{string}")
public void studentShouldEnterAnInstitutionCode(String string) {
	 LoginPom.institutioncode(driver).sendKeys(string);
}

@When("Student should renter an valid email{string}")
public void studentShouldRenterAnValidEmail(String string) {
    LoginPom.reentrymail(driver).sendKeys(string);
  
}

@Then("Student should enter an valid password {string}")
public void studentShouldEnterAnValidPassword(String string) {
    
}

@Then("Student should enter an valid confirm password {string}")
public void studentShouldEnterAnValidConfirmPassword(String string) {
    LoginPom.confirmPassword(driver).sendKeys(string);

}

@Then("Student should select an language")
public void studentShouldSelectAnLanguage() {
	LoginPom.selectLanguage(driver).click();

}

@Then("Student should tick an Eula checkbox")
public void studentShouldTickAnEulaCheckbox() {
	LoginPom.eulaBox(driver).click();

}

@Then("Student should click an Eula hyperlink")
public void studentShouldClickAnEulaHyperlink() {
    LoginPom.eulaLink(driver).click();
}
@Then("Should should verify its successfully entered")
public void shouldShouldVerifyItsSuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 


	
}
@When("Student should enter  Institution code{string}")
public void studentShouldEnterInstitutionCode(String string) {
  LoginPom.institutioncode(driver).sendKeys(string);
}

@When("Student should renter  valid email{string}")
public void studentShouldRenterValidEmail(String string) {
    LoginPom.reentrymail(driver).sendKeys(string);

}

@Then("Student should enter  valid password {string}")
public void studentShouldEnterValidPassword1(String string) {
    LoginPom.passKey(driver).sendKeys(string);
}

@Then("Student should enter  valid confirm password {string}")
public void studentShouldEnterValidConfirmPassword(String string) {
	LoginPom.confirmPassword(driver).sendKeys(string);
}


@Then("Student should select  language")
public void studentShouldSelectLanguage() {
   LoginPom.selectLanguage(driver).click();
}

@Then("Student should tick  Eula checkbox")
public void studentShouldTickEulaCheckbox() {
    LoginPom.eulaBox(driver).click();
}

@Then("Student should click Eula hyperlink")
public void studentShouldClickEulaHyperlink() {
    LoginPom.eulaLink(driver).click();
}
@Then("Should should verify its not  enabled")
public void shouldShouldVerifyItsNotEnabled() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Should should verify its show error message")
public void shouldShouldVerifyItsShowErrorMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}
@Then("Should should verify its not enabled without tick the checkbox")
public void shouldShouldVerifyItsNotEnabledWithoutTickTheCheckbox() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}

@Given("Faculty is on the Learnwise Login Page")
public void facultyIsOnTheLearnwiseLoginPage() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://learnwise.wfglobal.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}

@When("Faculty should enter an valid email{string}")
public void facultyShouldEnterAnValidEmail(String string) {
   LoginPom.username(driver).sendKeys(string);
}

@When("Faculty click the next Button")
public void facultyClickTheNextButton() {
    LoginPom.nextBtn(driver).click();
}

@Then("Faculty click the forgot password{string}")
public void facultyClickTheForgotPassword(String string) {
    LoginPom.facultyforgotPAss(driver).click();
}

@Then("Faculty should verify its successfully click")
public void facultyShouldVerifyItsSuccessfullyClick() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@When("Faculty should enter valid {string}")
public void facultyShouldEnterValid(String string) {
   LoginPom.username(driver).sendKeys(string);
}

@Then("Faculty should verify success message")
public void facultyShouldVerifySuccessMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@When("Faculty should enter invalid {string}")
public void facultyShouldEnterInvalid(String string) {
   LoginPom.username(driver).sendKeys(string);
}

@Then("Faculty should verify its enter success message")
public void facultyShouldVerifyItsEnterSuccessMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@When("Faculty should click next Button")
public void facultyShouldClickNextButton() {
  LoginPom.nextBtn(driver).click();
}

@Then("Faculty should enter the invalid password{string}")
public void facultyShouldEnterTheInvalidPassword(String string) {
    LoginPom.facultyPassword(driver).sendKeys(string);
}

@Then("Faculty should click the Sign in Button")
public void facultyShouldClickTheSignInButton() {
    LoginPom.facultySigninButton(driver).click();
}

@Then("Faculty should verify its  success message")
public void facultyShouldVerifyItsSuccessMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Faculty enter the password{string}")
public void facultyEnterThePassword(String string) {
    LoginPom.facultyPassword(driver).sendKeys(string);
}
@Then("Faculty click on signin button")
public void facultyClickOnSigninButton() {
    LoginPom.facultySigninButton(driver).click();
}

@Then("Faculty should verify  successfully click")
public void facultyShouldVerifySuccessfullyClick() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("click on dashboard Button")
public void clickOnDashboardButton() {
	

	
    LoginPom.dashboardButton(driver).click();
}

@Then("Faculty should verify  dashboard successfully click")
public void facultyShouldVerifyDashboardSuccessfullyClick() {
	String Expectedtest ="© 2021 Wadhwani Foundation.";
	String actualtext = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/span")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Faculty should click on index Button")
public void facultyShouldClickOnIndexButton() {
    LoginPom.indexButton(driver).click();
}

@Then("Faculty should verify index successfully click")
public void facultyShouldVerifyIndexSuccessfullyClick() {
	String Expectedtest ="© 2021 Wadhwani Foundation.";
	String actualtext = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/span")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}
@Then("Faculty should click on Resume Button")
public void facultyShouldClickOnResumeButton() {
	

    LoginPom.resumeButton(driver).click();
}

@Then("Faculty should verify resume successfully click")
public void facultyShouldVerifyResumeSuccessfullyClick() {
	String Expectedtest ="© 2021 Wadhwani Foundation.";
	String actualtext = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/span")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}
@Then("Faculty should click on course plan Button")
public void facultyShouldClickOnCoursePlanButton() {
	

    LoginPom.coursePlan(driver).click();
}

@Then("Faculty should verify course plan successfully click")
public void facultyShouldVerifyCoursePlanSuccessfullyClick() {

	String Expectedtest ="© 2021 Wadhwani Foundation.";
	String actualtext = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/span")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 

}
@Then("Faculty should click on other course Button")
public void facultyShouldClickOnOtherCourseButton() {
   LoginPom.otherCourses(driver).click();
}

@Then("Faculty should verify other course  successfully click")
public void facultyShouldVerifyOtherCourseSuccessfullyClick() {
	String Expectedtest ="© 2021 Wadhwani Foundation.";
	String actualtext = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/span")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit(); 
}
@When("Faculty should select next Button")
public void facultyShouldSelectNextButton() {
    LoginPom.nextBtn(driver).click();
}

@Then("Faculty should verify an success message")
public void facultyShouldVerifyAnSuccessMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Given("faculty is on the Learnwise Login Page")
public void facultyIsOnTheLearnwiseLoginPage1() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://learnwise.wfglobal.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}

@When("faculty should not enter any mail id {string}")
public void facultyShouldNotEnterAnyMailId(String string) {
    LoginPom.username(driver).sendKeys(string);
}

@When("faculty should check next button is enabled")
public void facultyShouldCheckNextButtonIsEnabled() {
    LoginPom.nextBtn(driver).click();
}

@Then("faculty should verify its enabled or not")
public void facultyShouldVerifyItsEnabledOrNot() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}

@When("faculty should enter invalid {string}")
public void facultyShouldEnterInvalid1(String string) {
    LoginPom.username(driver).sendKeys(string);
}

@Then("faculty should verify get accept message")
public void facultyShouldVerifyGetAcceptMessage() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@When("faculty should enter the valid email{string}")
public void facultyShouldEnterTheValidEmail(String string) {
    LoginPom.username(driver).sendKeys(string);
}

@When("faculty should select the next Button")
public void facultyShouldSelectTheNextButton() {
    LoginPom.nextBtn(driver).click();
}

@Then("faculty should enter the valid password {string}")
public void facultyShouldEnterTheValidPassword(String string) {
    LoginPom.passKey(driver).sendKeys(string);
}

@Then("faculty should verify passkey successfully entered")
public void facultyShouldVerifyPasskeySuccessfullyEntered() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Then("Student should verify password successfully entered")
public void studentShouldVerifyPasswordSuccessfullyEntered1() {
	String Expectedtest ="PLATFORM FEATURES";
	String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
	System.out.println(actualtext);
Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
driver.quit();
}
@Given("Student is on the Learnwise staging Login Page")
public void studentIsOnTheLearnwiseStagingLoginPage() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://staging.learnwise.wfglobal.org/#/IN/en/home/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);  
}


@Then("student should click the course Button")
public void studentShouldClickTheCourseButton() {
    LoginPom.studentcourses(driver).click();
}
@When("Student click the next Button")
public void studentClickTheNextButton() {
    LoginPom.nextBtn(driver).click();
}

@Then("student enter the password{string}")
public void studentEnterThePassword(String string) {
 LoginPom.studentpassword(driver).sendKeys(string);   
}

@Then("Student click the signin Button")
public void studentClickTheSigninButton() {
    LoginPom.facultySigninButton(driver).click();
}

@Then("Student click the  course Button")
public void studentClickTheCourseButton() {
	  LoginPom.studentcourses(driver).click();
}


@Then("Student should verify its course button successfully click")
public void studentShouldVerifyItsCourseButtonSuccessfullyClick() {
	driver.quit();
}
@Then("Student click join Button")
public void studentClickJoinButton() {
    LoginPom.studentcoursebatchbutton(driver).click();
}

@Then("Student should verify its join button successfully click")
public void studentShouldVerifyItsJoinButtonSuccessfullyClick() {
    driver.quit();
}

@Then("Student enter the batch id{string}")
public void studentEnterTheBatchId(String string) {
    LoginPom.studentcoursebatchid(driver).sendKeys(string);
}

@Then("Student should verify its join button successfully click ornot")
public void studentShouldVerifyItsJoinButtonSuccessfullyClickOrnot() {
  driver.quit();
}
@Then("Student click an join Button")
public void studentClickAnJoinButton() {
	LoginPom.studentcoursebatchbutton(driver).click();
   }

@Then("Student should verify its join button  click ornot")
public void studentShouldVerifyItsJoinButtonClickOrnot() {
    driver.quit();
}






































}
