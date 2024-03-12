package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class workingWithFacebook 
	{
		public static void main(String[] args)
		{
			//to launch the browser
			WebDriver driver=new ChromeDriver();
			
			//to maximize
			driver.manage().window().maximize();
			
			//to launch the web application
			driver.get("https://www.facebook.com/");
			
			//click on forgot password
			driver.findElement(By.linkText("forgot password")).click();
		}
		}
