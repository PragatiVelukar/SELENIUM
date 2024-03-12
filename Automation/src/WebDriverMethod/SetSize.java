package WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize 
{
public static void main(String[] args)
{

	//to launch the browser
	WebDriver driver=new ChromeDriver();
	
	//create the object of dimention class
	Dimension dimention=new Dimension(1000,2000);
	
	//set the size
	driver.manage().window().setSize(dimention);
	
	//launch the application
	driver.get("https://www.google.com");
}
}
