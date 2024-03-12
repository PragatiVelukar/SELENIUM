package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra 
{

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("jeans",Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Women']")).click();
		driver.findElement(By.xpath("//label[text()='Roadster']")).click();
		driver.findElement(By.xpath("//label[text()='Rs. 1030 to Rs. 1687']")).click();
		driver.findElement(By.xpath("//label[text()='Black']")).click();
		
		//jeans brand
		List<WebElement> JeansName=driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		//jeans price
		List<WebElement> JeansPrice=driver.findElements(By.xpath("//span[text()='649']"));
		
		for(int i=0;i<JeansName.size();i++)
    	{
    		System.out.println(JeansName.get(i).getText()+"======"+JeansPrice.get(i).getText());
    	}
		
		
	}
}
