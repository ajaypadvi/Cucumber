package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationLoginStepdefs {
    @Given("^User is on net banking login page$")
    public void userIsOnNetBankingLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("User is navigated to net banking login page");
    }

    @When("^User login to application with username and password$")
    public void userLoginToApplicationWithUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("User tried logging into netbanking username and password into the system");
    }

    @Then("^Home page is populated$")
    public void homePageIsPopulated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("Validated the home page");
    }

    @And("^Cards are displayed$")
    public void cardsAreDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("Validated the cards on the home page");
    }

    @When("^User login to application with \"([^\"]*)\" and \"(\\d+)$")
    public void userLoginToApplicationWithAnd(String username, int password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("User tried logging into netbanking username: " + username + " and password: " + password + " into the system");
    }

    @When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginToApplicationWithAnd(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("User tried logging into netbanking username: " + username + " and password: " + password + " into the system");

    }

    @And("^Cards are not displayed$")
    public void cardsAreNotDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("Validated that the cards are not displayed on the home page");
    }
}
