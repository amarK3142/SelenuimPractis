package assingnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {
      public static void main(String[] args) throws InterruptedException {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		//maximaize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
        WebElement carDropDown=driver.findElement(By.id("multiselect1"));
        //creat instance of Select class
        Select CarsDrop=new Select(carDropDown);
        //check dropdown is multiselected
        System.out.println("Is DropDown is MultSelected Or not:"+CarsDrop.isMultiple());
        // defualt value or 
       // System.out.println("Already selected option :"+CarsDrop.getFirstSelectedOption().getText());
        //get option count
        List<WebElement> Option=CarsDrop.getOptions();
        System.out.println("Option count :"+Option.size());
        //get dropdown name
        for(int i=0;i<Option.size();i++) {
        	System.out.println("Option :"+i+":"+Option.get(i).getText());
        }
        Thread.sleep(10000);
        CarsDrop.selectByIndex(0);
        CarsDrop.selectByIndex(2);
        CarsDrop.selectByIndex(3);
         //get all the Selected option
        List<WebElement> SelectedCars=CarsDrop.getAllSelectedOptions();
        System.out.println("Selected Count:"+SelectedCars.size());
        driver.close();
       
      
      }
}
