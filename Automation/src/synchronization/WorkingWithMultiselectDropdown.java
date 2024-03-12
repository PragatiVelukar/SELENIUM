package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Value;

public class WorkingWithMultiselectDropdown
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Pragati%20Velukar/Desktop/dropdown.html");
	   WebElement multiSelectDropdown = driver.findElement(By.id("dropdown"));
	   
	
	//create object of select class
	 // Select S=new Select(multiSelectDropdown);
	   
	   //for loop
	   //for(int i=0;i<=5;i++)
	   //{
		 //System.out.println(i);
	   //}
	   
	  	
	}
}
