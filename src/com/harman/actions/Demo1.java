package com.harman.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.myntra.com/");
			//mouseover on profile
			Actions action = new Actions(driver);
					
			action.moveToElement(driver.findElement(By.xpath("//span[text()='Profile']"))).perform();
			
			driver.findElement(By.xpath("//div[text()='Saved Addressees']")).click();

	}

}
