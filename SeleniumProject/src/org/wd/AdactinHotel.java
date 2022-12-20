package org.wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\User\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("jenniferL");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("V9B659");

		WebElement Login = driver.findElement(By.id("login"));
		Login.click();

		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByValue("London");

		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByValue("Hotel Sunshine");

		WebElement RoomType = driver.findElement(By.id("room_type"));
		Select s3 = new Select(RoomType);
		s3.selectByIndex(1);

		WebElement NumberofRooms = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(NumberofRooms);
		s4.selectByVisibleText("3 - Three");

		WebElement DateIn = driver.findElement(By.id("datepick_in"));
		DateIn.clear();
		DateIn.sendKeys("22/12/2022");

		WebElement DateOut = driver.findElement(By.id("datepick_out"));
		DateOut.clear();
		DateOut.sendKeys("25/12/2022");

		WebElement Adults = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(Adults);
		s5.selectByValue("2");

		WebElement Children = driver.findElement(By.id("child_room"));
		Select s6 = new Select(Children);
		s6.selectByVisibleText("0 - None");

		WebElement CTA = driver.findElement(By.id("Submit"));
		CTA.click();

		WebElement SelectHotel = driver.findElement(By.id("radiobutton_0"));
		SelectHotel.click();

		WebElement CTA2 = driver.findElement(By.id("continue"));
		CTA2.click();

		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("Jennifer");

		WebElement LastName = driver.findElement(By.id("last_name"));
		LastName.sendKeys("Lopez");

		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("123 QATest Street, El Segundo, US");

		WebElement CC = driver.findElement(By.id("cc_num"));
		CC.sendKeys("4111111111111111");

		WebElement CCType = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(CCType);
		s7.selectByVisibleText("VISA");

		WebElement ExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(ExpMonth);
		s8.selectByVisibleText("December");

		WebElement ExpYear = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(ExpYear);
		s9.selectByVisibleText("2022");

		WebElement CVV = driver.findElement(By.id("cc_cvv"));
		CVV.sendKeys("4526");

		WebElement CTA3 = driver.findElement(By.id("book_now"));
		CTA3.click();

		Thread.sleep(5000);

		WebElement OrderNo = driver.findElement(By.id("order_no"));
		String text = OrderNo.getAttribute("value");
		System.out.println("Booking confirmation number is: " + text);
	}
}
