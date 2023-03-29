package StepDefinition;


	
	import java.io.IOException;
	//import java.util.List;

	import org.openqa.selenium.By;
	//import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Linked_List {
		
		public static WebDriver driver = Home.driver;
		Base baseObj = new Base();
		
		By PracticeQuesLink = By.xpath("//a[text()='Practice Questions']");
		String PracticeQuesUrl = "https://dsportalapp.herokuapp.com/linked-list/practice";
		
		public void verifyUrlFunc(String verify_url)
		{
			String current_url = driver.getCurrentUrl();
			Assert.assertEquals(current_url, verify_url);
		}
		
		@Given("The user is on Linked List Home page")
		public void the_user_is_on_linked_list_home_page() {
			driver.get(Base.linkedlistUrl);
			Assert.assertEquals(Base.linkedlistUrl, driver.getCurrentUrl());
		}

		@When("The user click on Introduction link")
		public void the_user_click_on_introduction_link() {
		    driver.findElement(By.xpath("//a[text()='Introduction']")).click();
		}

		@Then("the user is redirected to Introduction Page")
		public void the_user_is_redirected_to_introduction_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/introduction/");
		}
		
		@When("The user enters valid code in Linked List code editor")
		public void the_user_enters_valid_code_in_linked_list_code_editor() throws InterruptedException, IOException 
		{
			driver.navigate().refresh();
			Base.EnterCode(true, "pythoncode_linkedlist.xlsx");
		}

		@When("The user enters invalid code in Linked List code editor")
		public void the_user_enters_invalid_code_linked_list_in_code_editor() throws InterruptedException, IOException
		{
			driver.navigate().refresh();
			Base.EnterCode(false, "pythoncode_linkedlist.xlsx");
			//List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
			//System.out.println("size : " + lst1.size());
			//if (lst1.size() > 0 ){
				//System.out.println("output : " + lst1.get(lst1.size()-1).getText());
			//}		
		}

		@Given("the user is on Introduction page")
		public void the_user_is_on_introduction_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/introduction/";
			driver.get(url);
	        verifyUrlFunc(url);
		}
		
		@Then("the user is redirected to Linked list Practice Questins Page")
		public void the_user_is_redirected_to_linked_list_practice_questins_page() {
			driver.get(PracticeQuesUrl);
			verifyUrlFunc(PracticeQuesUrl);
		}

		@When("The user click on Creating Linked List link")
		public void the_user_click_on_creating_linked_list_link() {
		    driver.findElement(By.xpath("//a[text()='Creating Linked LIst']")).click();
		}

		@Then("the user is redirected to Creating Linked List Page")
		public void the_user_is_redirected_to_creating_linked_list_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
		}

		@Given("the user is on Creating Linked List page")
		public void the_user_is_on_creating_linked_list_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/";
	        driver.get(url);
	        verifyUrlFunc(url);
		}

		@When("The user click on Types of Linked List link")
		public void the_user_click_on_types_of_linked_list_link() {
		    driver.findElement(By.xpath("//a[text()='Types of Linked List']")).click();
		}

		@Then("the user is redirected to Types of Linked List Page")
		public void the_user_is_redirected_to_types_of_linked_list_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/");
		}

		@Given("the user is on Types of Linked List page")
		public void the_user_is_on_types_of_linked_list_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/";
	        driver.get(url);
	        verifyUrlFunc(url);       
		}

		@When("The user click on Implement Linked List in Python link")
		public void the_user_click_on_implement_linked_list_in_python_link() {
	        driver.findElement(By.xpath("//a[text()='Implement Linked List in Python']")).click();
		}

		@Then("the user is redirected to Implement Linked List in Python Page")
		public void the_user_is_redirected_to_implement_linked_list_in_python_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/");
		}

		@Given("the user is on Implement Linked List in Python page")
		public void the_user_is_on_implement_linked_list_in_python_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/";
	        driver.get(url);
	        verifyUrlFunc(url);       
		}

		@When("The user click on Traversal link")
		public void the_user_click_on_traversal_link() {
	        driver.findElement(By.xpath("//a[text()='Traversal']")).click();
	    }

		@Then("the user is redirected to Traversal Page")
		public void the_user_is_redirected_to_traversal_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/traversal/");
		}

		@Given("the user is on Traversal page")
		public void the_user_is_on_traversal_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/traversal/";
	        driver.get(url);
	        verifyUrlFunc(url);       
		}

		@When("The user click on Insertion link")
		public void the_user_click_on_insertion_link() {
	        driver.findElement(By.xpath("//a[text()='Insertion']")).click();
	    }

		@Then("the user is redirected to Insertion Page")
		public void the_user_is_redirected_to_insertion_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/");
		}

		@Given("the user is on Insertion page")
		public void the_user_is_on_insertion_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/";
	        driver.get(url);
	        verifyUrlFunc(url);       
		}

		@When("The user click on Deletion link")
		public void the_user_click_on_deletion_link() {
	        driver.findElement(By.xpath("//a[text()='Deletion']")).click();
	    }

		@Then("the user is redirected to Deletion Page")
		public void the_user_is_redirected_to_deletion_page() {
			verifyUrlFunc("https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/");
		}

		@Given("the user is on Deletion page")
		public void the_user_is_on_deletion_page() {
			String url = "https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/";
	        driver.get(url);
	        verifyUrlFunc(url);       
		}
		
	}

