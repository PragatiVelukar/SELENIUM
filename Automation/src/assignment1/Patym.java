package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Patym 
{
public static void main(String[] args) throws InterruptedException 
{

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://paytm.com/");
	//click on flight tickets
	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	
	//enter Pune in from text field
	driver.findElement(By.id("from")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.className("_1X2Sn")).sendKeys("PNQ");

	driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
	
	//enter del in to text field
	driver.findElement(By.id("to")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']"));
	driver.findElement(By.className("_1X2Sn")).click();

	driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
	
	//click on departure date
	driver.findElement(By.id("departureDate")).click();
	driver.findElement(By.xpath("(//div[text()='5'])[3]")).click();
	
	//click on search flight
	driver.findElement(By.id("flightSearch")).click();
	
	
	//fetch the price of first flight
	WebElement flightPrice=driver.findElement(By.xpath("span[text()='viewface']"));
	System.out.println(flightPrice.getText());
	
	
		
	
	}
}
