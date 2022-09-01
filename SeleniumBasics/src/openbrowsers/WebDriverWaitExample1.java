package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample1 {
         public static void main(String[] args) {
			String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			//wait until logout link to be loaded
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
			System.out.println("HomePage Title:"+driver.getTitle());
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
			WebElement Logout=driver.findElement(By.id("logoutLink"));
			Logout.click();
			driver.close();
			
		}
}
