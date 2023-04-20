package form;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import date.Elements;
import date.Mail;
import date.PasswordGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class Form1 {
    WebDriver driver = new ChromeDriver();
    Elements elements = new Elements();


    public String email = new Mail().email();
    Faker faker = new Faker();
    String name = faker.name().firstName();
    PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
            .useDigits(true)
            .useLower(true)
            .useUpper(true)
            .build();
    String password = passwordGenerator.generate(8);

    public Form1 whoFemMal() {
        Selenide.sleep(3000);

//        driver.findElement(By.cssSelector(".radio.mood label:nth-child(4)")).click();

        $(".radio.mood label:nth-child(4)").shouldBe(visible).click();
        $("#content-fixator > div > section > div.hero__search > div > div.search-quiz.search__quiz > form.search-quiz__step.search-step.search-step--current > div.search-step__submit > button").scrollIntoView(true).shouldBe(visible).click();

        elements.malLeftWho.shouldBe(visible).click();
        elements.femRightWho.shouldBe(visible).click();
        elements.minage.shouldBe(visible).selectOptionByValue("40");
        elements.maxage.shouldBe(visible).selectOptionByValue("45");
        $("#content-fixator > div > section > div.hero__search > div > div.search-quiz.search__quiz > form.search-quiz__step.search-step.search-step--current > div.search-step__submit > button").shouldBe(visible).click();

        $(".masonry label:nth-child(4)").shouldBe(visible).click();
        $("#content-fixator > div > section > div.hero__search > div > div.search-quiz.search__quiz > form.search-quiz__step.search-step.search-step--current > div.search-step__submit > button").shouldBe(visible).click();

        elements.day.shouldBe(visible).selectOptionByValue("5");
        elements.month.shouldBe(visible).selectOptionByValue("2");
        elements.year.shouldBe(visible).selectOptionByValue("2001");
        $("#content-fixator > div > section > div.hero__search > div > div.search-quiz.search__quiz > form.search-quiz__step.search-step.search-step--current > div.search-step__submit > button").shouldBe(visible).click();

        elements.name.shouldBe(visible).setValue(name);
        $(By.xpath("//div[@id='content-fixator']/div/section/div/div/div[3]/form[6]/div[2]/button")).shouldBe(visible).click();
        elements.email.shouldBe(visible).setValue(email);
        elements.password.shouldBe(visible).setValue(password);
        $("form[name=\"form-email-password\"] button[type=\"submit\"]").shouldBe(visible).click();

        return this.whoFemMal();
    }

}
