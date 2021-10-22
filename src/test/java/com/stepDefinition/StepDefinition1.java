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
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
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
		driver.quit();
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















//======================================================
//	Student Page



	@Given("Student should be in Home Page")
	public void student_should_be_in_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should click on join Course")
	public void should_should_click_on_join_Course() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click No button")
	public void should_should_click_No_button() {
		LoginPom.courses(driver).click();
		LoginPom.EnterBatchId(driver).sendKeys("QAPI-2110-DADA");
		LoginPom.ClickOnJoinBatch(driver).click();
		LoginPom.Click_On_NoBtn(driver).click();
		System.out.println("Should should click No button");
		driver.quit();

	}



	@Given("Student should login to the Page")
	public void studentShouldLoginToThePage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should click on Course")
	public void shouldShouldClickOnCourse() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click yes button")
	public void shouldShouldClickYesButton() {
		LoginPom.courses(driver).click();
		LoginPom.EnterBatchId(driver).sendKeys("QAPI-2110-DADA");
		LoginPom.ClickOnJoinBatch(driver).click();
		LoginPom.Click_On_YesBtn(driver).click();
		System.out.println("Should should click yes button");
		driver.quit();
	}




	@Given("Student should Be in LOGIN page")
	public void studentShouldBeInLOGINPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should be in Course")
	public void shouldShouldBeInCourse() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click on Batch Name")
	public void shouldShouldClickOnBatchName() throws Exception {
		LoginPom.courses(driver).click();
		LoginPom.EnterBatchId(driver).sendKeys("QAPI-2110-DADA");
		LoginPom.ClickOnJoinBatch(driver).click();
		LoginPom.Click_On_YesBtn(driver).click();
		Thread.sleep(3000);
		System.out.println("Should should click on Batch Name");
		driver.quit();
	}


	@Given("student be in CourseModule")
	public void studentBeInCourseModule() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should Join course")
	public void shouldShouldJoinCourse() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click on Batch_Name")
	public void shouldShouldClickOnBatch_Name() throws Exception {
		LoginPom.courses(driver).click();
		LoginPom.Click_on_batchName(driver).click();
		Thread.sleep(3000);
		driver.quit();
	}



	@Given("Student ShouldBe in course module")
	public void studentShouldBeInCourseModule() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should see chat icon")
	public void shouldShouldSeeChatIcon() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click on chat icon")
	public void shouldShouldClickOnChatIcon() {
		LoginPom.courses(driver).click();
		driver.findElement(By.xpath("//i[@class='fa fa-comments fa_icon_font click_able']")).click();
		driver.quit();

	}


	@Given("Student ShouldBe in enrolled courses")
	public void studentShouldBeInEnrolledCourses() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should click on BatchNAME")
	public void shouldShouldClickOnBatchNAME() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click on Quizzes")
	public void shouldShouldClickOnQuizzes() {
		LoginPom.courses(driver).click();
		LoginPom.Click_on_batchName(driver).click();
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
		driver.quit();
	}



	@Given("Student ShouldBe in enrollCourses")
	public void studentShouldBeInEnrollCourses() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("Should should click on QUiZZes tab")
	public void shouldShouldClickOnQUiZZesTab() {
		LoginPom.username(driver).sendKeys("student1212@yopmail.com");
		LoginPom.nextBtn(driver).click();
		LoginPom.passKey(driver).sendKeys("pass");
		LoginPom.signin(driver).click();
	}

	@Then("Should should click on Take Quizz")
	public void shouldShouldClickOnTakeQuizz() throws Exception {
		LoginPom.courses(driver).click();
		LoginPom.Click_on_batchName(driver).click();
		driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::a[1]")).click();
		Thread.sleep(3000);		
		driver.quit();
		
	}
	
	

@Given("Student ShouldBe in COURSEPAGe")
public void studentShouldBeInCOURSEPAGe() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

@When("Should should see save and continue")
public void shouldShouldSeeSaveAndContinue() {
	LoginPom.username(driver).sendKeys("student1212@yopmail.com");
	LoginPom.nextBtn(driver).click();
	LoginPom.passKey(driver).sendKeys("pass");
	LoginPom.signin(driver).click();

}

@Then("Should should click on save and continue")
public void shouldShouldClickOnSaveAndContinue() {
	LoginPom.courses(driver).click();
	LoginPom.Click_on_batchName(driver).click();
	driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::a[1]")).click();
	LoginPom.ClickOnSaveAndContinue(driver).click();
}













}







//QAPI-2110-DADA


