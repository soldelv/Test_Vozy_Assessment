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

    @Given("El user ingresa sus credenciales en el sitio")
    public void el_user_ingresa_sus_credenciales_en_el_sitio() {
        CommonMethods.openPage();
        LoginPage.fillLoginForm("standard_user","secret_sauce");
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
