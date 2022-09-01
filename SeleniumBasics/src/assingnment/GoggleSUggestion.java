package assingnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleSUggestion {
   public static void main(String[] args) throws InterruptedException {
	String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverpath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("java interview question");
	Thread.sleep(2000);
	List<WebElement> sugg=driver.findElements(By.xpath("//ul/li//div/div/div/span"));
    System.out.println("suggcount:"+sugg.size());
    for(int i=0;i<sugg.size();i++) {
    	System.out.println(sugg.get(i).getText());
    }
    
	
   
   }
} 
