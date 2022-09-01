package assingnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		String DriverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//To get title Frome The Application 
		String PageTitle=driver.getTitle();
		System.out.println("PageTitle IS;"+PageTitle);
		String ExpectedTitle="actiTIME - Login";
		//tite Validation
		System.out.println("Title Validation:"+PageTitle.equals(ExpectedTitle));
		//identify and perform required operation
        driver.findElement(By.id("username")).sendKeys("admin");
        //Type Password as manager
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //type click button
        driver.findElement(By.id("loginButton")).click();
        //Explicit wait
        Thread.sleep(2000);
	    //verify home page
        String HomePage=driver.getTitle();
        System.out.println("HomePage Title:"+HomePage);
        System.out.println("HomePage Validation:"+HomePage.equals("actiTIME - Enter Time-Track"));
        //click on logout link
        driver.findElement(By.id("logoutLink")).click();;
        //verify login page
       System.out.println("Verify login page:"+PageTitle.equals(ExpectedTitle));
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

/**
 * In order to perform any operation on any element first identify it from WebPage, for that use findElement()
 * 
 * WebElement element= findElement(By.locator()); --> use to identify the element from the Web page and return WebElement
 * 				---> By ---> predefined class which has several static method known as locators
 * 						--->id(string), name(string), linkText(string), partialLinkText(string)
 * 							className(string), tagName(string), cssSelector(String), xpath(String)
 * Once you identified the element, you can perform the required operation like-
 * 1. type				--> element.sendKeys("");
 * 2. click				--> element.click();
 * 3. delete existing text-> element.clear();
 */