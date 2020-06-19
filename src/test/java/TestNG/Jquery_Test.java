package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.ControlGroupPage;
import pageObjects.JQueryHPage;

public class Jquery_Test {
    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    ControlGroupPage controlGroupPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdrive.chrome.driver","C:\\Users\\demir\\MaavenProject\\chrome.exe");
        baseUrl= "https://jqueryui.com/";
        driver= new ChromeDriver();
        jQueryHPage= new JQueryHPage(driver);
        controlGroupPage= new ControlGroupPage(driver);
        driver.manage().window().maximize();
        driver.get(baseUrl);


//        driver.findElement(By.id("//aside[@class='widget']//a[contains(text(),'Controlgroup')]")).click();
//       driver.switchTo().frame("iframe.demo-frame");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @Test
   public void clickControlGroup(){

        jQueryHPage.clickCtrlGroup();
        jQueryHPage.switchFrame();
        Assert.assertEquals(controlGroupPage.headerText(),"Controlgroup");
    }

}
