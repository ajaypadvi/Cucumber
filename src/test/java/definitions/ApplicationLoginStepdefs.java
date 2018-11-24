package definitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

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
        System.out.println("--");
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
        System.out.println("--");
    }

    @When("^User signs up to application with following details$")
    public void userSignsUpToApplicationWithFollowingDetails(DataTable rows) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        List<List<String>> object = rows.raw();
        List<String> record = object.get(0);
        System.out.println("User signing up into application with following details");
        System.out.println("Name: " + record.get(0));
        System.out.println("Password: " + record.get(1));
        System.out.println("Email: " + record.get(2));
        System.out.println("City: " + record.get(3));
        System.out.println("Phone Number: " + record.get(4));
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cardsDisplayedAre(String displayCards) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("Cards to be displayed: " + displayCards);
        System.out.println("--");
    }

    @When("^User logs into application with (.+) and (.+)$")
    public void userLoginToApplicationWithUserNameAndPassword(String username, String password) throws Throwable {
        System.out.println("UserName: " + username + ", Password" + password);
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }
}
