import org.testng.annotations.Test;

public class TestRun extends TestBase {


    @Test
    public void runTest() {
        mg.getYandexSearchPage().
                checkUrl().
                inputYandexSearch("Газинформсервис").
                clickForSearchYandex();
        mg.getYandexResultPage().
                checkAndClickGazInfo();
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
