package StepDefinition;



	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	//import org.apache.commons.io.FileUtils;
	//import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;

	import com.google.common.io.Files;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Register {
		
		public static WebDriver driver = Home.driver;
		
		By getstartedBtn =By.xpath("//button[@class='btn']");
		By RegisterBtn = By.xpath("//a[text()=' Register ']");
		By userNameTxtbox=By.id("id_username");
		By passwordTxtbox= By.xpath("//input[@name='password1']");
		By confirmPasswordTxt=By.xpath("//input[@id='id_password2']"); 
		By submitRegisterBtn=By.xpath("//input[@type='submit']");
		By registerPage = By.xpath("//body");
		
		@Given("The user opens DS Algo portal link")
		public void the_user_opens_ds_algo_portal_link() {
		    //driver = new ChromeDriver();
		    driver.get(Base.url);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   // driver.manage().window().maximize();
		}

		@When("The user clicks the {string} button")
		public void the_user_clicks_the_button(String string) {
			driver.findElement(getstartedBtn).click();
		}

		@Then("The user should be redirected to homepage")
		public void the_user_should_be_redirected_to_homepage() {
		   driver.get(Base.homepageUrl);
		}
		@Given("User is on homepage")
		public void user_is_on_homepage() {
		   driver.get(Base.homepageUrl);
		}
		

		@When("User clicks Register button on the home page")
		public void user_clicks_button_on_the_home_page() throws InterruptedException {
			Thread.sleep(3000);
		    driver.findElement(RegisterBtn).click(); 
		    
		}
		@Then("User navigates  to register page")
		public void user_navigates_to_register_page() {
		    driver.get(Base.registerUrl);
		}
		
		
		@Given("User is on register page")
		public void user_is_on_register_page() {
			driver.navigate().refresh();
		   driver.get(Base.registerUrl); 
		}


		
		@And("The title of the page is Registration")
		public void the_title_of_the_page_is_registration() {
		    String title= driver.getCurrentUrl();
		    System.out.println(title);
		    Assert.assertEquals(Base.registerUrl,title);
		}
		
		@When("User clicks Register button with all fields empty")
		public void user_clicks_button_with_all_fields_empty() throws InterruptedException {
			Thread.sleep(2000);
		   driver.findElement(submitRegisterBtn).click();
		   
		}
		@Then("It should display an error {string} below username textbox")
		public void it_should_display_an_error_below_username_textbox(String string) throws InterruptedException {
			Thread.sleep(3000);
			try
			{
		        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        

		        Files.copy(f, new File("C:\\Users\\shubh\\eclipse-workspace\\DSAlgoProject\\src\\test\\resources\\screenshots"));
		  }
		  catch(IOException e) 
		  {
		        System.out.println("failed to capture screen shot");
		  }
			
		}
		
		
		@When("User enters the username as {string} in username textbox")
		public void user_enters_the_username_as_in_username_textbox(String string) {
			driver.navigate().refresh();
		    driver.findElement(userNameTxtbox).sendKeys("NumpyNinjasdet");
		    
		}

		@When("User clicks register button with password and confirmpassword textbox empty")
		public void user_clicks_register_button_with_password_and_confirmpassword_textbox_empty() {
		    driver.findElement(submitRegisterBtn).click();
		}

		@Then("It should display an error \"Please fill out this field\" below password textbox")
		public void it_should_display_an_error_please_fill_out_this_field_below_password_textbox() {
		    
		}
		
		
		@When("User enters the username as\"NumpyNinjasdet\" in username textbox")
		public void user_enters_the_username_as_numpy_ninjasdet_in_username_textbox() {
			driver.navigate().refresh();
		    driver.findElement(userNameTxtbox).sendKeys("NumpyNinjasdet");
		}

		@When("the password as {string} in password textbox")
		public void the_password_as_in_password_textbox(String string) {
			driver.findElement(passwordTxtbox).sendKeys("WeNinjas1234@@");
		    
		}
		@When("User clicks register button with confirm password textbox empty")
		public void user_clicks_register_button_with_confirm_password_textbox_empty() {
		    driver.findElement(submitRegisterBtn).click();
		   
		}

		@Then("It should display an error {string} below confirm password textbox")
		public void it_should_display_an_error_below_confirm_password_textbox(String string) {
		   
		}
		
		@When("User enters the username {string} in username textbox")
		public void user_enters_the_username_in_username_textbox(String string) {
		    driver.navigate().refresh();
		    driver.findElement(userNameTxtbox).sendKeys("Test");
		}

		@When("User enters the password as {string} in passwordd textbox")
		public void user_enters_the_password_as_in_passwordd_textbox(String string) {
		    driver.findElement(passwordTxtbox).sendKeys("003");
		}

		@When("User enters the password as {string} in confirm password textbox")
		public void user_enters_the_password_as_in_confirm_password_textbox(String string) {
		    driver.findElement(confirmPasswordTxt).sendKeys("003");
		}

		@When("User clicks register button")
		public void user_clicks_register_button() {
		    driver.findElement(submitRegisterBtn).click();
		}

		@Then("It should display the error message")
		public void it_should_display_the_error_message() {
			driver.get(Base.registerUrl);
		   //driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
		  // Alert alert = driver.switchTo().alert();
		  // System.out.println("Alertmessage"+alert.getText());
		   
		   
		}
		
		@When("User enters username as {string} in username textbox and password as {string}  in password textbox")
		public void user_enters_username_as_in_username_textbox_and_password_as_in_password_textbox(String string, String string2) {
		   driver.navigate().refresh();
		   driver.findElement(userNameTxtbox).sendKeys("Sakaleshapura");
		   driver.findElement(passwordTxtbox).sendKeys("Sriranga//");
		}

		@When("User enters {string} in confirmpassword textbox")
		public void user_enters_in_confirmpassword_textbox(String string) {
		    driver.findElement(confirmPasswordTxt).sendKeys("Sriranga//");
		}

		@When("User clicks register button with all fields entered")
		public void user_clicks_register_button_with_all_fields_entered() {
		    driver.findElement(submitRegisterBtn).click();
		}

		@Then("It should dispaly the success message in homepage")
		public void it_should_display_the_success_message_in_homepage() {
			driver.get(Base.homepageUrl);
			
			
	    	 driver.findElement(By.xpath("//div/div[2][@class='navbar-nav']"));
	    	//String alert = s.getText();
	    	//Assert.assertEquals(s, alert);
			
		}	
			
			
		
		}
		
		
		

