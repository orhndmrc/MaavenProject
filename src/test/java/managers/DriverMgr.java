package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverMgr {
    static WebDriver driver;
    public static WebDriver getDriver(){
   String browserNm = System.getProperty("browser");
   if(driver==null){
       switch(browserNm){
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver= new ChromeDriver();
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver= new FirefoxDriver();
               break;
           case "edge":
               WebDriverManager.edgedriver().setup();
               driver= new EdgeDriver();
               break;
       }
   }
        return driver;
    }
}
