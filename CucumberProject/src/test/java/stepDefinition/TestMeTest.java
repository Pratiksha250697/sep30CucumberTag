package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMeTest 
{
	WebDriver driver;

	@Given("user is on TestMeApp Page")
	public void user_is_on_TestMeApp_Page() {
		System.out.println("User is on Home Page");
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm"); 
		
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password)
	{
		System.out.println("user enters username and password");
		driver.findElement(By.xpath("//a[contains(.,'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Display message Loggedin successfully")
	public void display_message_Loggedin_successfully() throws InterruptedException 
	{
		System.out.println("user logged in successfully");
		Thread.sleep(3000);
		driver.close();
	}

}
