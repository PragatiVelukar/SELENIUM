package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppWorkingWithDropdown
{
	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on UI testing
	    driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	    
	    //click on dropdown
	    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	    
	    //enter mobno
	    driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("2345677889",Keys.ENTER);
	    
	    //select gender
	    WebElement dropdown=driver.findElement(By.id("select2"));
	    
	    //create object
	    Select s=new Select(dropdown);
	    
	    //use method
	    s.selectByValue("female");
	    
	    //select country
	    WebElement dropdown1=driver.findElement(By.id("select3"));
	    
	    //create object
	    Select s1=new Select(dropdown1);
	    
	    //use method
	    s1.selectByIndex(2);
	    
	  //select state
	    WebElement dropdown2=driver.findElement(By.id("select5"));
	   
	  //create object
	    Select s2=new Select(dropdown2);
	    
	  //use method
	   s2.selectByValue("Hessen");
	   
	   //select city
	    //WebElement dropdown3=driver.findElement(By.id("optionCity"));
	   
	  //create object
	   // Select s3=new Select(dropdown3);
	    
	  //use method
	  //s3.selectByValue("Select City");
	  
	   //Select quantity of shoes
	   WebElement dropdown4=driver.findElement(By.id("select7"));
	   
	   //create object
	    Select s4=new Select(dropdown4);
	    
	    //use method
	    s4.selectByIndex(2);
	    
	    driver.findElement(By.xpath("//button[@type='submit']"));
	    
	    
	    
	    }
}
