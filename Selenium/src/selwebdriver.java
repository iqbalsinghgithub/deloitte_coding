import java.io.File;
import java.io.IOException;
import org.apache.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.io.LeakTrackingByteBufferPool;

public class selwebdriver {
	
	
	private static String fileWithPath;
	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette",true);
		WebDriver driver=new ChromeDriver();
		// Run all these code one by one 
	/*	code for searching on youtube
	 * ------------------------------------
	 * driver.get("https://youtube.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("kapil sharma");
		driver.findElement(By.id("search-icon-legacy")).click();
		-----------------------------------
		*/
		
	/* checkbox example
	 * --------------------------------------------------------------
	 * 	driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=73aa03a6-0d86-4e56-ad43-79192482a62c&as-backfill=on");
		driver.manage().window().maximize();
		WebElement chkbox=driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[4]/div[2]/div/div[1]/div/div/label/div[1]"));
		chkbox.click();
		
		if(!chkbox.isSelected())
		{
			System.out.println("Check is off");
		}
		-------------------------------------------------------------------
		*/
		
		/*radiobutton Example
		--------------------------------------------
		driver.get("https://facebook.com");
		WebElement rad=driver.findElement(By.id("u_0_z"));
		rad.click();
		
		if(!rad.isSelected())
		System.out.println("radio is on");
		============================================
		*/
		
		/*
		link example
		============================================
		driver.get("https://facebook.com");
		WebElement link=driver.findElement(By.id("u_0_13"));
		link.click();
		============================================
	
		==================================
		driver.get("https://facebook.com");
		WebElement link=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a"));
		link.click();
		WebElement newlink=driver.findElement(By.id("did_submit"));
		newlink.click();
		=================================
		*/
		
	/* ============================
	 * 	driver.get("https://facebook.com")
		Select dropdate=new Select(driver.findElement(By.id("day")));
		dropdate.selectByVisibleText("15");
		==============================================
		*/
		/*
		driver.get("https://facebook.com");
		Select css=new Select(driver.findElement(By.cssSelector("#u_0_o")));
		*/
		
	}

}
