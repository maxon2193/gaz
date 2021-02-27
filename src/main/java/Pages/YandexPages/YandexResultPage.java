package Pages.YandexPages;

import AppManager.HelperBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class YandexResultPage extends HelperBase {
    public YandexResultPage(WebDriver wd) {
        super(wd);
    }

    public YandexResultPage assertAndClickGazInfo(){
        sleepingTime(2);
        By by=By.xpath("//*[@id=\"search-result\"]/li[1]//a");
        String url="gaz-is.ru";
        List<String> col=searchCollection(by);
        assertCollection(col,"Газинформсервис - информационная безопасность");
        assertCollection(col,url);
        clickCollection(by,url);
        return this;
    }



}
