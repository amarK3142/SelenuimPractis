package assingnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
     public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String PageTitle=driver.getTitle();
		System.out.println("Page title is:"+PageTitle);
		String ExpectedTitle="actiTIME - Login";
		System.out.println("Title Validation:"+PageTitle.equals(ExpectedTitle));
				
		WebElement Username=driver.findElement(By.name("username"));
		Username.clear();
		Username.sendKeys("admin");
		WebElement Pass=driver.findElement(By.className("pwdfield"));
		Pass.clear();
		Pass.sendKeys("manager");
		WebElement Button=driver.findElement(By.className("initial"));
		Button.click();
		driver.close();
}}