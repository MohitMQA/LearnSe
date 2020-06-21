package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rediff.com/");
		
		//using xpath //tagName[@attribute='value']
		//driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		//xpath type 2 //*[@attribue='value']
		//driver.findElement(By.xpath("//*[@class='signin']")).click();
		
		//xpath customize //tagName[contains(@attribute,'value')]
		//driver.findElement(By.xpath("//a[contains(@title,'Already')]")).click();
		//driver.close();
		
		//using cssSelector  tagName(attribute='value')
		//driver.findElement(By.cssSelector("a[class='signin']")).click();
		
		//cssselector syntax #2 tagname.classvalue
//		driver.findElement(By.cssSelector("a.signin")).click();
		
		//cssSelector syntax #3 (attribute='value')
		//driver.findElement(By.cssSelector("[class='signin']")).click();
		
		//customize cssSelector tagName[attribue*='value']
		driver.findElement(By.cssSelector("[class*='signin']")).click();
		
		driver.close();
		
		
		/*
		 * driver.get("https://www.rediff.com/"); //Simple xpath
		 * driver.findElement(By.xpath("//a[contains(@title,'Already')]")).click();
		 * //Simple Css Selector
		 * driver.findElement(By.cssSelector("input#login1")).sendKeys("abc");
		 * //regularexp cssSelector
		 * driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("abc");
		 * //Css Selector 4: tagname.Classname
		 * driver.findElement(By.cssSelector("input.signinbtn")).click();
		 */
		
	}

}
