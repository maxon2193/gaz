package Pages.GazInfoPages;

import AppManager.HelperBase;
import Pages.YandexPages.YandexSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class GazInformMainPage extends HelperBase {


    public GazInformMainPage(WebDriver wd) {
        super(wd);
    }

    public GazInformMainPage clickButtonProduct() {
        By xpath = By.xpath("//*[@id=\"js-btn3\"]");
        assertTest(xpath, "Продукты");
        click(xpath);
        return this;
    }

    public GazInformMainPage clickFirstSlide() {
        click(By.xpath("//*[@id=\"slick-slide00\"]/button"));
        return this;
    }

    public GazInformMainPage clickOnAnkeyAnkeyIDM() {
        sleepingTime(1);
        By xpath = By.xpath("//*[@id=\"div431\"]/a");
        assertTest(xpath, "Ankey IDM");
        click(xpath);
        return this;
    }

    public GazInformMainPage checkUrl() {
        String url = getUrl();
        assertEquals(url, "https://www.gaz-is.ru/");
        return this;
    }

        public GazInformMainPage changeWindowInBrowser(){
            changeWindow();
            return this;
        }

    }

