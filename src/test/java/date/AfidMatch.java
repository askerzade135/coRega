package date;

import com.codeborne.selenide.WebDriverConditions;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.webdriver;

public class AfidMatch {

    String url() {
        return WebDriverRunner.url();
    }


    public AfidMatch linkShouldHaveAfid() {
//        String currentUrl = url();
        webdriver().shouldHave(WebDriverConditions.urlContaining("afid=1906990922"));
//        assertThat(currentUrl, containsString(""));
//        $x("//*[normalize-space(text())]").shouldHave();

        return this;
    }
}
