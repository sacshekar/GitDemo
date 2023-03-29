package Runner;


	
	//import org.junit.runner.RunWith;
	import org.testng.annotations.DataProvider;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
			plugin = {"pretty", "html:target/ds_algo.html"},
					//reporting purpose
			monochrome=false,  //console output color
			tags = "", //tags from feature file
		    features = {"src/test/resources/features"},
		    		/*"src/test/resources/features/1home.feature",
		    		   //"src/test/resources/features/2register.feature",
		    		    "src/test/resources/features/3sign_in.feature",
		    		   // "src/test/resources/features/4Home.feature",
		    		   // "src/test/resources/features/5DataStructures.feature",
		    		    "src/test/resources/features/6Arrays.feature",
		    		   // "src/test/resources/features/7Linked_List.feature",
		    		   // "src/test/resources/features/Stack.feature",
		    		   // "src/test/resources/features/Queue.feature",
		    		   // "src/test/resources/features/8Tree.feature",
		    		   // "src/test/resources/features/9Graph.feature",
		    		  */  
		    //location of feature files
			glue= "StepDefinition") //location of step definition files


	 public class TestRunner extends AbstractTestNGCucumberTests
	 {
			@Override
			@DataProvider(parallel = false)
			public Object[][] scenarios() 
			{
				return super.scenarios();
			}
	 }



