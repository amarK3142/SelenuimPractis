package openbrowsers;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample1 {

	public static void main(String[] args) {
       String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", driverpath);
       WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");;
	   driver.findElement(By.id("loginButton")).click();
	   //fluent wait 
	   Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
	   .withTimeout(Duration.ofSeconds(30))
	   .pollingEvery(Duration.ofSeconds(5))
	   .ignoring(NoSuchElementException.class);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	  System.out.println("HomePage Title:"+driver.getTitle());
	  driver.close();
	
	
	}

}
