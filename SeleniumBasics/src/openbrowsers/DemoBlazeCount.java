package openbrowsers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeCount {
       public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> devicename=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h4"));
		List<WebElement> deviceprice=driver.findElements(By.xpath("//div[@id='tbodyid']/div/div/div/h5"));
		for(int i=0;i<devicename.size();i++) {
			System.out.println(devicename.get(i).getText()+":"+deviceprice.get(i).getText());
		}
	}
}
