package assingnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm2 {
       public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        //implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    String PageTitle=driver.getTitle();
	    System.out.println("Page Title Validation:"+PageTitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
	    //enter user name
	    
	    driver.findElement(By.className("VJZDxU")).sendKeys("7620444452");
	    //enter pass
	    driver.findElement(By.className("_3mctLh")).sendKeys("amar3142");
	    //click login
	    driver.findElement(By.className("_3AWRsL")).click();
	    //verify Home Page
	    //explicit wait
	   
	     
	    
       }
}
/*
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. verify home page
7. click on logout link
8. verify login page is opened or not
9. close the browser
*/