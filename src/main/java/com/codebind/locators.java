package com.codebind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\eclipse-workspace\\satya\\maveen-demo\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("manikanta");
		driver.findElement(By.name("inputPassword")).sendKeys("ghjsh");
		driver.findElement(By.className("signInBtn")).click();

	}

}
