package assingnment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {
      public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		// identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		// instance of select class
		Select SelectSkill=new Select(skillDropdown);
		//check multiselect or not
		System.out.println("Idropdown is multiSelect:"+SelectSkill.isMultiple());
	    //get defualt or already selectr option
		System.out.println("Already select option name"+SelectSkill.getFirstSelectedOption().getText());
	    //get option count
		List<WebElement> option=SelectSkill.getOptions();
        System.out.println("Option count is:"+option.size());
       for(int i=1;i<option.size();i++) {
    	   System.out.println("Option"+i+": "+option.get(i).getText());
       }
         SelectSkill.selectByIndex(4);
         System.out.println("Already selected option:"+SelectSkill.getFirstSelectedOption().getText());
         //or
         SelectSkill.selectByValue("Backup Management");
         System.out.println("Already selected option:"+SelectSkill.getFirstSelectedOption().getText());
         //or
         SelectSkill.selectByVisibleText("Analytics");
         System.out.println("Already selected option:"+SelectSkill.getFirstSelectedOption().getText());
         
         //checking the order of skill
         String skillName="";
         //get dropdown option
         for(int i=1; i<option.size();i++) {
        	 skillName=skillName+option.get(i).getText();
         }
         //Expected skill
         String exp_skillName="";
         System.out.println(skillName.equals(exp_skillName));
         //for day ascending order
         Select dayDrop=new Select(driver.findElement(By.id("daybox")));
         List<Integer> days=new ArrayList<Integer>();
         for(int i=1;i<dayDrop.getOptions().size();i++) {
        	 String day=dayDrop.getOptions().get(i).getText();
        	 days.add(Integer.parseInt(day));
         }
         List<Integer> dayDupa=new ArrayList<Integer>(days);
         Collections.sort(dayDupa);
         System.out.println(days.equals(dayDupa));
         driver.close();
      
      }
}
