package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram 
{
		public static void main(String[] args)
		{
			//to launch the browser
			WebDriver driver=new ChromeDriver();
			
			//to maximize 
			driver.manage().window().maximize();
			
			//to launch the application
			driver.get("https://www.instagram.com/");
			
			//to identify the search textfield
			WebElement stf=driver.findElement(By.name("username"));
			stf.sendKeys("pragati_29");
			
			WebElement stf1=driver.findElement(By.name("password"));
			stf1.sendKeys("#pragya_29");
			
			WebElement stf2=driver.findElement(By.className("_acap"));
			stf2.click();
			
			
		      
		}
	}
