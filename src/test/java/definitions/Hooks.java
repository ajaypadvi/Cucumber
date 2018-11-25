package definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeMobileTestValidation(){
        System.out.println("Runs the validation before mobile test");
    }

    @After("@MobileTest")
    public void afterMobileTestValidation(){
        System.out.println("Runs the validation after mobile test");
    }
}
