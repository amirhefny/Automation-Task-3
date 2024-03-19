package levelSet;

import org.example.Home;
import org.example.SelectDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LevelSetTest {

     WebDriver driver= new ChromeDriver();

     @Test
    public void testlevelset() {
        driver.manage().window().maximize();
        Home home = new Home(driver);
        home.goToWebsite();
        home.clickOnGetPaid();
        SelectDocument selectdocument = new SelectDocument(driver);
        selectdocument.clickOnDocument();
        Assert.assertEquals(selectdocument.assertPrice(),"$449");
    }
    @AfterClass
    public void tearDown(){
        // driver.quit();
    }
}
