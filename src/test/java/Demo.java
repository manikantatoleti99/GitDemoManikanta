import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\manik\\eclipse-workspace\\satya\\maveen-demo\\driver\\chromedriver.exe" );
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		

	}

}
