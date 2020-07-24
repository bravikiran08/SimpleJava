package Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip 
{

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI KIRAN\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Activities")).click();
		Thread.sleep(3000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String linkname=links.get(i).getText();
			String linksurl=links.get(i).getAttribute("href");
			System.out.println(linkname+"   "+linksurl);
		}
		
		driver.close();
	}
	
}
