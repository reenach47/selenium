package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Ashok\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("11");
		//select.selectByIndex(9);

	}

}
