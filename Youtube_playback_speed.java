package Youtube_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_playback_speed {
  WebDriver driver;
  ChromeOptions co;
  @BeforeTest
  void setup() throws InterruptedException
	{
		co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://youtu.be/cR_FqveTewo");
		driver.manage().window().maximize();
	   
		
		
	}
   @Test
   void Action() throws InterruptedException
	{  
		driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
		Thread.sleep(8000);
   
	    driver.findElement(By.xpath("//button[@title='Settings']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ytp-id-18\"]/div/div/div[2]/div[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ytp-id-18\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@title='Settings']")).click();
	    Thread.sleep(5000);
	}
	 
  @AfterTest
  void tearDown()
    {
	   driver.close();
    }
 }
