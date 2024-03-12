package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Page_Source {
	
public static void main(String[]args) {
	//to launch the browser
	WebDriver driver= new ChromeDriver();
	//to maximize the window
	driver.manage().window().maximize();
	//to launch web application
	driver.get("https://www.amazon.com");
	//to fetch the source code
	//String source=driver.getPageSource();
	//System.out.println("source");
	
}
}
