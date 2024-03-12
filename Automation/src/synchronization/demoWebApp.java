package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoWebApp
{
	public static void main(String[]args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	
	//click on login
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	Thread.sleep(2000);
	//enter email
	driver.findElement(By.id("Email")).sendKeys("pragativelukar29@gmail.com",Keys.ENTER);
	Thread.sleep(2000);
	//enter password
	driver.findElement(By.id("Password")).sendKeys("#pragya_2922",Keys.ENTER);
	Thread.sleep(2000);
	//click on book
	driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
	Thread.sleep(2000);
	//select book
	driver.findElement(By.xpath("//a[text()='Fiction']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']")).click();
	Thread.sleep(2000);
	//click on shopping cart
	driver.findElement(By.xpath("//li[@id='topcartlink']")).click();
	Thread.sleep(2000);
	//select country
	driver.findElement(By.id("CountryId")).sendKeys("India",Keys.ENTER);
	Thread.sleep(2000);
	//click on checkbox
	driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	Thread.sleep(2000);
	//click on checkout
	driver.findElement(By.id("checkout")).click();
	Thread.sleep(2000);
	//click on continue
	driver.findElement(By.xpath("//input[@onclick=\"Billing.save()\"]")).click();
	Thread.sleep(2000);
	//click on checkbox
	driver.findElement(By.xpath("//input[@id=\"PickUpInStore\"]")).click();
	Thread.sleep(2000);
	//click on continue
	driver.findElement(By.xpath("//input[@onclick=\"Shipping.save()\"]")).click();
	Thread.sleep(2000);
	//click on payment
	driver.findElement(By.xpath("//input[@id=\"paymentmethod_0\"]")).click();
	Thread.sleep(2000);
	//click on continue
	driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
	Thread.sleep(2000);
	//click on continue
	driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
	Thread.sleep(2000);
	//click on confirm
	driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
	
	//print
	{
		System.out.println("Your order has been successfully processed!");
	}
	
	//click on continue
	driver.findElement(By.xpath("//input[@onclick=\"setLocation('/')\"]")).click();
	
	//logout
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	}
	

			
			
			
			
			
			
			
			


//[@class='top-menu']/descendnat::a[contains(text(),'Books')]