package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class paytm_url {
	public static void main(String[]args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//to fetch the url
		driver.get("https://paytm.com/");
		//to fetch url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://paytm.com/";
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is wrong");
		}
	}
}
