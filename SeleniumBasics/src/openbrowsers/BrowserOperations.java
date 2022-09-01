package openbrowsers;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
          String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
          System.setProperty("webdriver.chrome.driver", driverpath);
          WebDriver driver=new ChromeDriver();
         //implicit wait
          driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
          //maximize window
          driver.manage().window().maximize();
          //we dont have any minimize method in selenuim 	so will use setsize
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com");
         driver.findElement(By.linkText("Forgot your password?")).click();
         System.out.println("forgot password,page url:"+driver.getCurrentUrl());
         //naviget back page
         driver.navigate().back();
         System.out.println("Login Page URl:"+driver.getCurrentUrl());
         // next page
         driver.navigate().forward();
         System.out.println("forgot ur password:"+driver.getCurrentUrl());
         driver.navigate().refresh();
         driver.navigate().to("https://www.google.com");
         driver.quit();
	
	
	}

}
