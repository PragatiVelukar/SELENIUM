package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsMultipleMethod 
{
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
	//identif
	}

}
