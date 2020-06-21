package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraverseParent2Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Library\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		
//		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav navbar-right')]/li[4]")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav navbar-right')]/following-sibling::li[3]")).click();
		
		
		driver.quit();

	}

}
