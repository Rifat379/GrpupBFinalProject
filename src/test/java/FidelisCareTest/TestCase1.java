package FidelisCareTest;

import FidelisCare.Homepage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

public class TestCase1 extends WebAPI {
    static Homepage homepage;
    public static void getInItElements(){
        homepage= PageFactory.initElements(driver, Homepage.class);
    }
    public void test(){
        getInItElements();
        homepage.performActions();
    }
}
