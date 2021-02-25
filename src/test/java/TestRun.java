import Actions.ActionsForTests;
import Pages.GazInfoPage;
import Pages.YandexPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Period;

import static Actions.ActionsForTests.sleepingTime;
import static com.codeborne.selenide.Selenide.*;

public class TestRun extends Preview {
    YandexPage yan=new YandexPage();
    GazInfoPage gaz=new GazInfoPage();

    @BeforeTest
    public void launch() {
        open("http://yandex.ru/");


    }

    @Test
    public void launchTest(){


    yan.inputYandexSearch("Газинфосервис").
            clickForSearchYandex().
            assertAndClickGazInfo();
            sleepingTime(7);



    }
}
