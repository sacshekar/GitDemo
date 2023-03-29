package StepDefinition;



	import java.awt.Rectangle;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.image.BufferedImage;
	import java.io.ByteArrayInputStream;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	//import java.time.Duration;
	import java.util.Iterator;
	import java.util.List;

	import javax.imageio.ImageIO;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.chrome.ChromeOptions;
	//import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.qameta.allure.Allure;

	public class Base {
		   
		public static WebDriver driver = Home.driver;    
	    public static String url = "https://dsportalapp.herokuapp.com/";
	    public static String homepageUrl = "https://dsportalapp.herokuapp.com/home";
	    public static String signinUrl = "https://dsportalapp.herokuapp.com/login";
	    public static String registerUrl = "https://dsportalapp.herokuapp.com/register";
		
		public static String username = "algo_tester";
		public static String password = "ds_algo27";
		public static String program;
		
		public static String datastructuresUrl = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
		public static String arraysURL = "https://dsportalapp.herokuapp.com/array/";
		public static String linkedlistUrl = "https://dsportalapp.herokuapp.com/linked-list/";
		public static String stackUrl = "https://dsportalapp.herokuapp.com/stack/";
		public static String queueUrl= "https://dsportalapp.herokuapp.com/queue/";
		public static String treeUrl = "https://dsportalapp.herokuapp.com/tree/";
		public static String graphUrl = "https://dsportalapp.herokuapp.com/graph/";
		
		By lnkTryHere = By.xpath("//a[text()='Try here>>>']");
		By btnRun = By.xpath("//button[text()='Run']");
		By lnkPracticeQ = By.xpath("//a[text()='Practice Questions']");

		
		public void alertScreenShot()
	    {
	    	try{
	    		// Creating Robot class object
	  			Robot rb = new Robot();
	    		// Get screen size
	    		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	    		// Capturing screenshot by providing size
	            BufferedImage tmp = rb.createScreenCapture(screenSize); 
	            // Defining destination file path
	            String testStepsName = null;
				String path=System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\"+testStepsName+System.currentTimeMillis()+".png";
	            // To copy temp image in to permanent file
	            File file = new File(path);
	            ImageIO.write(tmp, "png",file);
	            //convert file to byte so that we can attach to allure report
	            Path path1 = Paths.get(path);
	            byte[] data = Files.readAllBytes(path1);
	            //adding the image file allure report
	            Allure.addAttachment("Page Screenshot", new ByteArrayInputStream(data));//.getScreenshotAs(OutputType.BYTES)));
	        }
	    	catch(Exception e)
	    	{
	     		System.out.println("Some exception occured." + e.getMessage());
	     	}
	    }
	    
		public String readexcel_sheet(String sheet_name) throws IOException
		{
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\code_examples_1.xlsx";
			File excelfile = new File(path);
			FileInputStream fis = new FileInputStream(excelfile);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheet_name);
		    XSSFRow row=sheet.getRow(0);
		    XSSFCell cell=row.getCell(0);
		    program = cell.getStringCellValue();
		    System.out.println(program);
		    workbook.close();
		    return program;
			
		}
		
		public static void EnterCode(boolean flag, String strFileName) throws IOException, InterruptedException
		{
				String sheetName="";
				String strCode = "";
				String strFilePath  = System.getProperty("user.dir") + 
							"/src/test/resources/TestData//" + strFileName;
				File excelFile = new File(strFilePath);
				FileInputStream fis = new FileInputStream(excelFile);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				if(flag == true) { // enter valid code
					sheetName = "Code1";
				}
				else if(flag == false) {// enter invalid code
					sheetName = "Code2";			
				}
				XSSFSheet sheet = workbook.getSheet(sheetName);
				Iterator<Row> row = sheet.rowIterator();
				
				while(row.hasNext()){
					Row currentRow = row.next();
					Iterator<Cell> cell = currentRow.cellIterator();
					while(cell.hasNext()) {
						Cell currentCell = cell.next();
						strCode = currentCell.getStringCellValue();
						driver.switchTo().activeElement().sendKeys(strCode + "\n");
						driver.switchTo().activeElement().sendKeys(Keys.ENTER , Keys.HOME);
					}
				}
				workbook.close();
			}
			
			@When("The user clicks on Tryhere link")
			public void the_user_clicks_on_tryhere_link() throws InterruptedException {
				//Thread.sleep(6000);
				driver.findElement(lnkTryHere).click();	  
			}	
			@Then ("The user should be directed to Editor page with Run button")
			public void the_user_should_be_directed_to_editor_page_with_run_button() {
				String strURL = "https://dsportalapp.herokuapp.com/tryEditor";
				System.out.println("Title : " + driver.getCurrentUrl());
				Assert.assertEquals(strURL,driver.getCurrentUrl());
			}
			@And("Clicks run button after valid code")
			public void clicks_run_button_after_valid_code() throws InterruptedException {
				Thread.sleep(3000);
				driver.findElement(btnRun).click();
			}
			@And("Clicks run button after invalid code")
			public void clicks_run_button_after_invalid_code() throws InterruptedException {
				Thread.sleep(3000);
				driver.findElement(btnRun).click();
			}
			@Then("The user gets an error message")
			public void the_user_gets_an_error_message() {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			}
			@Then("The user is presented with the result after run button is clicked")
			public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
				List<WebElement> lst1 = driver.findElements(By.xpath("//*[@id='output']"));
				System.out.print("size : " + lst1.size());

				if (lst1.size() > 0 ){
					System.out.print("output : " + lst1.get(0).getText());
				}	
			}
			@When("The user clicks on Practice Questions link")		
			public void the_user_clicks_on_practice_questions() {
				driver.findElement(lnkPracticeQ).click();
			}
		}


