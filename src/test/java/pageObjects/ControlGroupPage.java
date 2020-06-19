package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ControlGroupPage {
    WebDriver ctrlPage;
    public ControlGroupPage(WebDriver driver){
        ctrlPage=driver;
        PageFactory.initElements(ctrlPage,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Controlgroup')]")
    WebElement header;

    public String headerText(){
        return header.getText();
    }
}
