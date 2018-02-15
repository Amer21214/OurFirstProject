package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQA_model {

	public WebDriver myDriver;
	
	// Konstruktor ove klase
	public DemoQA_model(WebDriver myDriver){
		this.myDriver = myDriver;
	}

	// Metoda iskljucivo za ovu stranicu (klikni Registration)
	public void Action_RegistrationButton_click(){
		myDriver.findElement(By.id("menu-item-374")).click();
	}
	
	// Metoda iskljucivo za ovu stranicu (posalji First Name)
	public void Action_FirstName_sendKeys(String firstName){
		myDriver.findElement(By.id("name_3_firstname")).sendKeys(firstName);
	}
	
	// Metoda iskljucivo za ovu stranicu (posalji Last Name)
	public void Action_LastName_sendKeys(String lastName){
		myDriver.findElement(By.id("name_3_lastname")).sendKeys(lastName);
	}
	
}
