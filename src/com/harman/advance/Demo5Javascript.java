package com.harman.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5Javascript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.myntra.com/");
		
				
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('[data-track=login]').click()");

		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		//src.renameTo(new File("error.png"));
		
		
		src.renameTo(new File("D:\\error.png"));
	}

}