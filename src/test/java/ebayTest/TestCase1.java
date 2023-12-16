package ebayTest;


import Ebay.Homepage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase1 extends WebAPI {
    static Homepage homepage;
    public static void getInItElements(){
        homepage= PageFactory.initElements(driver,Homepage.class);

    }
    @Test

    public void test(){
        getInItElements();
        homepage.performActions();
    }

}
