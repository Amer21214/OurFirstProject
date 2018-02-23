package Tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoadMyPages;

public class TestBase {

	public WebDriver myDriver;
	public Properties props = new Properties();
	public LoadMyPages pages;
	
	// Base method for initializing the session
	public void startMyTest(){
		startWebDriver();
		loadConfig();
		loadPages();
	}
	
	private void loadPages(){
		// Prepare all Page Models for usage
		this.pages = new LoadMyPages(this.myDriver);
	}
	
	private void loadConfig() {
		// Prepare all configuration from the "Configuration package
		try {
			InputStream myFile = new FileInputStream("src/Configuration/config.data");
			props.load(myFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void startWebDriver(){
		// Reci sustavu gdje se nalazi chromedriver na lokalnom disku. Ovo mozete i izbjeci
		// ako postavite taj path u Environment Variables u PATH varijablu. Takoder mozete
		// "ukljuciti" sve webdrivere u sam projekt pa upisete relativni PATH do njega (root = src)
		
		// Tell the system where the previously downloaded chromedriver on the local storage. You can 
		// skip this step if you configure your Environment Variables to point where chromedriver is
		// located in the PATH variable. Also, you can include all webdrivers (chromedriver, geckodriver, etc.)
		// right into this project and use a relative path to point to it (path root = src)
		System.setProperty("webdriver.chrome.driver", "PATH DO CHROMEDRIVERA/chromedriver");
		// Start Chrome
		this.myDriver = new ChromeDriver();
	}
	
}
