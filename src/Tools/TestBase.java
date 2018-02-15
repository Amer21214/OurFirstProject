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
	
	// Bazicna metoda za inicijalizaciju session-a
	public void startMyTest(){
		startWebDriver();
		loadConfig();
		loadPages();
	}
	
	private void loadPages(){
		// Pripremi sve modele na koristenje
		this.pages = new LoadMyPages(this.myDriver);
	}
	
	private void loadConfig() {
		// Pripremi bilo kakvu konfiguraciju iz "Configuration" package-a
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
		System.setProperty("webdriver.chrome.driver", "LOKALNI PATH DO CHROMEDRIVERA/chromedriver");
		// Upali Chrome
		this.myDriver = new ChromeDriver();
	}
	
}
