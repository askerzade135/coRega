package core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Базовый класс для инициализации селенида
 */
abstract public class BaseSelenideTest {
    ChromeOptions chrome_options = new ChromeOptions();
    String user_agent = System.getProperty("user_agent");


//    @BeforeEach
//    public void setUp() throws MalformedURLException {
//        Configuration.remote = "http://64.227.125.170:4445/wd/hub";
//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "107.0";
//        Configuration.browserSize = "1920x1080";
//        System.setProperty("chromeoptions.args", "--user-agent=" + "\"" + user_agent + "\"");
//        Configuration.timeout = 15000;
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", false);
//        Configuration.browserCapabilities = capabilities;
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//    }


    @BeforeEach
    public void setUp(){
//        WebDriverManager.chromedriver().setup();//        chrome_options.addArguments("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/110.0.5388.204 Chrome/110.0.5388.204 Safari/537.36");
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.timeout = 6000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
