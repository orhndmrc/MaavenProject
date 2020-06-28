package stepDefs;

import io.cucumber.java.en.*;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import pageObjects.checkBoxPage;

public class CheckboxradioDefs  {
    WebDriver driver;
    checkBoxPage checkboxpage;
    @Given("I navigate to jquery homepage")
    public void i_navigate_to_jquery_homepage() {
        // Write code here that turns the phrase above into concrete actions
   driver = DriverMgr.getDriver();
         checkboxpage = new checkBoxPage(driver);
        System.out.println("I am on the page");
    }

    @When("^I click on (\\w+) button$")
    public void i_click_on_button(String pageName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am landing the "+pageName+" page");
        checkboxpage.clickCheckbox();
    }

    @When("I switch the frame")
    public void i_switch_the_frame() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The frame is switched");
        checkboxpage.switchingFrame();
    }

    @Then("^I click on (\\d+) hotel rating$")
    public void i_click_on_hotel_rating(int rate) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Designating the hotel rating "+rate);
        checkboxpage.hotelRatingSelection();
    }

    @Then("I validate if the button is selected")
    public void i_validate_if_the_button_is_selected() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("validation");
        checkboxpage.validation();

    }


}
