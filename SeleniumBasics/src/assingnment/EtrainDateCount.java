package assingnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtrainDateCount {

	public static void main(String[] args) throws InterruptedException {
		String driverpath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		driver.findElement(By.cssSelector(".wd258>div>.colcont>[id='bwstnform']>.flexRow>div>div>div>[id='tbsfi1']"))
				.sendKeys("Pune");
		// driver.navigate().refresh();
		driver.findElement(By.xpath("//b[text() ='PUNE'][1]")).click();
		// driver.findElement(By.cssSelector(".ui-menu>div>a")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.cssSelector(".wd258>div>.colcont>[id='bwstnform']>.flexRow>div>div:nth-child(3)>div>[id='tbsfi3']"))
				.sendKeys("MUMBAI");

		driver.findElement(By.cssSelector(".ui-menu>div>a")).click();
		// driver.findElement(By.cssSelector(".modalParent>.modalChild>.modalCloseBtn")).click();
		driver.findElement(
				By.cssSelector(".panel>div>div>div>[id='bwstnform']>div:last-child>div>div>div>[for='tbsfi4']"))
				.click();

		driver.findElement(By.cssSelector(".dptbl>tbody>tr>td:nth-child(3)>.nav")).click();
		driver.findElement(By.cssSelector(".dptbl>tbody>tr:nth-child(5)>td:nth-child(5)")).click();
		driver.findElement(By.cssSelector(".wd258>div>div>[id='bwstnform']>div:last-child>div>div:last-child>div"))
				.click();
		driver.findElement(By.cssSelector(
				".wd258>div>div>[id='bwstnform']>div:last-child>div>div:last-child>div>.selectBox>[id='tbsfi5']>option:nth-child(2)"))
				.click();

		driver.findElement(By.cssSelector(".wd258>div>div>[id='bwstnform']>div:last-child>div:last-child>.btn"))
				.click();
		// train number
		Thread.sleep(10000);
		List<WebElement> trainNumber = driver
				.findElements(By.cssSelector(".trnlstcont> div>table>tbody>tr>td>a[class='sf']"));
		// train name
		List<WebElement> trainName = driver
				.findElements(By.cssSelector(".trnlstcont> div>table>tbody>tr>td>a[class='sf pdl3']"));
		for (int i = 0; i < trainName.size(); i++) {
			System.out.println(trainNumber.get(i).getText() + ":" + trainName.get(i).getText());
		}
		WebElement signButton = driver
				.findElement(By.cssSelector(".wd258>div>div>[id='bwstnform']>div:last-child>div:last-child>.btn"));
		String fontColor = signButton.getCssValue("border-bottom-color");
		System.out.println("font color:" + fontColor);
		driver.close();

	}
}