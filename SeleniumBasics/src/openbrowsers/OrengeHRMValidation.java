package openbrowsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrengeHRMValidation {
     public static void main(String[] args) {
 		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    String AppURL=driver.getCurrentUrl();
	    String ExpectedURL="https://opensource-demo.orangehrmlive.com/";
	    System.out.println("URL Validation:"+AppURL.equals(ExpectedURL));
	    String AppTitle=driver.getTitle();
	    String ExpectedTitle="OrangeHRM";
	    System.out.println("Title validation :"+AppTitle.equals(ExpectedTitle));
		int ContentLength=driver.getPageSource().length();
		System.out.println("PageSource Length:"+ContentLength);
		driver.close();
	}
}

