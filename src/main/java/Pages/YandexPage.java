package Pages;

import Actions.ActionsForTests;
import org.openqa.selenium.By;

public class YandexPage {

    ActionsForTests act=new ActionsForTests();



    public YandexPage inputYandexSearch(String text){
        act.input(By.xpath("//*[@id=\"text\"]"),text);
        return this;
    }

    public YandexPage clickForSearchYandex(){
        act.click(By.xpath("//button[contains(text(),'Найти')]"));
        return this;
    }

    public YandexPage assertAndClickGazInfo(){
        By first=By.xpath("//*[@id=\"search-result\"]/li[1]/div/div[1]/div");
        By second=By.xpath("//*[@id=\"search-result\"]/li[1]/div/h2/a");
        act.assertTest(first,"gaz-is.ru");
        act.assertTest(first,"gaz-is.ru");
        act.click(first);
        return this;
    }

}