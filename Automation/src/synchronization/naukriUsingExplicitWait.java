package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriUsingExplicitWait 
{
public static void main(String[] args)
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
	//enter name
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("pragati Velukar");
	
	//enter email
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pragativelukar3@gmail.com");
	
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#pragya_2922");
	
	//enter mob
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8263974096");
	
	//
WebElement checkButton=driver.findElement(By.id("focusable optionWrap selected"));	
}
}
