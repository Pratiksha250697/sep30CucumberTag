package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberDatatableTest 
{
	WebDriver driver;
	
	@Given("user is on HerokuApp page")
	public void user_is_on_HerokuApp_page() 
	{
		System.out.println("User is on Home Page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/login"); 
		driver.manage().window().maximize(); 
	}

	@When("user enters username and password in herokuapp")
	public void user_enters_username_and_password_in_herokuapp(io.cucumber.datatable.DataTable credentials) {
		System.out.println("user enters username and password");
		List<String> data=credentials.asList();
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//i[contains(.,'Login')]")).click();
	}
	

	@Then("display message user logged in successful")
	public void display_message_user_logged_in_successful() throws InterruptedException {
		System.out.println("user logged in successfully");
		Thread.sleep(3000);
		driver.close();
	}
}
