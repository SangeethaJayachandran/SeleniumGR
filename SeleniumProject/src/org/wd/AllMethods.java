package org.wd;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AllMethods {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\User\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.meaningfulbeauty.com/login");
			driver.manage().window().maximize();
			
//	Normal xpath	
			//To pass values to user id field
			WebElement Email = driver.findElement(By.xpath("//input[@class='input-text username required']"));
			Email.sendKeys("testlogin@yopmail.com");
			
			//To pass values to password field
			WebElement Password = driver.findElement(By.xpath("//input[@class='input-text password required']"));
			Password.sendKeys("1234567892");
			
			//To click on login CTA
			WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			login.click();
			
			
			
			Thread.sleep(5000);
			WebElement Search = driver.findElement(By.xpath("//input[@aria-label='Search']"));
			Search.sendKeys("Laptop");
			
			WebElement Go = driver.findElement(By.xpath("//input[@type='submit']"));
			Go.click();
			
			WebElement Product = driver.findElement(By.xpath("//span[contains(text(),'Lenovo Yoga Slim 7 Pro Intel Evo Core i5-11320H 14\')]"));
		    Product.click();
		    String text1 = Product.getText();
		    System.out.println(text1);
		    
		   Thread.sleep(5000) ;
	    
		    WebElement Cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		    Cart.click();
		}
	}
