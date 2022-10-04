package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.asserts.SoftAssert;
public class cucumber {
	private static WebDriver driver=null;
	
	//WebDriver driver = new ChromeDriver();

	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    @SuppressWarnings("unused")
		String expectedresult;
		@SuppressWarnings("unused")
		WebElement actualresult;
	    expectedresult="PIM";
	    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']"));
	    SoftAssert soft=new SoftAssert();
	    soft.assertEquals(actualresult,expectedresult);
	    
	}
	@Then("user is logged out")
	public void user_is_logged_out() {
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
        
	}
	   
}
