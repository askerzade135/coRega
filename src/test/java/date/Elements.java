package date;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class Elements {

    //выбор языка
    public final SelenideElement choseLanguageSelector = $(".trigger");
    public final SelenideElement choseLanguageSelector2 = $(".language-select > .trigger");
    public final SelenideElement choseES = $(".dropdown > li:nth-child(1) > a");
    public final SelenideElement choseES2 = $(".dropdown > li:nth-child(2) > a");
    public final SelenideElement choseES3 = $(".dropdown > li:nth-child(3) > a");


    //выбор гендера слева
    public final SelenideElement femLeftSearhRow = $(".search-row .gender .fem");
    public final SelenideElement malLeftSearhRow = $(".search-row .gender .mal");
    public final SelenideElement femLeftWho = $(".who-am-i .gender .fem");
    public final SelenideElement malLeftWho = $(".who-am-i .gender .mal");
    //выбор гендера справа
    public final SelenideElement malRightSearhRow = $(".search-row .preferences .mal");
    public final SelenideElement femRightSearhRow = $(".search-row .preferences .fem");
    public final SelenideElement femRightWho = $(".who-am-i .preferences .fem");
    public final SelenideElement malRightWho = $(".who-am-i .preferences .mal");

    //выбор гендера кнопка, слева справа
    public final SelenideElement genderLeft = $(".choice:nth-child(1) > .action:nth-child(1)");
    public final SelenideElement genderRight = $(".choice:nth-child(1) > .action:nth-child(2)");

    //выбор гендера кнопка, сверху снизу
    public final SelenideElement genderAbove = $(".btn-group > .btn:nth-child(1)");
    public final SelenideElement genderbelow = $(".btn-group > .btn:nth-child(2)");

    //
    public final SelenideElement hateIt = $(".current > .choice > .action:nth-child(2)");
    public final SelenideElement loveIt = $(".current > .choice > .action:nth-child(1)");
    public final SelenideElement maybe = $(".current > .choice > .action:nth-child(3)");


    //выбор возраста
    public final SelenideElement minage = $(byName("minage"));
    public final SelenideElement maxage = $(byName("maxage"));

    //кнопка сабмит впервый раз
    public final SelenideElement submit = $(byName("submit"));

    //селектор даты
    public final SelenideElement day = $(byName("day"));
    public final SelenideElement month = $(byName("month"));
    public final SelenideElement year = $(byName("year"));

    public final SelenideElement name = $(byName("name"));
    public final SelenideElement email = $(byName("email"));
    public final SelenideElement password = $(byName("password"));

    public final SelenideElement iframe3step = $("div#dating-group-3-steps-form-iframe > iframe");
    public final SelenideElement iframeChamomile = $("#dating-group-chamomile-form-iframe > iframe");

}
