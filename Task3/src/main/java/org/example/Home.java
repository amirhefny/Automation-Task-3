package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
    WebDriver driver;
    private String url = "https://www.levelset.com/";
    private String getPaidBtn ="//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]";
    public Home(WebDriver driver){

        this.driver = driver;
    }
    public void goToWebsite(){
        driver.get(url);
    }
    public void clickOnGetPaid(){
        WebElement getpaid = driver.findElement(By.xpath(getPaidBtn));
        Assert.assertEquals(getpaid.isDisplayed(),true);
        getpaid.click();


    }
}
