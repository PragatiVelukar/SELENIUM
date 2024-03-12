package SearchContext;

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
		
		//search product
        driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Kurti",Keys.ENTER);
	    
        //identify all kurti prices
    	List<WebElement> KurtiName=driver.findElements(By.xpath("//h3[@class='product-brand']"));
    	
    	//price of kurtis
    	List<WebElement> KurtiPrice=driver.findElements(By.xpath("//div[@class='product-price']"));
    	
  
    	for(int i=0;i<KurtiName.size();i++)
    	{
    		System.out.println(KurtiName.get(i).getText()+"======"+KurtiPrice.get(i).getText());
    	}
	
}
}
