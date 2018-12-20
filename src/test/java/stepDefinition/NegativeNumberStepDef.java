package stepDefinition;

import cucumber.api.java.en.Then;

public class NegativeNumberStepDef 
{	
String neg;
	
	@Then("^User check the two numbers for negative test$")
	public void user_check_the_two_numbers_for_negative_test() throws Throwable {
		if(-10 <0 && -20 <0)
			neg="Negative";
	}

	@Then("^Print the neg$")
	public void print_the_neg() throws Throwable {
		
		System.out.println("Number is  :"+neg);
	}

}
