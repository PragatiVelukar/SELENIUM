package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndPosition 
{
public static void main(String[] args)
{
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//get the size
	Dimension size=driver.manage().window().getSize();
	
	System.out.println(size);
	
	//get the position
	Point position=driver.manage().window().getPosition();
	
	System.out.println(position);
	
	driver.get("https://www.google.com");
}
}
