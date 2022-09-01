package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {

	public static void main(String[] args) throws InterruptedException {
         String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", driverpath);
         WebDriver driver=new ChromeDriver();
         driver.get("https://demo.actitime.com");
         //implicit wait
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         String actualPlaceholder =driver.findElement(By.id("username")).getAttribute("placeholder");
         String ExpectedPlaceholder="Username" ;
         System.out.println(ExpectedPlaceholder.equals(actualPlaceholder));
         String ActualPlaceholder=driver.findElement(By.name("pwd")).getAttribute("placeholder");
         String ExpectedPlaceHoldeR="Password";
         System.out.println(ActualPlaceholder.equals(ExpectedPlaceHoldeR));
         //Page title validation
         String PageTitle= driver.getTitle();
         System.out.println(PageTitle.equals("actiTIME - Login"));
         driver.findElement(By.id("username")).sendKeys("admin");
         //type pass
         driver.findElement(By.name("pwd")).sendKeys("manager");
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(2000);
         String HomePageTitle=driver.getTitle();
         System.out.println(HomePageTitle.equals("actiTIME - Enter Time-Track"));
         driver.findElement(By.id("logoutLink")).click();
         
         driver.close();
	}

}
