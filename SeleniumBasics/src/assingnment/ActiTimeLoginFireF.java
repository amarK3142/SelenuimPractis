package assingnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeLoginFireF {
      public static void main(String[] args) throws InterruptedException {
		  String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		  System.setProperty("webdriver.gecko.driver", driverpath);
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  //implicit wait 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		  WebElement  Username= driver.findElement(By.className("textField"));
		  Username.clear();
		  Username.sendKeys("admin");
		  WebElement Pass=driver.findElement(By.className("pwdfield"));
		  Pass.clear();
		  Pass.sendKeys("manager");
		  WebElement Button=driver.findElement(By.className("initial"));
		  Button.click();
		  Thread.sleep(3000);
		  String HomePage=driver.getTitle();
		  System.out.println(HomePage);
		  System.out.println("Home Page Validation :"+HomePage.equals("actiTIME -  Enter Time-Track"));
		  
		  driver.close();
	}
}
