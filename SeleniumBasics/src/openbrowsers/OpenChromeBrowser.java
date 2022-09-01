package openbrowsers;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
    public static void main(String[] args) {
    	/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
       System.setProperty("webdriver.chromedriver","C:\\Users\\HP\\eclipse-workspace\\SeleniumBasics\\Executables\\chromedriver.exe");
       ChromeDriver cDriver=new ChromeDriver();
       cDriver.get("https://drive.google.com/drive/folders/1ZT8FRpBULcOrBpl2K1UaMyBFzmR6Xypq");
	}
}
