package SearchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato
{

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	driver.findElement(By.xpath("//div[@class='sc-bke1zw-1 sc-elhb8j-20 jWound']")).click();
	driver.findElement(By.xpath("//a[@href='https://www.blinkit.com/']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='search delivery location']")).sendKeys("qspider",Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='QSpiders Pune Wakad, Dange Chowk Road, Gujar Nagar, Jai Hind nagar, Thergaon, Pune, Maharashtra, India']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).click();
	
	//driver.findElement(By.xpath("LocationSearchBox__InputSelect-sc-1k8u6a6-0 bnbUjG")).sendKeys("qspider",Keys.ENTER);
	//driver.findElement(By.xpath("//div[@class='LocationSearchList__LocationLabel-sc-93rfr7-2 ixiZXd']")).click();
	

	
	}
}

