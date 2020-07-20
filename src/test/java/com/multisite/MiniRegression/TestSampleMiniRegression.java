package com.multisite.MiniRegression;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.multisite.Library.AppLibrary;
import com.multisite.Library.TestBase;

public class TestSampleMiniRegression extends TestBase {

	@BeforeClass
	public void setUp() throws Exception {
		appLibrary = new AppLibrary("TestSampleMiniRegression");
	}

	//@Test
	public void launch() throws Exception {
//		appLibrary.getDriverInstance();
//		appLibrary.launchApp();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/chat/new.html?LTChatTestFive");

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//iframe[@id='cwlChat']"));
		driver.switchTo().frame(ele);

		WebElement ele2 = driver.findElement(By.xpath("//docked[@id='docked']"));
		ele2.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.switchTo().defaultContent();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Updated')]")));

		String text =driver.findElement(By.xpath("//p[contains(text(),'Updated')]")).getText();

		 assertEquals(text, "Updated: May 25, 2018");

	}
	
	
	
	
	
	
	//@Test
	public void launch1() throws Exception {
//		appLibrary.getDriverInstance();
//		appLibrary.launchApp();
		WebDriver driver = new ChromeDriver();
		driver.get("www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions actions = new Actions(driver);
		
		WebElement mens = driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][text()='Men']"));
		actions.moveToElement(mens);
		
		WebElement Thiort = driver.findElement(By.xpath("//a[@title='T-Shirts'][contains(@href,'men-tshirt')]"));
		actions.moveToElement(Thiort);
		actions.click().build().perform();
		
		
		
		

	

	}
	@Test
	public void launch2() throws Exception {
//		appLibrary.getDriverInstance();
//		appLibrary.launchApp();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("iPhone");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		driver.findElement(By.xpath("//input[@aria-label='64 GB']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Minimum Value in INR']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@aria-label='Maximum Value in INR']")).sendKeys("10000");
		
		driver.findElement(By.xpath("//button[@title='Submit price range']")).click();
		
//		Actions actions = new Actions(driver);
//		
//		WebElement mens = driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][text()='Men']"));
//		actions.moveToElement(mens);
//		
//		WebElement Thiort = driver.findElement(By.xpath("//a[@title='T-Shirts'][contains(@href,'men-tshirt')]"));
//		actions.moveToElement(Thiort);
//		actions.click().build().perform();
//		
		
		

	}
	
	
	
	
	
}