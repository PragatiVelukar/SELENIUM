package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion 
{
public static void main(String[] args)
{
	//launch the browser
	WebDriver driver=new ChromeDriver();
	
	//to create object of point class
	Point point=new Point(250,500);
	
	//set the position
	driver.manage().window().setPosition(point);
	
	//launch the application
	driver.get("https://www.google.com");
	
}
}
