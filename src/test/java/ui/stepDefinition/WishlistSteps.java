package ui.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pages.Login;
import ui.pages.Profile;
import ui.pages.Welcome;

public class WishlistSteps {
    private Welcome welcome;
    private Login login;
    private Profile profile;

    public WishlistSteps(Welcome welcome, Login login, Profile profile) {
        this.welcome = welcome;
        this.login = login;
        this.profile = profile;
    }
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I search with {} and {}")
    public void iSearchWithAndPassword(String arg0, String arg1) {
    }

    @Then("I should see {} in the wishlist")
    public void iShouldSeeInTheWishlist(String arg0) {

    }
}
