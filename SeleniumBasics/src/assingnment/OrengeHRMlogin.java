package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengeHRMlogin {
      public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.clear();
		Username.sendKeys("Admin");
		WebElement Pass=driver.findElement(By.name("txtPassword"));
		Pass.clear();
		Pass.sendKeys("admin123");
		WebElement Button=driver.findElement(By.className("button"));
		Button.click();
		driver.close();

	}
}
