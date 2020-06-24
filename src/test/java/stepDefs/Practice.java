package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Practice {
    @When("^I read parameter \"(.*)\"$")
    public void oneparam(String param) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("param is: "+param);
    }
    @Given("^I login with \"([^\"]*)\" id and \"([^\"]*)\" password$")
    public void multiparams(String username, String password)  {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }

}
