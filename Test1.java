import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String a[]){
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
        JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		/*		
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/input"));
		search.sendKeys("watches");		//search
		search.sendKeys(Keys.RETURN);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//select one of the search reasults
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[3]/div[2]/div[1]/div[4]/a/div[2]/img")).click();
		*/
		
		/*BOOK MOVIE TICKETS
		 //choose to watch movies*/
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/a/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//choose location
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/a[6]/img")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//choose movie
		 js.executeScript("window.scrollBy(0,700)");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/a/div[1]/img")).click();
		//choose show
		 js.executeScript("window.scrollBy(0,700)");
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[3]/div[1]/div[2]/div[11]/div[1]")).click();
		 //select seats
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[3]/div[97]/div[2]/div/div[3]/div[1]/div[2]/ul[1]/li[26]")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[3]/div[97]/div[2]/div/div[3]/div[1]/div[2]/ul[1]/li[25]")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/div[3]/div[97]/div[2]/div/div[4]/div/div/div/button")).click();
		

		
		 
		
						// driver.findElement(By.xpath("")).click();	

	}
	
	
	
	
}
