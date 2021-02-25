import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Preview {


    @BeforeTest
    public void launchTest(){
        open("http://yandex.ru/");
    }
}
