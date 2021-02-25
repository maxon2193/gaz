package Actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.hasItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


import java.util.List;

public class ActionsForTests {

    private WebDriverRunner wd ;


    public WebDriver web(){
        return WebDriverRunner.getWebDriver();
    }





    public void click(By by){
        web().findElement(by).click();
    }


  public void input(By by, String text){

      web().findElement(by).click();
      web().findElement(by).clear();
      web().findElement(by).sendKeys(text);
  }

  public void assertTest(By by,String etalon){
       String text= web().findElement(by).getText();
       assertEquals(text,etalon);

  }
  public List<String> searchCollection(By by){

      return $$(by).texts();
  }

    public void clickCollection(By by){

         $$(by).find(Condition.text("")).click();

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


    public static void sleepingTime(int time){
        Selenide.sleep(time*1000);
    }
  }


