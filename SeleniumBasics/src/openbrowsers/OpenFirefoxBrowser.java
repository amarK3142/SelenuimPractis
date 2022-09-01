package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
       public static void main(String[] args) {
           System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumBasics\\Executables\\geckodriver.exe");
           FirefoxDriver fdriver=new FirefoxDriver();
      	 fdriver.get("https://www.youtube.com/");

           fdriver.close();
	}
}
