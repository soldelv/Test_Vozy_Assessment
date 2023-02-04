package features.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class InventoryPage extends HomeBasePage{

    public static void findLowestPriceItem(){
        List<WebElement> itemPrices = driver.findElements(
                By.xpath("//div[contains(@Class,'pricebar')]"));

        WebElement lowestItem = null;
        int lowest_price = 0;

        for (WebElement item: itemPrices){

            WebElement item_list = item.findElement(By.xpath("//div[contains(@Class,'inventory_item_price')]"));

            if (Integer.parseInt(item.getText()) > lowest_price){
                lowestItem = item_list;
            }
        }

        WebElement lowestItemButton = lowestItem.findElement(By.xpath("//button"));
        wait.until(ExpectedConditions.elementToBeClickable(lowestItemButton));
        lowestItemButton.click();
    }

    public static void checkout(){

        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        wait.until(ExpectedConditions.elementToBeClickable(cart));
        cart.click();
        WebElement checkout = driver.findElement(By.id("checkout"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        WebElement name = driver.findElement(By.id("first-name"));
        WebElement last_name = driver.findElement(By.id("last-name"));
        WebElement zip_code = driver.findElement(By.id("postal-code"));
        name.sendKeys("name");
        last_name.sendKeys("lastname");
        zip_code.sendKeys("1122");
        driver.findElement(By.id("continue")).click();
        WebElement finish_button = driver.findElement(By.id("finish"));
        wait.until(ExpectedConditions.elementToBeClickable(finish_button));
        finish_button.click();
    }
}
