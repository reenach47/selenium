package pack1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("file:///C:/Users/EI13147/Downloads/WebTable.html");
		  Thread.sleep(500);
		  driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).click();
		  String value=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		  System.out.println("Value is " +value);
		}
		//driver.close();

	}

