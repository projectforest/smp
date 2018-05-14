package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoanAppHelper {
    public boolean doesTextExistOnPage(String textToLookFor, WebDriver driver) {

        WebElement body = driver.findElement(By.tagName("body"));
        return body.getText().contains(textToLookFor);

    }

    /**
     * Sleep for specified number of milliseconds
     * @param //numberOfMilliseconds
     */
    public void sleep(int numberOFMilliseconds) {

        try {
            Thread.sleep(numberOFMilliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //click an element by xpath

    public void clickElementByXPath(WebDriver driver, String xpath){

        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
//click link by link name
    public void clickElementByLinkName(WebDriver driver, String name){
        WebElement element = driver.findElement(By.linkText(name));

        element.click();
    }

    //click element by id

    public void clickElementByID(WebDriver driver, String id){
        // find element
        WebElement element = driver.findElement(By.id(id));

        element.click();
    }

    //type text into edit.text field identified by name

    public void setText(WebDriver driver, String name, String text) {
        WebElement element = driver.findElement(By.name(name));

        element.sendKeys(text);
    }

    public void selectItem(WebDriver driver, String id, String item){
        //find element

        WebElement element = driver.findElement(By.id(id));

        Select select_object = new Select(element);

        select_object.selectByVisibleText(item);
    }




}
