package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Tools.TestBase;

public class Test_ToolsQA extends TestBase {
	
	// Anotacija @Test sluzi da TestNG-a "informirate" da odavde pocinje test
	@Test
	public void testRun() throws InterruptedException{
		
		// Otvori try-catch-finally blok
		try{
			// 1.Pozovi common metodu za sve testove iz TestBase klase
			startMyTest();
			
			// 2.Otvori stranicu toolsqa.com/automation-practice-form
			myDriver.get("http://toolsqa.com/automation-practice-form/");
			
			// 3.Posalji rijec "Alen" u First Name polje
			myDriver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alen");
			
			// 4.Ako test dode do ovog koraka, to znaci da je test prosao. Ispisi
			// u konzolu "Test Passed!"
			System.out.println("Test Passed! :) ");
		}
		catch(Throwable t){
			// 5.Uhvati bilo kakav exception iz testa. Ispisi u konzolu "Test Failed!". 
			// U konzolu ispisi i razlog zasto je test pao.
			System.out.println("Test failed! :(");
			throw new Error(t.getMessage());
		}
		finally{
			// 6.Pricekaj 4000 milisekunda i ugasi browser session
			Thread.sleep(4000);
			myDriver.quit();
		}
	}
}
