import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileReader;
import java.util.*;

public class UIverifications {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		
		//to check if the URL is same
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		String expectedUrl="https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
		Thread.sleep(10000);
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Url is same and it is verified");
		
		//To check if the LOGO is displayed
		WebElement img = driver.findElement(By.xpath("//img[@id='logo']"));
		Assert.assertTrue(img.isDisplayed());
		System.out.println("Logo is displayed and it is verified");
		
		// To check if the Service is available
		WebElement skill=driver.findElement(By.linkText("Services"));
		//skill.click();
		if(skill.isDisplayed())
		{
		System.out.println("Service icon is clickable and displayed");
		}
		
		//Other options are displayed like Contact us
		WebElement Shopify = driver.findElement(By.linkText("Shopify"));
		Assert.assertTrue(Shopify.isDisplayed());
		System.out.println("Shopify icon is Displayed");
		WebElement Blog= driver.findElement(By.linkText("Blog"));
		Assert.assertTrue(Blog.isDisplayed());
		System.out.println("Blog icon is Displayed");
		WebElement Careers= driver.findElement(By.linkText("Careers"));
		Assert.assertTrue(Careers.isDisplayed());
		System.out.println("Careers icon is Displayed");
		Thread.sleep(3000);
		WebElement CaseStudies= driver.findElement(By.xpath("//a[text()='Case studies ']"));
		Assert.assertTrue(CaseStudies.isDisplayed());
		System.out.println("Casestudies icon is Displayed");
		
		WebElement aboutus= driver.findElement(By.xpath("//a[text()='About Us ']"));
		Assert.assertTrue(aboutus.isDisplayed());
		System.out.println("AboutUs icon is Displayed");
		WebElement Contact= driver.findElement(By.xpath("//a[text()='Contact Us ']"));
		Assert.assertTrue(Contact.isDisplayed());
		System.out.println("ContactUs icon is Displayed");
		
		//to check if Thank you message id displayed
		WebElement tq = driver.findElement(By.xpath("//h3[text()='Thank you for your interest']"));
		Assert.assertTrue(tq.isDisplayed());
		System.out.println("Thank you message is displayed");
		WebElement gb = driver.findElement(By.xpath("//p[text()='We will get back to you soon.']"));
		Assert.assertTrue(gb.isDisplayed());
		System.out.println("Getback to you message is displayed");
		
		//About Company is displayed
		WebElement about = driver.findElement(By.xpath("//p[text()='Hashtag Systems Inc, an international Software development and outsourcing company with its headquarters in Sunnyvale, California and development centers in California & Kochi.']"));
		Assert.assertTrue(about.isDisplayed());
		System.out.println("About the Firm content is displayed and Verified");
		
		//Company Achievement icon
		WebElement ai = driver.findElement(By.xpath("//img[@src='/images/Footer/top-web-development-companies.png']"));
		Assert.assertTrue(ai.isDisplayed());
		System.out.println("Achievement icon is displayed");
		
		//to check social media details is displayed
		WebElement linkedin = driver.findElement(By.id("footer-linkedin"));
		Assert.assertTrue(linkedin.isDisplayed());
		WebElement fb = driver.findElement(By.id("footer-fb"));
		Assert.assertTrue(fb.isDisplayed());
		WebElement ins = driver.findElement(By.id("footer-instagram"));
		Assert.assertTrue(ins.isDisplayed());
		System.out.println("Ln,fb,insta icons are displayed");
		
		//to check if the location is available
		WebElement loc = driver.findElement(By.id("footer-location"));
		Assert.assertTrue(loc.isDisplayed());
		System.out.println("Location details are Displayed");
		
		// to check if Contact Number is available
		WebElement ct = driver.findElement(By.xpath("//a[text()='+1 408 596 2525 ']"));
		Assert.assertTrue(ct.isDisplayed());
		System.out.println("Contact details are Displayed");
		
		//to check if email is available in site
		WebElement mail = driver.findElement(By.xpath("//a[text()='info@hashtag-ca.com']"));
		Assert.assertTrue(mail.isDisplayed());
		System.out.println("Mail detail is Displayed");
		
		//to check if copyright is displayed
		WebElement cr = driver.findElement(By.xpath("//p[text()='Copyright © 2021 Hashtag Systems Inc. All Rights Reserved.']"));
		Assert.assertTrue(cr.isDisplayed());
		System.out.println("CopyRight is Displayed");
		
		
		
		
		//to check if the EN button is selected
		WebElement btn = driver.findElement(By.xpath("//a[text()='En']"));
		btn.click();
		if(btn.isDisplayed())
		{
			System.out.println("En button is clickable and displayed");
		}
		
		//to check if lets speak is click
		Thread.sleep(10000);
		WebElement ls = driver.findElement(By.xpath("//a[@href='/contact-us']//parent::button[1]"));
		ls.click();
		if(ls.isDisplayed())
		{
			System.out.println("Lets speak button is clickable");
		}
		
		
		//to check if Thank you message id displayed
	
	}
	}


