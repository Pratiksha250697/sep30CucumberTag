package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTagsTest 
{
	@Given("Test one Background")
	public void test_one_Background() {
		System.out.println("Test one Background");
	}

	@When("Test two Background")
	public void test_two_Background() {
		System.out.println("Test two Background");
	}

	@Then("Test three Background")
	public void test_three_Background() {
		System.out.println("Test three Background");
	}


@Given("Its a smoke first test")
public void its_a_smoke_first_test() {
    System.out.println("Its a smoke first test");
}

@When("Its a smoke second test")
public void its_a_smoke_second_test() {
	 System.out.println("Its a smoke second test");
}

@Then("Its a smoke third test")
public void its_a_smoke_third_test() {
	 System.out.println("Its a smoke third test");
}

@Given("Its a Regression first test")
public void its_a_Regression_first_test() {
	 System.out.println("Its a Regression first test");
}

@When("Its a Regression second test")
public void its_a_Regression_second_test() {
	System.out.println("Its a Regression second test");
}

@Then("Its a Regression third test")
public void its_a_Regression_third_test() {
	System.out.println("Its a Regression third test");
}

@Given("Its a Integration first test")
public void its_a_Integration_first_test() {
	System.out.println("Its a Integration first test");
}

@When("Its a Integration second test")
public void its_a_Integration_second_test() {
	System.out.println("Its a Integration second test");
}

@Then("Its a Integration third test")
public void its_a_Integration_third_test() {
	System.out.println("Its a Integration third test");
}
}
