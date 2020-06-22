package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DatePickerPage {
    WebDriver Pckpage;
    public DatePickerPage(WebDriver driver){
        Pckpage=driver;
        PageFactory.initElements(Pckpage,this);

    }

  @FindBy(id="datepicker")
  WebElement datepick;

    @FindBy(xpath="//td[@data-handler='selectDay']/a")
    List<WebElement> allDates;

    public void clickDatePick(){
        datepick.click();
    }

    public void getAllDates(int date){

        for(WebElement eachDate: allDates){
            if(eachDate.getText().equals(date)){
                eachDate.click();
                break;
            }
        }
    }
}
