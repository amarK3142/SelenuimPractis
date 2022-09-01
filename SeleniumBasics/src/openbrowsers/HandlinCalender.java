package openbrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinCalender {

	public static void main(String[] args) {
         String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", driverpath);
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://www.makemytrip.com");
         //driver.findElement(By.id("li[data-cy='account']")).click();
         driver.findElement(By.cssSelector("label[for='departure']")).click();
         //select date frome calender from next month
         driver.findElement(By.cssSelector("div .DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();

	}//                                      div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();


}
