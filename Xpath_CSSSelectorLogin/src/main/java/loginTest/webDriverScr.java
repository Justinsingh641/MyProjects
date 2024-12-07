package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverScr {
    private WebDriver driver;
    
    // Method to use Chrome WebDriver
    public WebDriver useChrome() {
        System.setProperty("webdriver.chrome.driver", "path/to/Chrome/webdriver");
        driver = new ChromeDriver();
        return driver;
    }

    // Method to use Firefox WebDriver
    public WebDriver useFirefox() {
        System.setProperty("webdriver.gecko.driver", "path/to/firefox/webdriver"); 
        driver = new FirefoxDriver();
        return driver;
    }

    // Method to use Edge WebDriver
    public WebDriver useEdge() {
        System.setProperty("webdriver.edge.driver", "path/to/Edge/webdriver"); 
        driver = new EdgeDriver();
        return driver;
    }
}


