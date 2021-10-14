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
	//	Tag6

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
		System.out.println("Clicking On Course Module");
	}
	//======================

	//	 Click on create Batch and view details
	//	Tag7

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
		System.out.println("Clicking On Create Batch");


	}
	//=====================
	//	Tag8
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
		System.out.println("Creating A Batch");
	}

	//	==============================
	//	Tag9

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
		System.out.println("Clicking On Copy Batch");
	}

	//	=========================
	//	Tag10
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
		System.out.println("Entering batch details");
	}

	//	Tag11
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
		System.out.println("Faculty should see Course details");

	}

	//Tag12
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
		Thread.sleep(2000);


	}

	@Then("User should select other batch")
	public void userShouldSelectOtherBatch() {
		driver.quit();
		System.out.println("Faculty should create another batch");
	}
	//Tag13
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
		System.out.println("Clicking On Mock Test");
	}

	//Tag14
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
		System.out.println("Faculty should able see the quizzes");
	}



	//Tag15
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
		System.out.println("Faculty should click on take quizzes");
	}


	//Tag16
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
		System.out.println("Faculty should click on view quizz Results");
	}

	//Tag17
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
		System.out.println("Faculty should click on Practice Venture");

	}

	//	Tag18
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
		driver.findElement(By.xpath("//a[@title='Practice Venture']//following::a[1]")).click();
		driver.quit();
		System.out.println("Faculty should click on PV Milestones");
	}


	//Tag19
	@Given("Faculty should attempt Quizz")
	public void facultyShouldAttemptQuizz() {
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

	@When("Faculty should take quizz")
	public void facultyShouldTakeQuizz() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]")).click();
		driver.findElement(By.xpath("//input[@id='button_submit']")).click();
	}

	@Then("Faculty should click on submit")
	public void facultyShouldClickOnSubmit() {
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		driver.quit();
		System.out.println("Faculty should click on submit");
	}
	//=======================
	//	Tag20
	@Given("Faculty should attempt Quizz again")
	public void facultyShouldAttemptQuizzAgain() throws Exception {
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

	@When("Faculty should take quizz again")
	public void facultyShouldTakeQuizzAgain() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]")).click();

	}

	@Then("Faculty should Re-attempt quizz")
	public void facultyShouldReAttemptQuizz() {
		driver.findElement(By.xpath("//input[@id='edit-tries-0']")).click();
		driver.findElement(By.xpath("//input[@id='button_submit']")).click();
		driver.quit();
		System.out.println("Faculty should Re-attempt quizz");
	}
	//===========================

	//Tag21
	@Given("Faculty should login To thePage")
	public void facultyShouldLoginToThePage() {
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

	@When("Faculty should see the report module")
	public void facultyShouldSeeTheReportModule() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();


	}

	@Then("Faculty should click on Report Module")
	public void facultyShouldClickOnReportModule() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();

		Thread.sleep(3000);
		driver.quit();
		System.out.println("Faculty should click on Report Module");

	}


	//Tag22
	@Given("Faculty should login")
	public void facultyShouldLogin() {
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

	@When("Faculty should see the Notification icon")
	public void facultyShouldSeeTheNotificationIcon() {
		driver.findElement(By.xpath("//a[@class='notification-icon-red']")).click();
	}

	@Then("Faculty should click onNotification icon")
	public void facultyShouldClickOnNotificationIcon() {
		driver.quit();
		System.out.println("Faculty should click onNotification icon");
	}




	//	====================
	//Tag23
	@Given("Faculty is in Quizzes Module")
	public void facultyIsInQuizzesModule() {
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

	@When("Faculty should see th Faculty Notes")
	public void facultyShouldSeeThFacultyNotes() {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
	}

	@Then("Faculty should click on Faculty Notes")
	public void facultyShouldClickOnFacultyNotes() throws Exception {
		driver.findElement(By.xpath("//a[@title='Faculty Notes']")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Faculty should click on Faculty Notes");


	}
	//Tag24
	@Given("Faculty should be in QuizzesModule")
	public void facultyShouldBeInQuizzesModule() {
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

	@When("Faculty should see the lessons")
	public void facultyShouldSeeTheLessons() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		driver.findElement(By.xpath("//a[@title='Faculty Notes']")).click();
		Thread.sleep(2000);
	}

	@Then("Faculty should click on lessons")
	public void facultyShouldClickOnLessons() {

		driver.findElement(By.xpath("//div[contains(text(),' FAC Cheat Sheet: Case Study ')]")).click();
		driver.quit();
		System.out.println("Faculty should click on lessons");
	}

	//tag25
	@Given("Faculty should be inCoursE")
	public void facultyShouldBeInCoursE() {
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

	@When("Faculty should click on START COURSe")
	public void facultyShouldClickOnSTARTCOURSe() {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
	}

	@Then("Faculty should click on teaching")
	public void facultyShouldClickOnTeaching() throws Exception {
		driver.findElement(By.xpath("//button[contains(text(),'Teaching mode')]")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Faculty should click on teaching");
	}

	//Tag26
	@Given("Faculty is inCoursE")
	public void facultyIsInCoursE() {
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

	@When("Faculty should see the Manage Batches")
	public void facultyShouldSeeTheManageBatches() {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();

	}

	@Then("Faculty should click on Manage Batches")
	public void facultyShouldClickOnManageBatches() {

		driver.quit();
		System.out.println("Faculty should click on Manage Batches");
	}

	//	Tag27
	@Given("Faculty Should Be inCoursEPage")
	public void facultyShouldBeInCoursEPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		LoginPom.username(driver).sendKeys("qapital.faculty@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("Pass@123");
		LoginPom.signin(driver).click();
	}

	@When("Faculty should see the edit symbol Manage Batches")
	public void facultyShouldSeeTheEditSymbolManageBatches() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		Thread.sleep(90000);
		//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //span[contains(text(),'Active Batches')]//following::i[1]")).click();
		Thread.sleep(3000);
	}

	@Then("Faculty should click onedit symbol Manage Batches")
	public void facultyShouldClickOneditSymbolManageBatches() {
		System.out.println("Faculty should click onedit symbol Manage Batches");
		driver.quit();
	}

	//	Tag28
	@Given("Faculty is inCoursEPage")
	public void facultyIsInCoursEPage() {
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

	@When("Faculty should see the Chat box")
	public void facultyShouldSeeTheChatBox() {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		driver.findElement(By.xpath(" //span[contains(text(),'Active Batches')]//following::i[4]")).click();
	}

	@Then("Faculty should click on Chat box")
	public void facultyShouldClickOnChatBox() {
		System.out.println("Faculty should click on Chat box");
		driver.quit();
	}

	//	tag29
	@Given("Faculty is ManageBATches")
	public void facultyIsManageBATches() {
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

	@When("Faculty should see the Manage Students")
	public void facultyShouldSeeTheManageStudents() {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		driver.findElement(By.xpath(" //span[contains(text(),'Active Batches')]//following::div[12]")).click();
	}

	@Then("Faculty should click on Manage Students")
	public void facultyShouldClickOnManageStudents() {
		System.out.println("Faculty should click on Manage Students");
		driver.quit();
	}

	//	tag30
	@Given("Facultyis in CoursE page")
	public void facultyisInCoursEPage() {
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

	@When("Faculty should see the Run lessons")
	public void facultyShouldSeeTheRunLessons() {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Active Batches')]//following::div[6]")).click();
	}

	@Then("Faculty should click on Run lessons")
	public void facultyShouldClickOnRunLessons() {
		System.out.println("Faculty should click on Run lessons");
		driver.quit();
	}

	//	Tag31
	@Given("Faculty view CoursE pages")
	public void facultyViewCoursEPages() {
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

	@When("Faculty should see the No Upcoming Module")
	public void facultyShouldSeeTheNoUpcomingModule() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		Thread.sleep(90000);
		driver.findElement(By.xpath("//span[contains(text(),'Active Batches')]//following::div[10]")).click();
	}

	@Then("Faculty should click on No Upcoming Module")
	public void facultyShouldClickOnNoUpcomingModule() {
		System.out.println("Faculty should click on Run lessons");
		driver.quit();
	}
	//	tag32
	@Given("Faculty should be in active batches \\(Manage Batches) page")
	public void facultyShouldBeInActiveBatchesManageBatchesPage() {
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

	@When("Faculty should see the Close Batch")
	public void facultyShouldSeeTheCloseBatch() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		Thread.sleep(90000);
		driver.findElement(By.xpath(" //span[contains(text(),'Active Batches')]//following::div[13]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Faculty should click on Close Batch")
	public void facultyShouldClickOnCloseBatch() {
		driver.quit();
		System.out.println("Faculty should click on Close Batch");
	}

	//	tag33
	@Given("Faculty should be in active batches")
	public void facultyShouldBeInActiveBatches() {
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

	@When("Faculty should see the ReOpen batch")
	public void facultyShouldSeeTheReOpenBatch() {
		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement ReOpen=driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[2]/md-content[1]/div[1]/div[1]/div[1]/md-content[1]/ul[1]/div[1]/li[17]/div[1]/md-card[1]/md-card-actions[1]/button[1]/span[1]\n"
				+ ""));
		js.executeScript("arguments[0].scrollIntoView();",ReOpen);
		driver.findElement(By.xpath(" //body/div[3]/div[1]/div[1]/div[1]/div[2]/md-content[1]/div[1]/div[1]/div[1]/md-content[1]/ul[1]/div[1]/li[17]/div[1]/md-card[1]/md-card-actions[1]/button[1]/span[1]\n"
				+ "")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	}

	@Then("Faculty should click on ReOpen batch")
	public void facultyShouldClickOnReOpenBatch() {
		System.out.println("Faculty should click on ReOpen batch");
		driver.quit();
	}

	//	tag34
	@Given("Faculty should be in ACtiveBatches")
	public void facultyShouldBeInACtiveBatches() {
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

	@When("Faculty should see chatIcon")
	public void facultyShouldSeeChatIcon() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		Thread.sleep(90000);
		driver.findElement(By.xpath("//span[contains(text(),'Active Batches')]//following::i[4]")).click();
		driver.findElement(By.xpath("//div[@id='chat_textarea']")).sendKeys("welcome all");
		driver.findElement(By.xpath("//i[@class='material-icons']")).click();
	}

	@Then("Faculty should click on  chat icon and share his thoughts")
	public void facultyShouldClickOnChatIconAndShareHisThoughts() {
		System.out.println("Faculty should click on  chat icon and share his thoughts");
		driver.quit();
	}
	//	@tag35
	@Given("Faculty is in ActiveBatches page")
	public void facultyIsInActiveBatchesPage() {
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

	@When("Faculty should see the CHatBox")
	public void facultyShouldSeeTheCHatBox() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		Thread.sleep(90000);
		driver.findElement(By.xpath("//span[contains(text(),'Active Batches')]//following::i[4]")).click();
		driver.findElement(By.xpath("//div[@id='chat_textarea']")).sendKeys("welcome all");
		driver.findElement(By.xpath("//i[@class='material-icons']")).click();
	}

	@Then("Faculty should click on send")
	public void facultyShouldClickOnSend() {
		System.out.println("Faculty should click on send");
		driver.quit();
	}

	//	Tag36
	@Given("Faculty should view quizz")
	public void facultyShouldViewQuizz() {
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

	@When("Faculty should see the Save and continue")
	public void facultyShouldSeeTheSaveAndContinue() throws Exception {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
	}

	@Then("Faculty should click save and submit")
	public void facultyShouldClickSaveAndSubmit() {
		driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]")).click();
		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		driver.findElement(By.xpath("//input[@id='button_submit']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		System.out.println("save and submit");
		driver.quit();
	}











	//To CLICK ON DELETE BUTTON==============    //span[contains(text(),'Active Batches')]//following::i[2]




	//CLICK ON YES ======TO REOPEN CLOSED BATCH ==================  //span[contains(text(),'Yes')]
	//
	//TO REOPEN BATCH  ========================    //body/div[3]/div[1]/div[1]/div[1]/div[2]/md-content[1]/div[1]/div[1]/div[1]/md-content[1]/ul[1]/div[1]/li[17]/div[1]/md-card[1]/md-card-actions[1]/button[1]/span[1]
	//
	//     chat to send======   //div[@id='chat_textarea']
	//



























}
