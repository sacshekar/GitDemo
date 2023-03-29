package StepDefinition;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Home2 {

		public static WebDriver driver = Home.driver;
		
		@Given("The user is on ds algo home page")
		public void the_user_is_on_ds_algo_home_page() {
			driver.get(Base.homepageUrl);
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url, Base.homepageUrl);
		    
		}

		@Then("the user is redirected to the respective {string}  page")
		public void the_user_is_redirected_to_the_respective_page(String op) throws InterruptedException 
		{
			
			String current_url = driver.getCurrentUrl();
	        String verify = op.toLowerCase().trim().replaceAll(" ","-").replaceAll("arrays", "array");
			String verify_url = "https://dsportalapp.herokuapp.com/"+verify+"/";
			Assert.assertEquals(current_url,verify_url);
	        Thread.sleep(1000);
	 	}
		
		@When("the user clicks on {string} button in home page")
		public void the_user_clicks_on_button_in_home_page(String string)
		{
		   String op = string.toLowerCase().trim();
		   WebElement get_started_button = driver.findElement(By.xpath("//a[@href='"+op+"']"));
		   get_started_button.click();
		}
		
		@Then("the user is redirected to the respective {string} pages")
		public void the_user_is_redirected_to_the_respective_pages(String text) throws InterruptedException 
		{
			String current_url = driver.getCurrentUrl();
	        String verify = text.toLowerCase().trim().replaceAll(" ","-").replaceAll("arrays", "array");
			String verify_url = "https://dsportalapp.herokuapp.com/"+verify+"/";
			Assert.assertEquals(current_url,verify_url);
	        Thread.sleep(1000);
	 	}

	}

