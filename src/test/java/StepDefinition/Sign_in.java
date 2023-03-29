package StepDefinition;



	import java.io.ByteArrayInputStream;
	//import java.io.File;
	//import java.io.FileInputStream;
	//import java.io.IOException;
	//import java.util.Iterator;
	//import java.util.List;

	//import org.apache.commons.io.FileUtils;
	//import org.apache.poi.ss.usermodel.Cell;
	//import org.apache.poi.ss.usermodel.Row;
	//import org.apache.poi.xssf.usermodel.XSSFCell;
	//import org.apache.poi.xssf.usermodel.XSSFRow;
	//import org.apache.poi.xssf.usermodel.XSSFSheet;
	//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.qameta.allure.Allure;
	//import io.qameta.allure.AllureLifecycle;

	public class Sign_in{
		
	    public static WebDriver driver  = Home.driver;
	    //public static String file_path;
	    //public String valid_username;
	    
	    By username_textfield = By.id("id_username");
		By password_textfield = By.id("id_password");
		By login_button = By.xpath("//input[@value='Login']");
	    		
		//WebDriver driver = obj.driver();
		@Given("the user is on DS_Algo sign in page")
		public void the_user_is_on_ds_algo_sign_in_page() {
			driver.get(Base.signinUrl);
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url, Base.signinUrl);
			driver.navigate().refresh();
			
		}

		@When("the user enters password")
		public void the_user_enters_password() {
		  driver.findElement(password_textfield).sendKeys("abcdef");
		  //file_path = "C:\\Users\\gayat\\eclipse-workspace\\DS_Algo\\target\\username.png";
		}

		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
		    driver.findElement(login_button).click();
		    
		}

		@Then("textbox should display an error message")
		public void textbox_should_display_an_error_message() 
		{
			//adding screenshot to allure report
			Allure.addAttachment("Page Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
		  
		@When("the user enters username")
		public void the_user_enters_username() {
		    driver.findElement(username_textfield).sendKeys("Tester");
		    //file_path = "C:\\Users\\gayat\\eclipse-workspace\\DS_Algo\\target\\password.png";
		}
		
		@When("the user click on register link under textboxes")
		public void the_user_click_on_register_link_under_textboxes() {
			driver.findElement(By.xpath("//a[text()='Register!'] ")).click();
			
		}

		@Then("user should navigate to Registration page")
		public void user_should_navigate_to_registration_page() {
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url, Base.registerUrl);
		}
		
		@When("the user click on register link")
		public void the_user_click_on_register_link() {
			driver.findElement(By.xpath("//a[text()=' Register ']")).click();
		
		}

		@When("the user click on drop down link and chooses any of the {string}")
		public void the_user_click_on_drop_down_link_and_chooses_any_of_the(String op) {
			System.out.println(op); 
			driver.findElement(By.xpath("//a[text()='Data Structures']")).click();
			
			WebElement options = driver.findElement(By.xpath("//a[text()='"+op+"']"));
	        options.click();
	    }
		
		@Then("user should be directed to Home page")
		public void user_should_be_directed_to_home_page() {
			String current_url = driver.getCurrentUrl();
	     	Assert.assertEquals(current_url, Base.homepageUrl);
	        driver.get(Base.signinUrl);
	     	driver.navigate().refresh();
	     }
		
		@When("the user click on sign in link in the same page")
		public void the_user_click_on_sign_in_link_in_the_same_page() {
		   driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		}

		@When("the user enters invalid {string} or {string} or both")
		public void the_user_enters_invalid_or_or_both(String string1, String string2) {
			System.out.println(string1+""+string2); 
			driver.findElement(username_textfield).sendKeys(string1);
			driver.findElement(password_textfield).sendKeys(string2);
		}

		
		@Then("error message is displayed")
		public void error_message_is_displayed() {
			
			String err_msg = "Invalid Username and Password";
	    	WebElement m = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	    	String alert = m.getText();
	    	Assert.assertEquals(err_msg, alert);
		}
		
		@When("the user enters valid username and password")
	    public void the_user_enters_valid_usernameand_password() {
			driver.findElement(username_textfield).sendKeys(Base.username);
		    driver.findElement(password_textfield).sendKeys(Base.password);
		}

	    @Then("used should be signed in and directed to homepage")
	    public void used_should_be_signed_in_and_directed_to_homepage() {
	    	String current_url = driver.getCurrentUrl();
		    Assert.assertEquals(current_url, Base.homepageUrl);
	        Allure.addAttachment("Page Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		    
		    String verify_username_text = driver.findElement(By.xpath("//ul//a[2]")).getText();
		    Assert.assertTrue((Base.username).equalsIgnoreCase(verify_username_text));
		    driver.navigate().refresh();
		}
	    
	    @When("the user clicks on Sign out link")
	    public void the_user_clicks_on_sign_out_link() 
	    {
	    	driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	    	Allure.addAttachment("Page Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	   
	    }
	    
	    

	}

