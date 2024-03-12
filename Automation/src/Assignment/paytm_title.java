package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm_title {
public static void main(String[]args) {
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//launch the web application
	driver.get("https://paytm.com/");
	//actual title
	String actualTitle=driver.getTitle();
	//expected title
	String expectedTitle="Paytm: Secure &amp; Fast UPI Payments, Recharge Mobile &amp; Pay Bills";
	//verifying the title
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("test case is pass");
	}
	else
	{
		System.out.println("test case is fail");
	}	
	}
}
