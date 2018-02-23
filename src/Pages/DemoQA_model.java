package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQA_model {

	public WebDriver myDriver;
	
	// Constructor of this class/model
	public DemoQA_model(WebDriver myDriver){
		this.myDriver = myDriver;
	}

	// Method for this page only (click the "Registration" button)
	public void Action_RegistrationButton_click(){
		myDriver.findElement(By.id("menu-item-374")).click();
	}
	
	// Method for this page only (type in First Name)
	public void Action_FirstName_sendKeys(String firstName){
		myDriver.findElement(By.id("name_3_firstname")).sendKeys(firstName);
	}
	
	// Method for this page only (type in Last Name)
	public void Action_LastName_sendKeys(String lastName){
		myDriver.findElement(By.id("name_3_lastname")).sendKeys(lastName);
	}
	
}
