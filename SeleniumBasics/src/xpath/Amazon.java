package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
        public static void main(String[] args) throws InterruptedException {
			String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement>Menu=driver.findElements(By.xpath("//div[@id='nav-main']/div[2]/div/div/a"));
			System.out.println("Menu Count:"+Menu.size());
			for(int i=0;i<Menu.size();i++) {
				System.out.println(Menu.get(i).getText());
			}
	/*		driver.findElement(By.xpath("//div[@id='navbar']/div/div[2]/div/form/div[2]/div/input[@type='text']")).sendKeys("Boat");
            Thread.sleep(1000);
            List<WebElement>Suggestion=driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']/div[2]/div"));
            System.out.println("Suggestion count:"+Suggestion.size());
            for(int i=0;i<Suggestion.size();i++) {
            	System.out.println(Suggestion.get(i).getText());
            }
    */        
			driver.findElement(By.xpath("//div[@id='navbar']/div/div[2]/div/form/div[2]/div/input[@type='text']")).sendKeys("Boat");
			driver.findElement(By.xpath("//div[@id='nav-flyout-searchAjax']/div[2]/div[2]")).click();
			
		
			//driver.close();
		}
}
