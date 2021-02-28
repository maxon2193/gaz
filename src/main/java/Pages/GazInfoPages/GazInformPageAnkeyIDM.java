package Pages.GazInfoPages;

import AppManager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GazInformPageAnkeyIDM extends HelperBase {

    public GazInformPageAnkeyIDM(WebDriver wd) {
        super(wd);
    }

    public GazInformPageAnkeyIDM checkThisPageAboutAnkeyIDM() {
        sleepingTime(1);
        assertTest(By.xpath("(//*[contains(text(),'Ankey IDM')])[3]"), "Ankey IDM");//сранение заголовка
        By by = By.xpath("//*[contains(text(),'Ankey IDM')]");
        String text1 = "Решение - система Ankey IDM, которая обладает следующими функциональными возможностями:";
        String text2 = "Выгоды при использовании Ankey IDM";
        String text3 = "Основные функции Ankey IDM";
        List<String> col = searchCollection(by);
        assertCollection(col, text1);
        assertCollection(col, text2);
        clickCollection(by, text3);
        return this;
    }

    public GazInformPageAnkeyIDM checkUrl() {
        String url = getUrl();
        assertEquals(url, "https://www.gaz-is.ru/produkty/upravlenie-ib/ankey-idm.html");
        return this;
    }


}
