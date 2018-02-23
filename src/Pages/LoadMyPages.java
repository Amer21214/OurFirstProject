package Pages;

import org.openqa.selenium.WebDriver;

public class LoadMyPages {

	public DemoQA_model demoQA;
	
	// Constructor of this class/model
	public LoadMyPages(WebDriver myDriver){
		this.demoQA = new DemoQA_model(myDriver);
	}
	
}
