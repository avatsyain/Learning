package com.eviltester.webdriver;

import cucumber.api.java.en.*;

/**
 * Created by Admin on 13-01-2015.
 */
public class Steps {
    @Given("^print1$")
        public void print1() {
        System.out.print("Ashish kumar");
    }

    @When("^step2$")
    public void step2(){
        System.out.println("Step 2");
    }

    @Then("^step 3$")
    public  void step3(){
        System.out.println("Step3");
    }


//    @Given("^Login as a user$")
//    public void Login_as_a_user(List<Map<String,String>> data){
//        Map<String,String>str=data.get(0);
//        System.out.print(str);
//
//    }
}
