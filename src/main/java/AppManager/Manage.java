package AppManager;

import Pages.GazInfoPages.GazInformMainPage;
import Pages.GazInfoPages.GazInformPageAnkeyIDM;
import Pages.YandexPages.YandexResultPage;
import Pages.YandexPages.YandexSearchPage;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class Manage {

    WebDriver w;
    YandexSearchPage yandexSearchPage;
    YandexResultPage yandexResultPage;
    GazInformMainPage gazInformMainPage;
    GazInformPageAnkeyIDM gazInformPageAnkeyIDM;


    public void launch() {
        open("https://yandex.ru/"); //-Dbrowser=chrome -Dtestng.dtd.http=true
        w = WebDriverRunner.getWebDriver();
        w.manage().window().maximize();
        yandexSearchPage = new YandexSearchPage(w);
        yandexResultPage = new YandexResultPage(w);
        gazInformMainPage = new GazInformMainPage(w);
        gazInformPageAnkeyIDM = new GazInformPageAnkeyIDM(w);
    }

    public void stop() {
        WebDriverRunner.getWebDriver().quit();
    }

    public YandexSearchPage getYandexSearchPage() {
        return yandexSearchPage;
    }

    public YandexResultPage getYandexResultPage() {
        return yandexResultPage;
    }

    public GazInformMainPage getGazInformMainPage() {
        return gazInformMainPage;
    }

    public GazInformPageAnkeyIDM getGazInformPageAnkeyIDM() {
        return gazInformPageAnkeyIDM;
    }

}





