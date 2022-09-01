package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {
       public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		/**
		 * to perform any operation first we need to identify the object/element from the 
		 * application dn you can perform any required operation:
		 * 		input type: sendkeys("Input");
		 * 		click	  : click();
		 * 		existing text deletion: clear();
		 */
         WebElement username=driver.findElement(By.id("username"));
 		/*perform require operation in the username field*/
         username.clear();
         username.sendKeys("admin");
 		/*Identify password field*/
         WebElement pass=driver.findElement(By.name("password"));
         pass.clear();
         pass.sendKeys("Test@123");
 		/*Identify Sign in Button*/
        WebElement signbutton=driver.findElement(By.className("buttonBlue")); 
        signbutton.click();
        driver.close();
	}
}
