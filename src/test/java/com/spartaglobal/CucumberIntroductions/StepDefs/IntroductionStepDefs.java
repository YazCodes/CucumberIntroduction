package com.spartaglobal.CucumberIntroductions.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroductionStepDefs {

    @Given("I am a first time user of cucumber")
    public void i_am_a_first_time_user_of_cucumber() {
        System.out.println("here is my given clause");
    }

    @When("I execute this script")
    public void i_execute_this_script() {
        System.out.println("here is my then clause");
    }

    @Then("I will hopefully understand more about cucumber")
    public void i_will_hopefully_understand_more_about_cucumber() {
        System.out.println("here is my then clause");
    }

    @Given("I find cucumber interesting")
    public void i_find_cucumber_interesting() {
        System.out.println("I have added an add");

}

    @Given("I have an integer of {int}")  //curly bracket = expressions
    public void i_have_an_integer_of(Integer int1) {
        System.out.println(int1);
    }

    @Then("I am able to print it")
    public void i_am_able_to_print_it() {
        System.out.println("int printed");
    }

    //New

    @Given("I have float\\/double {double}")
    public void i_have_float_double(Double double1) {
        System.out.println(double1);
    }

    @Then("I can print this too")
    public void i_can_print_this_too() {
        System.out.println("wow a double");
    }

    @Given("I have fruit {int} {string}")
    public void i_have_fruit(int numOfFruits, String fruit) {
        System.out.println(numOfFruits + fruit);
    }


    @Then("I eat it non non")
    public void i_eat_it_non_non() {
        System.out.println("I printed");
    }


}
