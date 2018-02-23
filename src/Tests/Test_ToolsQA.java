package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Tools.TestBase;

public class Test_ToolsQA extends TestBase {
	
	// Annotation @Test tells TestNG that this is where our test begins
	@Test
	public void testRun() throws InterruptedException{
		
		// Open a try-catch-finally block
		try{
			// 1.Initiate all common methods from the TestBase class
			startMyTest();
			
			// 2.Open page toolsqa.com/automation-practice-form/
			myDriver.get("http://toolsqa.com/automation-practice-form/");
			
			// 3.Send the word "Alen" into the First Name field
			myDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alen");
			
			// 4.If the test gets this far, that means it passed. Print out "Test Passed!" into the console
			System.out.println("Test Passed! :) ");
		}
		catch(Throwable t){
			// 5.Catch any error/exception from the test. Print out "Test failed!" into the console.
			// Also, print out why the test has failed.
			System.out.println("Test failed! :(");
			throw new Error(t.getMessage());
		}
		finally{
			// 6.Wait 4000 milliseconds and turn off the browser session
			Thread.sleep(4000);
			myDriver.quit();
		}
	}
}
