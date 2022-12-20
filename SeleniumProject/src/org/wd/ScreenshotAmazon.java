package org.wd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAmazon {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\User\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	    WebElement Interview = driver.findElement(By.id("heading20"));
	    Interview.click();
	    Thread.sleep(3000);
	    
	  //Screenshot
	  		TakesScreenshot GTech = (TakesScreenshot) driver;
	  		File SourceFile = GTech.getScreenshotAs(OutputType.FILE);
	  		File DestFile = new File("C:\\Users\\Dell\\OneDrive\\Pictures\\Interview Questions.png");
	  		FileUtils.copyFile(SourceFile, DestFile);
	  		System.out.println("Screenshot is saved");
}
}