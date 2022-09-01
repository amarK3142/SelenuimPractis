package assingnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDate {
       public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		driver.findElement(By.cssSelector(".fl.search-box.clearfix>div>[id=src]")).sendKeys("Aurangabad");
        driver.findElement(By.cssSelector(".fl.search-box.clearfix>div>ul>li:nth-child(2)")).click();
        driver.findElement(By.cssSelector("div[class='fl search-box']>div>[id='dest']")).sendKeys("pune");
		driver.findElement(By.cssSelector("div[class='fl search-box']>div>ul>li:nth-child(3)")).click();
//        driver.findElement(By.className(".gtm-onwardCalendar")).click();
        driver.findElement(By.cssSelector(".rb-calendar>table>tbody>tr>[class='next']")).click();
        driver.findElement(By.cssSelector(".rb-calendar>table>tbody>:nth-child(4)>td:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".search-wrap>button[id='search_btn']")).click();
        driver.findElement(By.cssSelector("[id='filter-block']>div>*.details>ul:nth-of-type(2)>li:nth-child(4)>*.custom-checkbox")).click();
        driver.findElement(By.cssSelector("[id='filter-block']>div>*.details>ul:nth-of-type(3)>li:nth-child(3)>.custom-checkbox")).click();
        //counting bus and name
        List<WebElement> busCount=driver.findElements(By.cssSelector("div[id='result-section']>div>ul>div>li>div>div>.clearfix.row-one>div>.travels"));
        System.out.println("BusCount is:"+busCount.size());
        for(int i=0;i<busCount.size();i++) {
        	System.out.println("BusCount And Name:"+busCount.get(i).getText());
        }
        //Ticket prize
        List<WebElement> TicketPrize=driver.findElements(By.cssSelector("div[id='result-section']>div>ul>div>li>div>div>.clearfix.row-one>:nth-child(6)>div>.fare>span"));
        System.out.println(TicketPrize.size());
        for(int i=0;i<TicketPrize.size();i++) {
        	System.out.println("Ticket prize is:"+TicketPrize.get(i).getText());
        }
        
        		driver.close();
        
        
	}
}
