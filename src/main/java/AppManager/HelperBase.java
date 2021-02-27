package AppManager;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.hasItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


import java.util.ArrayList;
import java.util.List;

public class HelperBase {

    WebDriver wd;

    public HelperBase(WebDriver wd){
        this.wd=wd;

    }


    public void click(By by){
        wd.findElement(by).click();
    }

    public String getUrl(){
        return wd.getCurrentUrl();
    }


  public void input(By by, String text){

      wd.findElement(by).click();
      wd.findElement(by).clear();
      wd.findElement(by).sendKeys(text);
  }

  public void assertTest(By by,String etalon){
       String text= wd.findElement(by).getText();
       assertEquals(text,etalon);

  }
  public List<String> searchCollection(By by){

      return $$(by).texts();
  }

    public void clickCollection(By by,String text) {

        $$(by).find(Condition.text(text)).click();
    }

         public void assertCollection(List<String> collection,String etalon){
        assertThat(collection,hasItem(etalon));

    }
    public void checkListElementsContainsTextInComboboxStatus() {
        By listName = By.xpath("(//*[@class=\"popup__inner\"])[3]//span");;
        ElementsCollection listOfElementsFromPage = $$(listName);
        List<String> a = listOfElementsFromPage.texts();
        assertThat(a, hasItem("Показать все"));
        assertThat(a, hasItem("Передана в ЛЦ"));
        assertThat(a, hasItem("Отправлена"));
        assertThat(a, hasItem("Поступила в ЛЦ"));
        assertThat(a, hasItem("Карта прикреплена к заявке"));
        assertThat(a, hasItem("Передана СВК"));
        assertThat(a, hasItem("Карта передана клиенту"));
        assertThat(a, hasItem("Закрыта по инициативе банка"));
        assertThat(a, hasItem("В ЛЦ на уничтожение"));
        assertThat(a, hasItem("Уничтожено в ЛЦ"));
        assertThat(a, hasItem("Изготовлена"));
        assertThat(a, hasItem("Новая"));
    }


    public static void sleepingTime(int sec){
        Selenide.sleep(sec*1000);
    }

    public void changeWindow() {
        ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(1));



    }
}

