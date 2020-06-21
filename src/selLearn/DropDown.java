package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Library\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Select s = new Select(driver.findElement(By.xpath("//*[contains(@name,'ctl00$mainContent$ddl_Adult')]")));
		Thread.sleep(3000);
		s.selectByValue("1");
		
		//Select s = new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']")));
		
		/*
		s.selectByValue("option1");
		s.selectByIndex(2);
		s.selectByVisibleText("Option3");
		s.deselectByIndex(3);
		*/
	}

}
