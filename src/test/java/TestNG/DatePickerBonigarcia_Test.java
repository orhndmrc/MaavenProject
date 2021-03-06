package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import managers.DriverMgr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.DatePickerPage;
import pageObjects.JQueryHPage;

public class DatePickerBonigarcia_Test {
    WebDriver driver;
    String baseUrl;
    JQueryHPage jQueryHPage;
    DatePickerPage datePickerPage;

    @BeforeClass
    public void setUp(){
        //System.setProperty("webdrive.chrome.driver","C:\\Users\\demir\\MaavenProject\\chrome.exe");
        //WebDriverManager.firefoxdriver().setup();
        baseUrl= "https://jqueryui.com/";
        driver= DriverMgr.getDriver();
        jQueryHPage= new JQueryHPage(driver);
        datePickerPage= new DatePickerPage(driver);

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
   public void selectDateTest() throws Exception{

        jQueryHPage.clickDatePicker();
        jQueryHPage.switchFrame();
        datePickerPage.clickDatePick();
        datePickerPage.getAllDates(4);
        Thread.sleep(5000);

    }


}
