package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://desktop-72pmnuc/user/submit_tt.do");
		
		//driver.findElement(By.Xpath("//td[@valign='middle']")).sendKeys("admin");
		
	
		
		
		

		
	}
	

	
}
