package assingnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realmecount {
       public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com");
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".brandmenu-v2>ul>:nth-child(14)")).click();
        List<WebElement> RealmeCount=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
        System.out.println("Phone Count :"+RealmeCount.size());
        for(int i=0;i<RealmeCount.size();i++) {
        	System.out.println(RealmeCount.get(i).getText());
        }
        driver.close();
	}
}
