package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidation {
     public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
       System.setProperty("webdriver.chrome.driver",driverpath);
       // create instance of browser
       WebDriver driver=new ChromeDriver();//upcasting 
       //enter URL
       driver.get("https://www.flipkart.com");
       //validate page title
       String PageTitle=driver.getTitle();
       String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
       System.out.println("Title Validation:"+PageTitle.equals(ExpectedTitle));
       String pageUrl=driver.getCurrentUrl();
       String ExpectedUrl="https://www.flipkart.com/";
       System.out.println("PageUrlValidation:"+pageUrl.equals(ExpectedUrl));
       //get page source content length count
       int contentlength=driver.getPageSource().length();
       System.out.println("Contentlength"+contentlength);
       //close browser
       driver.close();
	}
}
