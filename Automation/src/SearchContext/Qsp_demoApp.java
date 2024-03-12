package SearchContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsp_demoApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Pragati");
	    
	    driver.findElement(By.cssSelector("id='email']")).sendKeys("pragativelukar3@gmail.com",Keys.ENTER);
	    
	    driver.findElement(By.cssSelector("[id='password']")).sendKeys("#pragya_922",Keys.ENTER);
	    
	    driver.findElement(By.xpath("//button[text()='Register']")).click();
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragativelukar3@gmail.com",Keys.ENTER);
	    
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#pragya_922",Keys.ENTER);
	    
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}

