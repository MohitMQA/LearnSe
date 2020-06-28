package selLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Diver
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.google.com");
		
		//firefox Driver
//		System.setProperty("webdriver.gecko.driver", "D:\\Library\\firefox\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		
		driver.close();
		
		//Calling methods of other class
		MethodkiClass m = new MethodkiClass(); //Method ki class ka naya object
		m.YeMethodHai(); // Yaha Method ko call kiya hai
		
		driver.close();
		driver.quit();
		
		
		
		
		/*
		 * int a=2,b=5; int sum = a+b; System.out.println("Sum is" +sum);
		 */
		
		

	}

}
