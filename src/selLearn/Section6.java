package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Section6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		//using standard xpath Syntax 1 //tagName[@attribute='value']
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bac");
		
		//using standard xpath Syntax 2 //*[@attribute='value']
		//driver.findElement(By.xpath("//*[@name='email']")).sendKeys("bac");
		
		//Using CSS selector Syntax 1 tagName[attribute='value']
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abc");
		
		//Using CSS selector Syntax 2 [attribute='value']
		//driver.findElement(By.cssSelector("[type='email']")).sendKeys("abc");
		
		//Using CSS selector Syntax 3 : tagName#id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		
		//Using CSS selector Syntax 4 : tagName.className
		//driver.findElement(By.cssSelector("input.email")).sendKeys("abc");
		
		//driver.findElement(By.id("email")).sendKeys("mohit@gmail.com");
		
		/*
		 * driver.get("https://login.salesforce.com/?locale=eu");
		 * driver.findElement(By.cssSelector("#username")).sendKeys("Abc");
		 * driver.findElement(By.name("pw")).sendKeys("abc");
		 * driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		 * 
		 * //find error on page
		 * System.out.println(driver.findElement(By.cssSelector("div#error.loginError"))
		 * .getText());
		 */
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		
//		driver.close();
		
		

	}

}
