package co.tuly.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executing_Test_Case {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuly - Progoti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("ttniger53@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		
		String at = driver.getTitle();
		String et = "gmaila";
//		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		}
		// TODO Auto-generated method stub
		else {
			System.out.println("Test Failure");
		}

	}

}
