package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest
{ 
	WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.out.println("User is on Home Page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.get("http://newtours.demoaut.com/"); 
		driver.manage().window().maximize(); 
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successful() throws InterruptedException {
		System.out.println("user logged in successfully");
		Thread.sleep(3000);
		driver.close();
	}
}
