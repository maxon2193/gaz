package Pages.YandexPages;

import AppManager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class YandexSearchPage extends HelperBase {


    public YandexSearchPage(WebDriver wd) {
        super(wd);
    }

    public YandexSearchPage inputYandexSearch(String text) {
        input(By.id("text"), text);
        return this;
    }

    public YandexSearchPage clickForSearchYandex() {
        click(By.xpath("//button[contains(text(),'Найти')]"));
        return this;
    }

    public YandexSearchPage checkUrl() {
        String url = getUrl();
        assertEquals(url, "https://yandex.ru/");
        return this;
    }

}