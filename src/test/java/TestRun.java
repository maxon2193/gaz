import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class TestRun extends TestBase {


    @Test
    public void goToGazInfo() {
        mg.getYandexSearchPage().
                checkUrl().
                inputYandexSearch("Газинформсервис").
                clickForSearchYandex();
        mg.getYandexResultPage().
                assertAndClickGazInfo();
        mg.getGazInformMainPage().
                changeWindowInBrowser().
                checkUrl().
                clickFirstSlide().
                clickButtonProduct().
                clickOnAnkeyAnkeyIDM();
        mg.getGazInformPageAnkeyIDM().
                checkUrl().
                checkThisPageAboutAnkeyIDM();


    }
}
