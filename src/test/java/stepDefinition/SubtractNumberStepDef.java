package stepDefinition;

import cucumber.api.java.en.Then;

public class SubtractNumberStepDef 
{	
	int sub;
	
	@Then("^User subtract this two number$")
	public void user_subtract_this_two_number() throws Throwable {
		sub = 20-10;
	}

	@Then("^Print the sub$")
	public void print_the_sub() throws Throwable {
		System.out.println("Subtracted Number is : "+sub);
	}
}
