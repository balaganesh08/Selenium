package com.harman.basics2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ecp-Testing\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.linkText("Memberships")).click();
		driver.findElement(By.id("btnAddMembershipDetail")).click();
		
		Select selectMembership = new Select(driver.findElement(By.name("membership[membership]")));
		selectMembership.selectByValue("1");
		
		Select selectPaid = new Select(driver.findElement(By.name("membership[subscriptionPaidBy]")));
		selectPaid.selectByValue("Company");
		
		driver.findElement(By.name("membership[subscriptionAmount]")).sendKeys("1200");
		
		Select selectCurrency = new Select(driver.findElement(By.name("membership[currency]")));
		selectCurrency.selectByValue("MYR");
		
		
		
	
	}

}
