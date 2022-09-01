package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationsOnBrowser {
	/**
	 * Open Chrome browser
	 * Enter google search page url
	 * validate URL is entered properly or not
	 * validate google search page is open or not
	 * once all the validation are performed close the browser
	 */ 
    public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver Cdriver=new ChromeDriver();
		//need to enter URl of application
		Cdriver.get("https://www.google.com");
		String expectedurl="https://www.google.com";
		// get the entered Url from the opend browser
		String appcurrenturl=Cdriver.getCurrentUrl();
		System.out.println("Actual URL:"+appcurrenturl);
		System.out.println("Expected url:"+expectedurl);
		if(appcurrenturl.contains(expectedurl)) {
			System.out.println("Current url Validation is passed");
		}else {
			System.out.println("Current url Validation is failed");
		}
		//verify that google search page is opend r not using title
		String actualTitle=Cdriver.getTitle();
		String expectedTitle="Google";
		System.out.println("ActualTitle:"+actualTitle);
		System.out.println("expectedTitle:"+expectedTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title Validation is passed");
		}else {
			System.out.println("Title Validation is failed");
		}
		//get source webpage source contains
		String sourceContent=Cdriver.getPageSource();
		System.out.println("SOurce content length:"+sourceContent.length());
		
		Cdriver.close();
	}
}
/**
 * Open Chrome browser
 * Enter google search page url
 * validate URL is entered properly or not
 * validate google search page is open or not
 * once all the validation are performed close the browser
 */ 