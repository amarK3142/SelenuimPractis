package assingnment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		 String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver", driverpath);
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.flipkart.com");
	     driver.findElement(By.className("VJZDxU")).sendKeys("7620444452");
	     driver.findElement(By.className("_3mctLh")).sendKeys("amar3142");
	     try {
	     driver.findElement(By.className("_3AWRsL")).click();
	     }catch(Throwable e) {
	    	 
	     }
	     List<WebElement> menu=driver.findElements(By.cssSelector("._37M3Pb  .eFQ30H>a"));
	     System.out.println("menu count"+menu.size());
	     for(int i=0;i<menu.size();i++) {
	    	 System.out.println(menu.get(i).getText());
	     }
	}
}
