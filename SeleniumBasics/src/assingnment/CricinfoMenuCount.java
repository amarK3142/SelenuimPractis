package assingnment;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoMenuCount {
       public static void main(String[] args) {
  		 String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver", driverpath);
	     WebDriver driver=new ChromeDriver();
	     
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com");
	String actualurl=driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
		System.out.println("Url validation:"+actualurl.equals("https://www.espncricinfo.com/"));
        List<WebElement> menu=driver.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1  .ds-popper-wrapper>a"));
        System.out.println("Menu count :"+menu.size());
        for(int i=0;i<menu.size();i++) {
        	System.out.println(menu.get(i).getText());
        }
        driver.close();
       }
}
