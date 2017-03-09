package hilight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	public static void main(String args[]) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		WebElement name=driver.findElement(By.id("Email"));
		//Helper he=new Helper();
		Helper.see(driver,name);
		name.sendKeys("giswarya1991");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
	WebElement pass=driver.findElement(By.xpath(".//*[@id='Passwd']"));
    Helper.see(driver,pass);
	pass.sendKeys("krishna5");
	
	
	}

}
