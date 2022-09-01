package assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaQuize {
      public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testandquiz.com.websiteoutlook.com");
		//Thread.sleep(60000);
		//driver.findElement(By.className("group")).click();
		driver.close();
		
	}
}
