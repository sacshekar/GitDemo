package StepDefinition;



	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Home {
		
	    public static WebDriver driver;
	    public static ChromeOptions options;
	      
	    By get_started_button = By.xpath("//button[text()='Get Started']");
		By homepage_get_started_btn = By.xpath("//a[@href='data-structures-introduction']");
		By homepage_drop_down = By.xpath("//a[text()='Data Structures']");
		
		public void chromeDriverOptions() {
			options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		
		public void firefoxDriverOptions()
		{
			driver = new FirefoxDriver();
		}
		
		
		@Given("the user opens DS_Algo portal link")
		public void the_user_opens_ds_algo_portal_link() {
			chromeDriverOptions();
			//firefoxDriverOptions();
		    driver.get(Base.url);	
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		@When("The user clicks the Get Started button")
		public void the_user_clicks_the_button() {

			driver.findElement(get_started_button).click();	
		}

		@Then("The user navigate to home page")
		public void the_user_navigate_to_home_page() 
		{
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(Base.homepageUrl, current_url); 
	    }
		
	    @Given("the user is on DS_Algo home page")
	    public void the_user_is_on_ds_algo_home_page()
	    {
	    	driver.get(Base.homepageUrl);	
		    String verify_url = driver.getCurrentUrl();
		    Assert.assertEquals(Base.homepageUrl, verify_url);   
		    
	    }

	    @When("The user clicks on Get Started button")
	    public void the_user_clicks_on_get_started_button()
	    {
	    	driver.findElement(homepage_get_started_btn).click();
	    }    
	    
	    @Then("error message should be displayed")
	    public void error_message_should_be_displayed()
	    { 
	    	String err_msg = "You are not logged in";
	    	WebElement m = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	    	String alert = m.getText();
	    	Assert.assertEquals(err_msg, alert);
	    }
	    

	    @When("The user clicks data Structures drop down")
	    public void the_user_clicks_data_structures_drop_down(){
	    	driver.findElement(homepage_drop_down).click();
	     }

	    @Then("user should see six different data structure entries in that drop down")
	    public void user_should_see_six_different_data_structure_entries_in_that_drop_down()
	    {
	         List <WebElement> op = driver.findElements(By.xpath("//a[@class='dropdown-item']"));
	         int size = op.size();
	         System.out.println(size);
	         for(int i =0; i<size ; i++){
	            String options = op.get(i).getText();
	            System.out.println(options);
	         }
	         Assert.assertEquals(size, 6);
	    }
	    
	    
	    @When("the user click on Registration link")
	    public void the_user_click_on_registration_link() {
	      
	        driver.findElement(By.linkText("Register")).click();
	    }

	    @Then("user should be directed to Registration page")
	    public void user_should_be_direceted_to_registration_page() {
	    	String current_url = driver.getCurrentUrl();
		   
		   // driver.get(current_url);	
		    Assert.assertEquals(current_url, Base.registerUrl); 
	    }
	    
	    @When("the user click on sign in link")
	    public void the_user_click_on_sign_in_link() 
	    {
	      driver.findElement(By.linkText("Sign in")).click();
	    }

	    @Then("user should be directed to signin page")
	    public void user_should_be_directed_to_signin_page()
	    {
	    	String current_url = driver.getCurrentUrl();
		    driver.get(current_url);	
		    Assert.assertEquals(current_url, Base.signinUrl);   
		    
	    }
	    
	    @When("the user click on {string} from drop down link")
	    public void the_user_click_on_from_drop_down_link(String string) {
	    	System.out.println(string); 
			driver.findElement(By.xpath("//a[text()='Data Structures']")).click();
			
			WebElement options = driver.findElement(By.xpath("//a[text()='"+string+"']"));
	        options.click();
	    }
	    

	}


