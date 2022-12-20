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
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\User\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	    WebElement Closebtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    Closebtn.click();
	    WebElement SearchField = driver.findElement(By.name("q"));
	    SearchField.sendKeys("iphone");
	    Robot R = new Robot();
	    R.keyPress(KeyEvent.VK_ENTER);
	    R.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    
	    WebElement BabyKids = driver.findElement(By.xpath("//span[contains(text(), 'Baby & Kids')]"));
	    Actions Actn = new Actions (driver);
	    Actn.contextClick(BabyKids).perform();
	    Thread.sleep(3000);

	    //Screenshot
		TakesScreenshot BabiesColl = (TakesScreenshot) driver;
		File SourceFile = BabiesColl.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\Dell\\OneDrive\\Pictures\\Babies section.png");
		FileUtils.copyFile(SourceFile, DestFile);
		System.out.println("Screenshot is saved");
		
}
}
