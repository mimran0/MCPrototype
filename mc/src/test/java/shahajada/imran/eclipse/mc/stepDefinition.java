package shahajada.imran.eclipse.mc;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	@Given("^this is my first dummy given step$")
	public void this_is_my_first_dummy_given_step() throws Throwable {
	   System.out.println("LOST ON JENKINS");
	}

	@When("^this is my first dummy when step$")
	public void this_is_my_first_dummy_when_step() throws Throwable {
	    System.out.println("Prototype on Jenkins");
	}

	@Then("^this is first dummy then step$")
	public void this_is_first_dummy_then_step() throws Throwable {
	    System.out.println("Prototype");
	}
}
