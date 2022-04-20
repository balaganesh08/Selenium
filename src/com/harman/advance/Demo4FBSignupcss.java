package com.harman.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBSignupcss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ecp-Testing\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Thomas");
		driver.findElement(By.cssSelector("lastname")).sendKeys("shelby");
		driver.findElement(By.name("reg_email__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.cssSelector("reg_passwd__")).sendKeys("welcome123");


		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Select selectDay= new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("9");
		
		Select selectMon= new Select(driver.findElement(By.name("birthday_month")));
		selectDay.selectByValue("11");
		
		Select selectYear= new Select(driver.findElement(By.name("birthday_year")));
		selectDay.selectByValue("2000");
		driver.findElement(By.name("wesubmit")).click();
		 
	}

}
