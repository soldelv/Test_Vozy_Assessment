package features.stepdefinitions;

import features.pages.InventoryPage;
import features.pages.LoginPage;
import features.utils.SeleniumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import features.utils.CommonMethods;

public class StepsDefinitions {

    @Before
    public void startBrowser(){
        SeleniumDriver.startBrowser();
    }

    @After
    public void closeBrowser(){
        SeleniumDriver.tearDown();
    }

    @Given("El usuario se loguea con user {string} and password {string}")
    public void el_usuario_se_loguea_con_user_and_password(String user, String password) {
        CommonMethods.openPage();
        LoginPage.fillLoginForm(user,password);
    }

    @When("Selecciona el producto con el menor precio")
    public void select_lowest_price(){
        InventoryPage.findLowestPriceItem();
    }

    @Then("Realiza la orden de manera exitosa")
    public void successful_purchase(){
        InventoryPage.checkout();
    }
}
