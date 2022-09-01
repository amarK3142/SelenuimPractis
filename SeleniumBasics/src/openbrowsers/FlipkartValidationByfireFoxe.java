package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartValidationByfireFoxe {
       public static void main(String[] args) {
      	 String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver Fdriver=new FirefoxDriver();
		Fdriver.get("https://www.flipkart.com");
		//validate url
		String PageTitle=Fdriver.getTitle();
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Title validation:"+PageTitle.equals(ExpectedTitle));
		String PageURL=Fdriver.getCurrentUrl();
		String ExpectedURL="https://www.flipkart.com/";
		System.out.println("PageURL:"+PageURL.equals(ExpectedURL));
		int contentLength=Fdriver.getPageSource().length();
		System.out.println("ContentLength:"+contentLength);
		Fdriver.close();

	}
}
