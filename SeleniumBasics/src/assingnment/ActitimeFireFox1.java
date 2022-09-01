package assingnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeFireFox1 {
       public static void main(String[] args) throws InterruptedException {
		 String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		 System.setProperty("webdriver.gecko.driver", driverpath);
		 WebDriver driver=new FirefoxDriver();
		  driver.get("https://demo.actitime.com/login.do");
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     //verify login page
		 String PageTitle=driver.getTitle();
	   	 String ExpectedTitle="actiTIME -  Enter Time-Track";
		 System.out.println("Verifying Login Page:"+PageTitle.equals("actiTIME -  Enter Time-Track"));
	     //enter username
		 driver.findElement(By.name("username")).sendKeys("admin");
		 //enter pass
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 //click
		 driver.findElement(By.id("loginButton")).click();
		 //explicit wait
		 Thread.sleep(30000);
		 //verify homepage
		 String HomePageTitle=driver.getCurrentUrl();
		 System.out.println("HomePage title:"+HomePageTitle);
		 System.out.println("HomePage Validation :"+HomePageTitle.equals("https://demo.actitime.com/user/submit_tt.do"));
		 //lick on logout link
		 driver.findElement(By.id("logoutLink"));
		 driver.close();
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