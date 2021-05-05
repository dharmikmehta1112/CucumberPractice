package sample.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Dharmik Mehta
 */
public class Calculator {
	
	int firstNum = 0, secondNum = 0, addResult = 0, mulResult = 0; 
	
	@Given("I have first number as {int}")
	public void i_have_first_number_as(Integer int1) {
		this.firstNum = int1;
	}

	@Given("second number as {int}")
	public void second_number_as(Integer int2) {
		this.secondNum = int2;
	}

	@When("I add them")
	public void i_add_them() {
		this.addResult = this.firstNum + this.secondNum;
	}

	@Then("diplay the correct add result")
	public void diplay_the_correct_add_result() {
		System.out.println("Addition of 2 given numbers:: "+addResult);
	}

	@When("I multiply them")
	public void i_multiply_them() {
		this.mulResult = this.firstNum * this.secondNum;
	}

	@Then("diplay the correct multiply result")
	public void diplay_the_correct_multiply_result() {
		System.out.println("Multiplication of 2 given numbers:: "+mulResult);
	}
}