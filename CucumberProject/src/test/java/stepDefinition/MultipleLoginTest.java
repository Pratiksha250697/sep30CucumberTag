package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLoginTest
{
	WebDriver driver;
	@Given("user is on DemoWebShop Page")
	public void user_is_on_DemoWebShop_Page() {
		System.out.println("User is on Home Page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.get("http://demowebshop.tricentis.com/"); 
		driver.manage().window().maximize(); 
	}

	@When("User enters {string} and<{string}>")
	public void user_enters_and(String username, String password)
	{
		System.out.println("user enters username and password");
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("Display message Logged in successfully")
	public void display_message_Logged_in_successfully() throws InterruptedException {
		System.out.println("user logged in successfully");
		Thread.sleep(3000);
		driver.close();
	}

}
