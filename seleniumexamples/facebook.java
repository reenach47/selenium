package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805646%7Cb%7Cfacebook%20new%20account%20create%7C&placement=&creative=550525805646&keyword=facebook%20new%20account%20create&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-21496185646%26loc_physical_ms%3D1007771%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeaebW26C-qWLmqK1_9wOZz0cwSI5zp1ZOoyXEVNTCZXAJWg-j5cLDhoCsVYQAvD_BwE");
		Thread.sleep(100);
        driver.findElement(By.name("firstname")).sendKeys("Admin");
        driver.findElement(By.name("surname")).sendKeys("123");
        driver.findElement(By.name("reg_email__")).sendKeys("admin@gmail.com");
        driver.findElement(By.name("reg_password__")).sendKeys("admin@123");
        driver.findElement(By.id("day")).sendKeys("8");
        driver.findElement(By.id("month")).sendKeys("may");
        driver.findElement(By.id("year")).sendKeys("1994");
        driver.findElement(By.name("gender")).sendKeys("Female");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.name("websubmit")).click();
	}

}
