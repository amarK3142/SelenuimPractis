package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay {
     public static void main(String[] args) {
		// absolute path
    	 String driverpath1="C:\\eclipse-workspace\\SelenuimBasics\\Executables\\chromedriver.exe";
    	 //or relative path-->'.'indicates current working dir
    	 String driverpath2=".\\Executables\\chromedriver.exe";
    	 //or using system class
    	 String driverpath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    	 // set driver executable path using system.setproperty
    	 System.setProperty("webdriver.chrome.driver", 	driverpath3);
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.youtube.com/");
    	 driver.getTitle();
    	 System.out.println(driver.getTitle());
    	 driver.close();
    	 
    		 
	}
}
