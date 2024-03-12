package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Current_Url {
	public static void main(String[]args) {
	//to launch the browser
	WebDriver driver=new ChromeDriver();
	//to maximize the browser
	driver.manage().window().maximize();
	//to fetch the url
	driver.get("https://www.airvistara.com/");
	//to fetch url
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.airvistara.com/in/en";
	if(actualUrl.equals(expectedUrl)) {
		System.out.println("url is correct");
	}
	else
	{
		System.out.println("url is wrong");
	}

}
}
