package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample2 {
        public static void main(String[] args) {
			String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement( By.xpath("//a[@id='loginButton']")).click();
			//explicit wait(dynamic wait)
            WebDriverWait wait=new WebDriverWait(driver,20);
          //add condition to wait using WebDriverWait instance
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[3]/a")));
            driver.findElement(By.xpath("//table/tbody/tr/td/div/table/tbody/tr/td[3]/a")).click();
            driver.close();
            
		}
}
