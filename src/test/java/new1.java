//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.ArrayList;
//
//public class new1 {
//
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//
//    // Create a new Chrome driver instance
//    WebDriver driver = new ChromeDriver();
//
//    // Navigate to the first URL
//        driver.get("https://www.dating-group.org/ardlpc");
//
//    // Open a new tab and switch to it
//        ((JavascriptExecutor) driver).executeScript("window.open()");
//    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//
//    // Navigate to the second URL
//        driver.get("https://www.amolatina.com");
//
//    // Close the second tab and switch back to the first tab
//        driver.close();
//        driver.switchTo().window(tabs.get(0));
//
//    // Quit the driver instance
//        driver.quit();
//}
