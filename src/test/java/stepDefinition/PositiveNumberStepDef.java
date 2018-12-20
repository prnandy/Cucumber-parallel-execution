package stepDefinition;

import cucumber.api.java.en.Then;

public class PositiveNumberStepDef 
{	
	String pos;
	
	
	@Then("^User check the two numbers for positive test$")
	public void user_check_the_two_numbers_for_positive_test() throws Throwable {
			if(10 >0 && 20 >0)
				pos="Positive";
	}

	@Then("^Print the pos$")
	public void print_the_pos() throws Throwable {
		System.out.println("Number is  :"+pos);
	}

}
