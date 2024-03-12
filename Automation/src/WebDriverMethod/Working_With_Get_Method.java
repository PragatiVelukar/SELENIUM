package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Get_Method {
	  public static void main (String [] args) {
			
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.airvistara.com/in/en");
		  
		  
		  String actual_title=driver.getTitle();
		  
		  
		  String expected_title="Vistara Direct - Book Flight Tickets and Enjoy Exclusive Benefits";

		  if(actual_title.equals(expected_title))
		  {
			  System.out.println("TestCase is Pass");
		  }
		  else
		  {
			  System.out.println("TestCase is Fail");
		  }
			  
		  }
		  
		  
	  }

