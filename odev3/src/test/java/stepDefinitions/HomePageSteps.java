package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        homePage.goToLoginPage();
    }
    @When("click oturum ac button in the top right")
    public void clickOturumAcButtonInTheTopRight() {
    }
    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        homePage.checkLoginPage();
    }

    @When("enter e-posta and click ileri button")
    public void enterEPostaAndClickIleriButton() {
        homePage.enterEposta();
    }

    @When("enter şifre and ileri button")
    public void enterŞifreAndIleriButton() {
        homePage.enterPassword();
    }
    @Then("should see page")
    public void shouldSeePage() {
        homePage.checkLoginPage();
    }
}
