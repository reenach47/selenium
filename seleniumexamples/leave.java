package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leave {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//li[3]")).click();
        driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']/a[1]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();		
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-05-23");
        		  driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");
        		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        		  driver.findElement(By.xpath("//button[@type='submit']]")).click();
        		  
        		  
        
        
 
        }}
	

