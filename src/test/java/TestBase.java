import AppManager.Manage;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    Manage mg =new Manage();

    @BeforeTest
    public void start() {
       mg.launch();



    }


}



