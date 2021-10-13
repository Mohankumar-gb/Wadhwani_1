package com.stepDefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
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






	//	============
	//	Courses Module
	//	Click on Course

	@Given("User should be in home page")
	public void userShouldBeInHomePage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();



	}

	@When("User should click on course")
	public void userShouldClickOnCourse() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(2000);

	}



	@Then("User should start the course")
	public void userShouldStartTheCourse() {
		driver.quit();
	}
	//======================

	//	 Click on create Batch and view details

	@Given("User should be in couRse")
	public void userShouldBeInCouRse() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("User should click on courses")
	public void userShouldClickOnCourses() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'CREATE NEW BATCH')]")).click();
		Thread.sleep(2000);
	}

	@Then("User should able to Create A Batch")
	public void userShouldAbleToCreateABatch() {
		driver.quit();


	}
	//=====================
	@Given("Be in course page")
	public void beInCoursePage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("click on create batch")
	public void clickOnCreateBatch() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'CREATE NEW BATCH')]")).click();
		driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("Batch111");
		driver.findElement(By.xpath("//input[@id='input_1']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='input_1']//following::button[1]")).click();
		driver.findElement(By.xpath("//td[@id='md-0-month-2021-9-14']")).click();
		driver.findElement(By.xpath(" //span[contains(text(),'CREATE')]")).click();
		Thread.sleep(6000);
	}

	@Then("Enter details to create batch")
	public void enterDetailsToCreateBatch() {
		driver.quit();
	}

	//	==============================

	@Given("User should be in home page on course")
	public void userShouldBeInHomePageOnCourse() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("User should click Create BATCH")
	public void userShouldClickCreateBATCH() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COPY BATCH')]")).click();
		Thread.sleep(3000);
	}

	@Then("Click on copy batch")
	public void clickOnCopyBatch() {
		driver.quit();
	}

	//	=========================
	@Given("User should be in course page")
	public void userShouldBeInCoursePage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("User should click Copy BATCH")
	public void userShouldClickCopyBATCH() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'COPY BATCH')]")).click();
		driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("Batch200");


	}

	@Then("Enter Batch deTails")
	public void enterBatchDeTails() {
		driver.quit();
	}

	//	
	@Given("User should be in coursepage")
	public void userShouldBeInCoursepage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("User should click on Start course")
	public void userShouldClickOnStartCourse() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
	}

	@Then("User should see coursedetails")
	public void userShouldSeeCoursedetails() {
		driver.quit();

	}


	@Given("User should be in course details page")
	public void userShouldBeInCourseDetailsPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("User should see the batch names in dropdown options")
	public void userShouldSeeTheBatchNamesInDropdownOptions() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		driver.findElement(By.xpath("//select[@id='user-batch-switch']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'FCV3_Shyamalima Testing')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(2000);


	}

	@Then("User should select other batch")
	public void userShouldSelectOtherBatch() {
		driver.quit();
	}

	@Given("Faculty should be in courses details")
	public void facultyShouldBeInCoursesDetails() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("click on mock test")
	public void clickOnMockTest() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();


		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement MockTest=driver.findElement(By.xpath("//span[contains(text(),'Mock Test')]"));
		js.executeScript("arguments[0].scrollIntoView();",MockTest);
		driver.findElement(By.xpath("//span[contains(text(),'Mock Test')]")).click();
		  

	}

	@Then("click on play button")
	public void clickOnPlayButton() throws Exception {
		driver.findElement(By.xpath("//span[@class='course_start_greter']")).click();
		Thread.sleep(3000); 
		driver.quit();
	}
	
	
	@Given("Faculty should be in Quizzes page")
	public void facultyShouldBeInQuizzesPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should click on quizzes")
	public void facultyShouldClickOnQuizzes() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
		
	}

	@Then("Faculty should able see the quizzes")
	public void facultyShouldAbleSeeTheQuizzes() {
	   driver.quit();
	}
	
	
	@Given("Faculty should be in Quizzespage")
	public void facultyShouldBeInQuizzespage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should click Quizzes")
	public void facultyShouldClickQuizzes() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
	}

	@Then("Faculty should click on take quizzes")
	public void facultyShouldClickOnTakeQuizzes() {
	  driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]")).click();
	  driver.quit();
	}
	
	@Given("Faculty should be in Quizz page")
	public void facultyShouldBeInQuizzPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should should take Quizz")
	public void facultyShouldShouldTakeQuizz() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
	}

	@Then("Faculty should click on view quizz Results")
	public void facultyShouldClickOnViewQuizzResults() throws Exception {
	   driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::a[2]")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[contains(text(),'FC-ENG-L1-Quiz  - Quiz Results')]//following::td[8]")).click();
	   driver.quit();
	}


	@Given("Faculty  dhould bein Quizzes")
	public void facultyDhouldBeinQuizzes() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should see th Practice Venture")
	public void facultyShouldSeeThPracticeVenture() {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		
	}

	@Then("Faculty should click on Practice Venture")
	public void facultyShouldClickOnPracticeVenture() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Practice Venture']")).click();
		driver.quit();
	   
	}
	
	@Given("Faculty is in Quizzes")
	public void facultyIsInQuizzes() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should see th PV Milestones")
	public void facultyShouldSeeThPVMilestones() {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
	}

	@Then("Faculty should click on PV Milestones")
	public void facultyShouldClickOnPVMilestones() {
		driver.findElement(By.xpath("//a[@title='']")).click();
		driver.quit();
	}









	









}
