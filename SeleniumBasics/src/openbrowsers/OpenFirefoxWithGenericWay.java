package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxWithGenericWay {
     public static void main(String[] args) {
		//Absolute path
    	 String driverpath1="C:\\eclips-workspace\\SelenuimBasics\\Executables\\geckodriver.exe";
    	 //relative path
    	 String driverpath2=".\\Executables\\geckodriver.exe";
    	 //or using system class
    	 String driverpath3=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
	     //set the driver executables path using  system.setproperty
    	 System.setProperty("webdriver.gecko.driver",driverpath3);
    	 // crating instance of requred browser
    	 WebDriver	driver=new FirefoxDriver();
         driver.get("https://www.google.com");  
         driver.getTitle();
         System.out.println(driver.getTitle());
         driver.close();
     }
     
}
