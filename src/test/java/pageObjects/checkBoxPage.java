package pageObjects;

import managers.DriverMgr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class checkBoxPage  {
    WebDriver Cdriver;
    public checkBoxPage(WebDriver driver){
        Cdriver=driver;
        PageFactory.initElements(Cdriver,this);
    }

    @FindBy(linkText = "Checkboxradio")
    WebElement checkbox;

     @FindBy(xpath="//label[contains(text(),'4 Star')]")
       WebElement rating;

//@FindBys(@FindBy(xpath="//label[contains(@class,'checkboxradio-radio-label')]/span[1]"))
//List<WebElement> radioButtons;

    public void clickCheckbox(){
        checkbox.click();

    }
    public void switchingFrame(){
        Cdriver.switchTo().frame(Cdriver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    }
    public void hotelRatingSelection(){

        rating.click();

    }

    public void validation(){
        boolean ActualIsSelected = rating.isEnabled() ;
        boolean ExpectedIsSelected= true;
        Assert.assertEquals(ActualIsSelected,ExpectedIsSelected,"fail");
    }
}
