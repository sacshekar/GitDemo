package StepDefinition;



	import java.io.IOException;
	//import java.util.Iterator;
	import java.util.List;

	//import org.apache.poi.ss.usermodel.Cell;
	//import org.apache.poi.ss.usermodel.Row;
	//import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.junit.Assert;
	import org.openqa.selenium.By;
	//import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import io.cucumber.java.en.*;

	public class Stack {

		public static WebDriver driver = Home.driver;
		By lnkOperation=By.xpath("//a[text()='Operations in Stack']");
		By lnkImplementation=By.xpath("//a[text()='Implementation']");
		
		@Given("The user is on stack home page")
		public void the_user_is_on_stack_home_page() {
		    driver.get(Base.stackUrl);
		}

		@When("The user clicks Operations in Stack link on stack page")
		public void the_user_clicks_operations_in_stack_link_on_stack_page() {
		   driver.findElement(lnkOperation).click();
		}

		@Then("The user should be redirected to stack operations-in-stack page")
		public void the_user_should_be_redirected_to_stack_operations_in_stack_page() {
		  Assert.assertEquals("https://dsportalapp.herokuapp.com/stack/operations-in-stack/",driver.getCurrentUrl());
		    
		}
		@When("The user enters valid python code in Editor from stack page")
		public void the_user_enters_valid_python_code_in_editor_from_stack_page() throws IOException, InterruptedException{
			Base.EnterCode(true,"PythonCode_Stack.xlsx");
		}
		@When("The user enters invalid python code in Editor from stack page")
		public void the_user_enters_invalid_python_code_in_editor_from_stack_page() throws IOException, InterruptedException{
			Base.EnterCode(false,"PythonCode_Stack.xlsx");
			List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
			System.out.println("size : " + lst1.size());
			if (lst1.size() > 0 ){
				System.out.println("output : " + lst1.get(lst1.size()-1).getText());
			}
		}	
		
		
		@When("The user clicks on Implementation link")
		public void the_user_clicks_on_implementation_link() {
			driver.findElement(lnkImplementation).click();
		 }
		

		@Then("The user should be redirected to stack implementation page")
		public void the_user_should_be_redirected_to_stack_implementation_page() {
		    Assert.assertEquals("https://dsportalapp.herokuapp.com/stack/implementation/",driver.getCurrentUrl());
		}

	}

