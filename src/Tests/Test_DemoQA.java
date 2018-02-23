package Tests;

import org.testng.annotations.Test;

import Tools.TestBase;

public class Test_DemoQA extends TestBase {
	
	//test1
	 
	// Annotation @Test tells TestNG that this is where our test begins
	@Test
	public void testRun() throws InterruptedException{
		
		// Open a try-catch-finally block
		try{
			// 1.Initiate all common methods from the TestBase class
			startMyTest();

			// 2.Open page demoqa.com
			myDriver.get("http://demoqa.com/");
			
			// 3.Click the "Registration" button by calling the method from Page Model "DemoQA_model"
			this.pages.demoQA.Action_RegistrationButton_click();
			
			// 4.Enter First and Last Name using data from Configuration/config.data file,
			// calling the method from the Page Model "DemoQA_model"
			this.pages.demoQA.Action_FirstName_sendKeys(props.getProperty("firstname1"));
			this.pages.demoQA.Action_LastName_sendKeys(props.getProperty("lastname1"));
			
			// 5.If the test gets this far, that means it passed. Print out "Test Passed!" into the console
			System.out.println("Test Passed!");
		}
		catch(Throwable t){
			// 6.Catch any error/exception from the test. Print out "Test failed!" into the console.
			// Also, print out why the test has failed.
			System.out.println("Test failed!");
			throw new Error(t.getMessage());
		}
		finally{
			// 7.Wait 4000 milliseconds and turn off the browser session 
			Thread.sleep(4000);
			myDriver.quit();
		}
		
		
		
	}
	
	
}
