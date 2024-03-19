package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectDocument {
    WebDriver driver;
    public static WebElement  selectDocument;
    public SelectDocument(WebDriver driver){

        this.driver = driver;
    }
    private String selectedDocument = "//div[@class=\"panel-heading left-right-pair\"]//div[contains(text(),'File a Lien')]";
    private String Price = "//div[@class=\"panel-heading left-right-pair\"]//span[contains(text(),'$449')]";
    public void clickOnDocument(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        selectDocument = driver.findElement(By.xpath(selectedDocument));
        wait.until(d -> selectDocument.isDisplayed());
        selectDocument.click();
    }
    public String assertPrice(){
        WebElement getPrice = driver.findElement(By.xpath(Price));
        return getPrice.getText();
    }
}
