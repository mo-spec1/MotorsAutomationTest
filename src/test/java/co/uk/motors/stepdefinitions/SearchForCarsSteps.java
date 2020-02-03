package co.uk.motors.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForCarsSteps {
    @Given("I navigate to the motors homepage")
    public void i_navigate_to_the_motors_homepage() {
    }

    @When("I Enter a M1 1FT")
    public void i_Enter_a_M1_1FT() {
    }

    @When("select a Audi and A3 between £2,{int} and £30,{int} price")
    public void select_a_Audi_and_A3_between_£2_and_£30_price(Integer int1, Integer int2) {
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
    }

    @Then("I can select a Audi A3 from the search result")
    public void i_can_select_a_Audi_A3_from_the_search_result() {
    }

    @Then("details of the selected product is displayed")
    public void details_of_the_selected_product_is_displayed() {
    }

    @When("I Enter a RM15 6EU")
    public void i_Enter_a_RM15_6EU() {
    }

    @When("select a Land Rover and Discovery between £7,{int} and £40,{int} price")
    public void select_a_Land_Rover_and_Discovery_between_£7_and_£40_price(Integer int1, Integer int2) {
    }

    @Then("I can select a Land Rover Discovery from the search result")
    public void i_can_select_a_Land_Rover_Discovery_from_the_search_result() {
    }

    @When("I Enter a OL10 6YG")
    public void i_Enter_a_OL10_6YG() {
    }

    @When("select a Bentley and Bentayga between £88,{int} and £219,{int} price")
    public void select_a_Bentley_and_Bentayga_between_£88_and_£219_price(Integer int1, Integer int2) {
    }

    @Then("I can select a Bentley Bentayga from the search result")
    public void i_can_select_a_Bentley_Bentayga_from_the_search_result() {
    }
}
