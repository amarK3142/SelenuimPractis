package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrengeHRMloginFIre {
       public static void main(String[] args) {
		 String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver", driverpath);
		 WebDriver driver=new FirefoxDriver();
         driver.get("https://opensource-demo.orangehrmlive.com");
         WebElement username=driver.findElement(By.id("txtUsername"));
         username.clear();
         username.sendKeys("Admin");
         WebElement pass=driver.findElement(By.name("txtPassword"));
         pass.clear();
         pass.sendKeys("admin123");
         WebElement Button=driver.findElement(By.name("Submit"));
         Button.click();
         //validate Home page
         String HomePage=driver.getCurrentUrl();
         System.out.println("Validation of Home page:"+HomePage.contains("dashboard"));
         driver.close();
	}
}
