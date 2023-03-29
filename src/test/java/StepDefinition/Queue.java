package StepDefinition;


	import java.io.IOException;
	//import java.util.Iterator;
	import java.util.List;

	//import org.apache.poi.ss.usermodel.Cell;
	//import org.apache.poi.ss.usermodel.Row;
	//import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.openqa.selenium.By;
	//import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import io.cucumber.java.en.*;

	public class Queue {
		public static WebDriver driver = Home.driver;
		By lnkImppython=By.xpath("//a[text()='Implementation of Queue in Python']");
		By lnkCollection=By.xpath("//a[text()='Implementation using collections.deque']");

	@Given("The user is on queue home page")
	public void the_user_is_on_queue_home_page() {
		driver.get(Base.queueUrl);
	    Assert.assertEquals("https://dsportalapp.herokuapp.com/queue/", driver.getCurrentUrl());
	}

	@When("The user clicks Implementation of Queue in Python link on queue page")
	public void the_user_clicks_implementation_of_queue_in_python_link_on_queue_page() {
	   driver.findElement(lnkImppython).click();
	}

	@Then("The user should be redirected to queue implementation-lists page")
	public void the_user_should_be_redirected_to_queue_implementation_lists_page() {
		Assert.assertEquals("https://dsportalapp.herokuapp.com/queue/implementation-lists/",driver.getCurrentUrl());
	}
	@When("The user enters valid python code in Editor from queue page")
	public void the_user_enters_valid_python_code_in_editor_from_queue_page() throws IOException, InterruptedException{
		Base.EnterCode(true,"PythonCode_Queue.xlsx");
	}
	@When("The user enters invalid python code in Editor from queue page")
	public void the_user_enters_invalid_python_code_in_editor_from_queue_page() throws IOException, InterruptedException{
		Base.EnterCode(false,"PythonCode_Queue.xlsx");
		List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
		System.out.println("size : " + lst1.size());
		if (lst1.size() > 0 ){
			System.out.println("output : " + lst1.get(lst1.size()-1).getText());
		}
	}	



	@When("The user clicks on Implementation using collections.deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
	   driver.findElement(lnkCollection).click();
	}

	@Then("The user should be redirected to queue implementation-collectoins  page")
	public void the_user_should_be_redirected_to_queue_implementation_collectoins_page() {
		Assert.assertEquals("https://dsportalapp.herokuapp.com/queue/implementation-collections/",driver.getCurrentUrl());
	    }

	}

