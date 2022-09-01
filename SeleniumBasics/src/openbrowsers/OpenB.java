package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenB {



	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
	     String currentWorkingDir=System.getProperty("user.dir");
	     System.out.println(currentWorkingDir);
	     String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	     System.setProperty("webdriver.chrome.driver",chromeExePath);
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		
		
		
		String t=cdriver.getTitle();
		String T="Google";
		System.out.println(t);
		System.out.println(T);
		System.out.println(t.equals(T));
		
		//close the current browser
		cdriver.close();
		
	}
}