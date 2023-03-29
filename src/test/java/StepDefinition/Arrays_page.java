package StepDefinition;



	//import java.awt.Robot;
	//import java.awt.Toolkit;
	//import java.awt.event.KeyEvent;
	//import java.awt.image.BufferedImage;
	//import java.io.ByteArrayInputStream;
	//import java.io.ByteArrayOutputStream;
	//import java.io.File;
//	import java.io.FileInputStream;
	import java.io.IOException;
	///import java.nio.file.Files;
	//import java.nio.file.Path;
	//import java.nio.file.Paths;
	import java.util.List;

	//import javax.imageio.ImageIO;

	//import java.awt.Rectangle;

	//import org.apache.commons.collections4.bag.SynchronizedSortedBag;
	//import org.apache.poi.xssf.usermodel.XSSFCell;
//	import org.apache.poi.xssf.usermodel.XSSFRow;
	//import org.apache.poi.xssf.usermodel.XSSFSheet;
	//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	//import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	//import org.openqa.selenium.OutputType;
	//import org.openqa.selenium.TakesScreenshot;
	//import org.openqa.selenium.UnexpectedAlertBehaviour;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.remote.CapabilityType;
	//import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	//import io.qameta.allure.Allure;

	public class Arrays_page {
		
		public static WebDriver driver = Home.driver;
		
		Base baseObj = new Base();
		By PracticeQuesLink = By.xpath("//a[text()='Practice Questions']");
		String PracticeQuesUrl = "https://dsportalapp.herokuapp.com/array/practice";
	    
		@Given("The user is on Arrays Home page")
		public void the_user_is_on_arrays_home_page() {
			driver.get(Base.arraysURL);
			Assert.assertEquals(Base.arraysURL, driver.getCurrentUrl());    
		}

		@When("The user click on Arrays in Python link")
		public void the_user_click_on_arrays_in_python_link() {
		  driver.findElement(By.xpath("//a[@href='arrays-in-python']")).click();
		}
		
	    @Then("the user is redirected to Arrays in Python Page")
		public void the_user_is_redirected_to_arrays_in_python_page() {
		
			String current_url = driver.getCurrentUrl();
			String verify_url = "https://dsportalapp.herokuapp.com/array/arrays-in-python/";
			Assert.assertEquals(current_url, verify_url);
		}

		@When("The user clicks on Try here button")
		public void when_the_user_clicks_on_try_here_button() {
		    driver.findElement(By.xpath("//a[@href='/tryEditor']")).click();
		}

		@Then("The user is redirected to Code Editor page with Run button")
		public void the_user_is_redirected_to_code_editor_page_with_run_button() {
			String current_url = driver.getCurrentUrl();
			String verify_url = "https://dsportalapp.herokuapp.com/tryEditor";
			Assert.assertEquals(current_url, verify_url);
		}

		@When("The user enters valid code in code editor")
		public void when_the_user_enters_valid_code_in_code_editor() throws InterruptedException, IOException 
		{	
			driver.navigate().refresh();
			driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		    
			Base.EnterCode(true, "pythoncode_array.xlsx");
			
		}

		@When("user clicks the run button")
		public void user_clicks_the_run_button() throws InterruptedException 
		{
			driver.findElement(By.xpath("//button[@type='button']")).click();
		}

		@Then("user is presented with result")
		public void user_is_presented_with_result() throws InterruptedException {
			Thread.sleep(5);
			List<WebElement> e = driver.findElements(By.xpath("//*[@id='output']"));
			System.out.print("size : " + e.size());
			if (e.size() > 0 )
			{
				System.out.print("Result : " + e.get(0).getText());
			}	
		}
		
		@When("The user enters invalid code in code editor")
		public void the_user_enters_invalid_code_in_code_editor() throws InterruptedException, IOException
		{
			driver.navigate().refresh();
			driver.switchTo().activeElement().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			
			Base.EnterCode(false, "pythoncode_array.xlsx");
		}

		
		@Then("user is presented with error message")
		public void user_is_presented_with_error_message() throws InterruptedException {
		  
		   	baseObj.alertScreenShot();
			Thread.sleep(3000);
	       	driver.switchTo().alert().accept();
		 }

		@Given("the user is on Arrays in Python page")
		public void the_user_is_on_arrays_in_python_page() {
			driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		}

		@When("The user click on Practice Questins link")
		public void the_user_click_on_practice_questins_link() {
		   driver.findElement(PracticeQuesLink).click();
		}

		@Then("the user is redirected to Practice Questins Page")
		public void the_user_is_redirected_to_practice_questins_page() {
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url,PracticeQuesUrl);
	    }

		@When("The user click on Arrays Using List link")
		public void the_user_click_on_arrays_using_list_link() {
			driver.findElement(By.xpath("//a[text()='Arrays Using List']")).click();
		}

		@Then("the user is redirected to Arrays Using List Page")
		public void the_user_is_redirected_to_arrays_using_list_page() {
			String current_url = driver.getCurrentUrl();
			String verify_url = "https://dsportalapp.herokuapp.com/array/arrays-using-list/";
		    Assert.assertEquals(current_url,verify_url); 
		}

		@Given("the user is on Arrays Using List page")
		public void the_user_is_on_arrays_using_page() {
			String url = "https://dsportalapp.herokuapp.com/array/arrays-using-list/";
			driver.get(url);
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url,url); 
		}

		@When("The user click on Basic Operations in List link")
		public void the_user_click_on_basic_operations_in_list_link() {
			driver.findElement(By.xpath("//a[text()='Basic Operations in Lists']")).click();
		}

		@Then("the user is redirected to Basic Operations in List Page")
		public void the_user_is_redirected_to_basic_operations_in_list_page() {
			String current_url = driver.getCurrentUrl();
			String verify_url = "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
		    Assert.assertEquals(current_url,verify_url); 
		}

		@Given("the user is on Basic Operations in List page")
		public void the_user_is_on_basic_operations_in_list_page() {
			String url = "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
	        driver.get(url);
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url,url); 
		}

		@When("The user click on Applications of Array link")
		public void the_user_click_on_applications_of_array_link() {
			driver.findElement(By.xpath("//a[text()='Applications of Array']")).click();	
		}
		
		@Then("the user is redirected to Applications of Array Page")
		public void the_user_is_redirected_to_applications_of_array_page() {
			String current_url = driver.getCurrentUrl();
			String verify_url = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
		    Assert.assertEquals(current_url,verify_url); 
		}

		@Given("the user is on Applications of Array page")
		public void the_user_is_on_applications_of_array_page() {
			String url = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
			driver.get(url);
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url,url); 
		}

		@Given("The user is on Practice Questions page")
		public void the_user_is_on_practice_questions_page() {
		    driver.get(PracticeQuesUrl);
		}

		@When("the user clicks on Search the Array page")
		public void the_user_clicks_on_search_the_array_page() {
			driver.findElement(By.xpath("//a[text()='Search the array']")).click();
		}
		
		@Then("The user is redirected to the respective Practice Question Code Editor page {string} with Run button")
		public void the_user_is_redirected_to_the_respective_practice_question_code_editor_page_with_run_button(String num) {
			String current_url = driver.getCurrentUrl();
	        String url = "https://dsportalapp.herokuapp.com/question/"+num;
	        System.out.println(current_url);
	        System.out.println(url);
	        Assert.assertEquals(current_url,url);
		
		}

		@When("the user clicks on Max Consecutive Ones page")
		public void the_user_clicks_on_max_consecutive_ones_page() 
		{		
			driver.findElement(By.xpath("//a[text()='Max Consecutive Ones']")).click();
		}

		@When("the user clicks on Find Numbers With Even Number of Digits page")
		public void the_user_clicks_on_find_numbers_with_even_number_of_digits_page() {
			driver.findElement(By.xpath("//a[text()='Find Numbers with Even Number of Digits']")).click();
	   	}

		@When("the user clicks on Squares of a Sorted Array page")
		public void the_user_clicks_on_squares_of_a_sorted_array_page() {
		    driver.findElement(By.xpath("//a[text()='Squares of  a Sorted Array']")).click();
		}

	}

