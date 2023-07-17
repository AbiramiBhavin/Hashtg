import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Apply  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Abirami");
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("abi@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone']")).sendKeys("9632541256");
		driver.findElement(By.xpath("//textarea[@placeholder='Briefly Describe Yourself']")).sendKeys("Hi, I have 2 years of exp in testing");
		Thread.sleep(3000);
		Actions action= new Actions(driver);
		action.click(driver.findElement(By.xpath("//input[@name='resume']"))).build().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\abirami\\eclipse-workspace\\Hashtg\\Upload\\upload.exe");
		Thread.sleep(13000);
		//action.click(driver.findElement(By.xpath("//span[@class='form-btn-arrow btn-right-arrow']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='form-btn-arrow btn-right-arrow']")).submit();
	
		
		
		
		

	}

}
