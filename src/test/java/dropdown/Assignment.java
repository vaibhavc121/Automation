package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
//		WebElement ele = driver.findElement(By.xpath("//select[@id='country-list']"));
//		Select select = new Select(ele);
//
//		System.out.println(select.getOptions().size());
//		List<WebElement> op = select.getOptions();
//		for (int i = 0; i < op.size(); i++)
//		{
//			System.out.println(op.get(i).getText());
//		}
//
//		select.selectByValue("2");

//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		// driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
//		driver.findElement(By.xpath(
//				"//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"))
//				.click();
//		List<WebElement> op = driver.findElements(By.xpath("//div[@role='listbox']//span"));
//		System.out.println(op.size());
//		for (int i = 0; i < op.size(); i++)
//		{
//			System.out.println(op.get(i).getText());
//		}
//
//		driver.findElement(By.xpath("//span[normalize-space()='Full-Time Contract']")).click();

//		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement ele = driver.findElement(By.xpath("//select[@id='colors']"));
//
//		Select slct = new Select(ele);
//		slct.selectByValue("green");
//		List<WebElement> list = slct.getOptions();
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i).getText());
//		}

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(ele.size());

		// ele.get(1).click();
		for (int i = 0; i < ele.size(); i++)
		{
			ele.get(i).getText();
			if (ele.get(i).getText().equals("selenium"))
			{
				ele.get(i).click();
				break;
			}
		}

	}

}
