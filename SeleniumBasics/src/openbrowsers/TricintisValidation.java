package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricintisValidation {
     public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/");
		String AppUrl=driver.getCurrentUrl();
		String ExpectedUrl="http://sampleapp.tricentis.com/101/";
		System.out.println("Validate URL:"+AppUrl.equals(ExpectedUrl));
		String AppTitle=driver.getTitle();
		String ExpectedTitle="Tricentis Vehicle Insurance";
		System.out.println("Title Varification:"+AppTitle.equals(ExpectedTitle));
		int Content=driver.getPageSource().length();
		System.out.println("Length of Page:"+Content);
		driver.close();
	}
}
