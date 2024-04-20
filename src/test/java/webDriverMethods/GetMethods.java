package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		System.out.println(ob.getTitle());
		System.out.println(ob.getCurrentUrl());
		// ob.getPageSource();
		System.out.println(ob.getWindowHandle());
		ob.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println(ob.getWindowHandles());

	}

}
