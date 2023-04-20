import com.github.javafaker.Faker;
import core.BaseSelenideTest;
import date.Elements;
import date.Mail;
import date.PasswordGenerator;
import form.Form1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class OnDemand extends BaseSelenideTest {

//    WebElement headerCta = driver.findElement(By.cssSelector(".header-cta"));
    Elements elements = new Elements();
    WebDriver driver = new ChromeDriver();
    Form1 form1 = new Form1();
    public String email = new Mail().email();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
            .useDigits(true)
            .useLower(true)
            .useUpper(true)
            .build();
    String password = passwordGenerator.generate(8);


    @Test
    public void openNewWindowForTestProjectBlog () throws InterruptedException{
        driver.get("https://www.selenium.dev/");
        // A new tab is opened and switches to it
        open("https://www.eurodate.com/lpm04/");
        driver.switchTo().newWindow(WindowType.TAB);
        // Loads Sauce Labs open source website in the newly opened window
        driver.get("https://opensource.saucelabs.com/");
        sleep(5000);
    }



    @Test
    void canSwitchToWindowByIndex_chrome() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//        WebDriver driver = new ChromeDriver();

        // Open the first link and find the header CTA
        driver.get("https://www.dating-group.org/ardlpc");
        driver.findElement(By.cssSelector(".header-cta")).click();

        // Switch to the new tab and open the second link
        String firstTab = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            if (!tab.equals(firstTab)) {
                driver.switchTo().window(tab);
                driver.get("https://www.amolatina.com");
            }
        }

//        // Get the cookies from the first tab and print them
//        Set<Cookie> cookies = driver.manage().getCookies();
//        for (Cookie cookie : cookies) {
//            System.out.println(cookie.getName() + " : " + cookie.getValue());
//        }

        // Close the driver
        driver.quit();
    }

    @Test
    @DisplayName("www.amolatina.com/lp1/")
    public void amolatina_lp1() throws InterruptedException {
        driver.get("https://www.amolatina.com/lp1/");

        form1.whoFemMal();

        // Open a new tab and switch to it
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Navigate to the second URL
        driver.get("https://www.amolatina.com");
        sleep(5000);

        // Close the second tab and switch back to the first tab
        driver.close();
        driver.switchTo().window(tabs.get(0));

        // Quit the driver instance
        driver.quit();
    }


    @Test
    void datemyageFirst() throws InterruptedException {
        driver.get("https://www.datemyage.com/members1");
        //Test scenario
        $(".header-cta").shouldBe(visible).click();
        $("div#content-fixator div.search-quiz__step.active > form[name=\"form-mood\"] > div.search-step__body > div:nth-child(2) > div.radio.mood > label:nth-child(4)").shouldBe(visible).click();
        $(".active .button").scrollIntoView(true).shouldBe(visible).click();

        elements.malLeftWho.shouldBe(visible).click();
        elements.femRightWho.shouldBe(visible).click();
        elements.minage.shouldBe(visible).selectOptionByValue("40");
        elements.maxage.shouldBe(visible).selectOptionByValue("45");
        $(".active .button").shouldBe(visible).click();

        $(".masonry label:nth-child(4)").shouldBe(visible).click();
        $(".active .button").shouldBe(visible).click();

        elements.day.shouldBe(visible).selectOptionByValue("5");
        elements.month.shouldBe(visible).selectOptionByValue("2");
        elements.year.shouldBe(visible).selectOptionByValue("2001");
        $(".active .button").shouldBe(visible).click();

        elements.name.shouldBe(visible).setValue(name);
        $(".active .button").shouldBe(visible).click();

        elements.email.shouldBe(visible).setValue(email);
        elements.password.shouldBe(visible).setValue(password);
        $(".active .button").shouldBe(visible).click();

        // Open a new tab and switch to it
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Navigate to the second URL
        driver.get("https://www.amolatina.com");
        sleep(5000);

        // Close the second tab and switch back to the first tab
        driver.close();
        driver.switchTo().window(tabs.get(0));

        // Quit the driver instance
        driver.quit();
    }
}

