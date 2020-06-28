package stepDefs;

import io.cucumber.java.en.*;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.ControlGroupPage;
import pageObjects.DatePickerPage;
import pageObjects.JQueryHPage;

public class ControlgroupDefs {
    JQueryHPage jQueryHPage;
    ControlGroupPage controlGroupPage;
    WebDriver driver;

    @Given("I am on the  homepage")
    public void i_am_on_the_homepage()  {
        System.out.println("given");
        driver= DriverMgr.getDriver();
        jQueryHPage= new JQueryHPage(driver);
        controlGroupPage= new ControlGroupPage(driver);
    }

    @Then("I click on controlgroup button")
    public void i_click_on_controlgroup_button()  {
        System.out.println("clicking the button");
        jQueryHPage.clickCtrlGroup();
    }

    @Then("I switch to another frame")
    public void i_switch_to_demoframe() {
        System.out.println("switching the frame");
        jQueryHPage.switchFrame();
    }

    @Then("I validate header")
    public void i_validate_header()  {
        System.out.println("validation");
        Assert.assertEquals(controlGroupPage.headerText(),"Controlgroup");
    }
}
