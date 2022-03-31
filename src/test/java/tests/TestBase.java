package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setWd(){
        wd = new ChromeDriver();
        //wd.navigate().to("http://selenium1py.pythonanywhere.com/en-gb/");
        wd.get("http://selenium1py.pythonanywhere.com/en-gb/");
        //wd.manage().window().maximize();
        wd.manage().window().fullscreen();
    }



    @AfterMethod
    public void tearDown(){

        //wd.quit(); // zakrivajet vsjo
        //wd.close();   // zakrivajet tekuweje okno

    }
}
