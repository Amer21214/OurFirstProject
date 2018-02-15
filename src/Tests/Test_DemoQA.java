package Tests;

import org.testng.annotations.Test;

import Tools.TestBase;

public class Test_DemoQA extends TestBase {
	
	// Anotacija @Test sluzi da TestNG-a "informirate" da odavde pocinje test 
	@Test
	public void testRun() throws InterruptedException{
		
		// Otvori try-catch-finally blok
		try{
			// 1.Pozovi common metodu za sve testove iz TestBase klase
			startMyTest();

			// 2.Otvori stranicu demoqa.com 
			myDriver.get("http://demoqa.com/");
			
			// 3.Klikni "Registration button", pozivajuci se na metodu iz modela "DemoQA_model"
			this.pages.demoQA.Action_RegistrationButton_click();
			
			// 4.Upisi ime i prezime dohvaceno iz Configuration/config.data, 
			// pozivajuci se na metodu iz modela "DemoQA_model"
			this.pages.demoQA.Action_FirstName_sendKeys(props.getProperty("firstname1"));
			this.pages.demoQA.Action_LastName_sendKeys(props.getProperty("lastname1"));
				
			// 5.Ako test dode do ovog koraka, to znaci da je test prosao. Ispisi
			// u konzolu "Test Passed!"
			System.out.println("Test Passed!");
		}
		catch(Throwable t){
			// 6.Uhvati bilo kakav exception iz testa. Ispisi u konzolu "Test Failed!". 
			// U konzolu ispisi i razlog zasto je test pao.
			System.out.println("Test failed!");
			throw new Error(t.getMessage());
		}
		finally{
			// 7.Pricekaj 4000 milisekunda i ugasi browser session
			Thread.sleep(4000);
			myDriver.quit();
		}
		
		
		
	}
	
	
}
