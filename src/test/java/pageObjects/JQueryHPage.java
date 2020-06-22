package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryHPage {
    WebDriver jquery;

    public JQueryHPage(WebDriver driver){
        jquery=driver;
        PageFactory.initElements(jquery,this);
    }

    @FindBy(xpath="//aside[@class='widget']//a[contains(text(),'Controlgroup')]")
     WebElement controlGroup;

    @FindBy(linkText = "Datepicker")
    WebElement datePicker;

    @FindBy(className = "demo-frame")
    WebElement frame;

     public void clickCtrlGroup(){
     controlGroup.click();
}
     public void switchFrame(){
         jquery.switchTo().frame(frame);
}
   public void clickDatePicker(){
         datePicker.click();
   }
}
