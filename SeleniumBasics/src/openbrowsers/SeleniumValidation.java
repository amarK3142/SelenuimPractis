package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumValidation {
      public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com");
		 // implcit wait 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement usernameInputfield=driver.findElement(By.id("username"));
		 System.out.println("user name input field displayed or not:"+usernameInputfield.isDisplayed());
		 System.out.println("user name is functional or not:"+usernameInputfield.isEnabled());
		 String defaultvalueinUsernameinputfield=usernameInputfield.getAttribute("placeholder");
		 System.out.println("Default value of input feild:"+defaultvalueinUsernameinputfield);
		 System.out.println("Default value Functional or not:"+defaultvalueinUsernameinputfield.equals("Username"));
		 //identify password fillld
		 WebElement PassInputfield=driver.findElement(By.name("pwd"));
		 System.out.println("Password field is displayed or not:"+PassInputfield.isDisplayed());
		 System.out.println("Password field is Functional or not:"+PassInputfield.isEnabled());
		 String defaultvalueinPassfield=PassInputfield.getAttribute("placeholder");
		 System.out.println("Default value in Passinput field:"+defaultvalueinPassfield);
		 System.out.println("Default value of Pass Functional or not:"+defaultvalueinPassfield.equals("Password"));
		 //Login button field
		 //Loginbutton
		 WebElement Loginbutton=driver.findElement(By.id("loginButton"));
		 System.out.println("Login button is displayed or not:"+Loginbutton.isDisplayed());
		 System.out.println("Login button is functional or not:"+Loginbutton.isEnabled());
		// String buttonfield=Loginbutton.getAttribute("div");
		//.out.println("Default value of login button :"+buttonfield);
		// System.out.println("Default button is is functional or not:" +buttonfield.equals("Login"));
		 //radio button
		 WebElement radioButton=driver.findElement(By.id("keepLoggedInCheckBox"));
		 System.out.println("Radionbutton is displayed or not:"+radioButton.isDisplayed());
		 System.out.println("radiobutton is functional or not"+radioButton.isEnabled());
		 System.out.println("radio button is selected or not "+radioButton.isSelected());
		 //check Box
		 WebElement checkBox=driver.findElement(By.id("keepLoggedInLabel"));
		 System.out.println(" checkbox is displayed or not :"+checkBox.isDisplayed());
		 System.out.println("CheckBox is Functional or not :"+checkBox.isEnabled());
		 String Checkbox=checkBox.getText();
		 System.out.println(Checkbox);
		 //link
		 WebElement link=driver.findElement(By.linkText("Forgot your password?"));
		 System.out.println("link is displayed or not :"+link.isDisplayed());
		 System.out.println("Link is functional or not :"+link.isEnabled());
		 System.out.println(link.getText());
	}
}
/**
 * Username input field:
 * 			1. display
 * 			2. editable
 * 			3. default
 * Login button:
 * 			1. display
 * 			2. functional
 * 			3. button name
 * Keep me logged in check-box/radio button:
 * 			1. display
 * 			2. functional
 * 			3. selection
 * link:
 *			1. display
 * 			2. functional
 * 			3. link name
 * dropdown:
 * 			1. display
 * 			2. functional
 * 			3. default value
 * 			4. change value is reflecting or not
 * 			5. total option
 * 			6. multi select 
 * isDisplayed() --> To check visibility of any WebElement we can user this
 * 				true --> display/visible
 * 				false--> not displayed / not visible
 * isEnabled() ---> to check whether the WebElemenet is functional or not
 * 				true --> editable/functional
 * 				false --> non editable/non-functional
 * isSelected()---> to check whether radio button/check box is selected or not
 * 				true ---> selected
 * 				false---> not selected
 * getAttribute("attribute_name")--> use to get the attribute name which is passed in
 * 									 this method as parameter in form String
 * getText()--> give the inner text for the WebElement from HTML
 * 
 *	<p> inner text</p>
 *	<a...> inner text</a>
 *	<div..> inner text</div>
 */	
