package selLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Library\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://login.salesforce.com/?locale=eu");
		
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).click();
		
		//search engine
		//driver.findElement(By.xpath("//div[contains(@class,'gb_Xa gb_Ng gb_i gb_Mg gb_Qg')]/div/div[2]/a")).click();
		
		//Gmail
		//driver.findElement(By.xpath("//div[@class='gb_Xa gb_Ng gb_i gb_Mg gb_Qg gb_4f']/div/div/a")).click();
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']/center/following-sibling::input[2]")).click();
		
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Abc");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("Abc");
		driver.findElement(By.cssSelector("#id")).click();
		

	}

}
