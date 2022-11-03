import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manikantatoleti28@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Oxygen@28");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		Thread.sleep(10000);
		
		String expected="Rahul Shetty Academy";
		String actual=driver.getTitle();
		
		if(expected.equals(actual)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
			
		}
		
		
		
		
		
		
		
		
		driver.close();
		
		
		

	}

}
