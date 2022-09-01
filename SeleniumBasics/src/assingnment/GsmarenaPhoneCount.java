package assingnment;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaPhoneCount {
       public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com");
		String Actualurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println("Url valiadation:"+Actualurl.equals("https://www.gsmarena.com/"));
		List<WebElement> PhoneCount=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li"));
		System.out.println("Phone count "+PhoneCount.size());
		for(int i=0;i<PhoneCount.size();i++ ) {
			System.out.println(PhoneCount.get(i).getText());
		}
		driver.close();
	}
}
