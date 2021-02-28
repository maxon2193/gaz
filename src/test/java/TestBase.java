import AppManager.Manage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {

    Manage mg = new Manage();

    @BeforeTest
    public void start() {
        mg.launch();
    }

    @AfterTest
    public void stop() {
        mg.stop();
    }


}



