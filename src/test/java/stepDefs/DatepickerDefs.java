package stepDefs;

import io.cucumber.java.en.When;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import pageObjects.DatePickerPage;
import pageObjects.JQueryHPage;

public class DatepickerDefs {
    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatePickerPage datePickerPage;

    @When("I validate data selection")
    public void date_selection() throws Exception{
        System.out.println("inside date selection");
        driver= DriverMgr.getDriver();
        datePickerPage.clickDatePick();
        datePickerPage.getAllDates(4);
        Thread.sleep(5000);
    }


}
