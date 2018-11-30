package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/payment-gateway/index.php");
		
		driver.findElement(By.xpath("//ul[@class='actions']")).click();
	
		driver.findElement(By.id("card_nmuber")).sendKeys("1088129912991212");
		
		Select ExMonth = new Select(driver.findElement(By.id("month")));
		ExMonth.selectByVisibleText("08");
		ExMonth.selectByIndex(8);
		
		
		Select ExYear = new Select(driver.findElement(By.id("year")));
		ExYear.selectByVisibleText("2019");
		ExYear.selectByIndex(3);
		
		driver.findElement(By.id("cvv_code")).sendKeys("111");
		
		driver.findElement(By.xpath("//ul[@class='actions']")).click();
		
		//driver.close();
		//driver.quit();
	}
}
