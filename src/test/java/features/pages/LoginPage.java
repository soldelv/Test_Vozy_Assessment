package features.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static junit.framework.TestCase.assertNotNull;

public class LoginPage extends HomeBasePage {

    public static void fillLoginForm(String user, String password){
        WebElement userField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        userField.sendKeys(user);
        passwordField.sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        System.out.println("User logged correctly");
    }
}