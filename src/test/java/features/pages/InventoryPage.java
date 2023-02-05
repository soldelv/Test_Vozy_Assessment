package features.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.fail;

public class InventoryPage extends HomeBasePage{

    public static void findLowestPriceItem(){
        List<WebElement> itemPrices = driver.findElements(
                By.xpath("//div[contains(@Class,'pricebar')]"));
        WebElement lowestItem = null;
        Float lowest_price = null;

        for (int i=0; i<itemPrices.size(); i++){
            WebElement item_list = itemPrices.get(i).findElements(
                    By.xpath("//div[contains(@Class,'inventory_item_price')]")).get(i);
            String price = item_list.getText().substring(1);
            if(i==0){
                lowest_price = Float.parseFloat(price);
                lowestItem = itemPrices.get(i);
            }
            else if(Float.parseFloat(price) < lowest_price){
                lowest_price = Float.parseFloat(price);
                lowestItem = itemPrices.get(i);
            }
        }

        if (lowestItem!=null){
            System.out.println("Precio mas bajo: "+lowest_price);
            lowestItem.findElement(By.xpath("//button")).click();
        }else {
            fail("ERROR: No se encuentran items");
        }
    }

    public static void checkout(){

        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        wait.until(ExpectedConditions.elementToBeClickable(cart));
        cart.click();
        System.out.println("Se hizo click en carrito de compras");

        WebElement checkout = driver.findElement(By.id("checkout"));
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
        System.out.println("Se hizo click en checkout");

        WebElement name = driver.findElement(By.id("first-name"));
        WebElement last_name = driver.findElement(By.id("last-name"));
        WebElement zip_code = driver.findElement(By.id("postal-code"));
        name.sendKeys("name");
        last_name.sendKeys("lastname");
        zip_code.sendKeys("1122");
        System.out.println("Datos de la compra completados");

        driver.findElement(By.id("continue")).click();
        System.out.println("Se hizo click en continuar");

        WebElement finish_button = driver.findElement(By.id("finish"));
        wait.until(ExpectedConditions.elementToBeClickable(finish_button));
        finish_button.click();
        System.out.println("Compra finalizada correctamente");
    }
}
