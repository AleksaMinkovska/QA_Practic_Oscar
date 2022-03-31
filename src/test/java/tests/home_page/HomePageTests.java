package tests.home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.TestBase;

import static helpers.APIHelper.staticMethod;


public class HomePageTests extends TestBase {

    HomePage homePage;

    @BeforeMethod
    public void initTest(){
        homePage = new HomePage();
    }

    @Test
    public void test1(){
        staticMethod();
        System.out.println("First test");
    }
}
