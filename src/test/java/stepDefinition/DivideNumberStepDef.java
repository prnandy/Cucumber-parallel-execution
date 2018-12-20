package stepDefinition;

import cucumber.api.java.en.Then;

public class DivideNumberStepDef 
{	
	int div;
	
	@Then("^User divide this two number$")
	public void user_divide_this_two_number() throws Throwable {
		div = 20/10;
	}

	@Then("^Print the div$")
	public void print_the_div() throws Throwable {
		System.out.println("Divided Number is : "+div);
	}

}
