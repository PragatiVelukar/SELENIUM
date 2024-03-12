package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElementsMethod 
{

public static void main(String[] args) 
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	
	//search ipad 
	driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
	
	//identify all ipad name
	List<WebElement> ipadName=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	//identify all ipad price
	List<WebElement> ipadPrice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	//for each loop
//	for(WebElement name:ipadName)
//  {
//	System.out.println(name.getText());
	
//   }
	
	//for loop
	for(int i=0;i<ipadName.size();i++)
	{
		System.out.println(ipadName.get(i).getText()+"======"+ipadPrice.get(i).getText());
	}
	
	}
	}

