package bdd.page.stepdefinition;

import bdd.page.step.BuscarProductoStep;
import bdd.webdriver.DOM;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;

public class BuscarProductoStepDefinition {
    private BuscarProductoStep buscarProductoStep;
    private DOM dom;
    private Scenario scenario;
    @Before
    private void beforeScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void afterScenario(){
        dom.quitDriver();
    }

    @Given("Ingreso a la pagina web de Amazon {string}")
    public void ingresoALaPaginaWebDeAmazon(String url) {
        buscarProductoStep.stepIniciarNavegador(url);
    }

    @When("Ingreso el texto {string}")
    public void ingresoElTexto(String txtProducto) {
        buscarProductoStep.stepClickBuscarProducto();
        buscarProductoStep.stepEscribirProducto(txtProducto);
    }

    @And("click en botón buscar")
    public void clickEnBotónBuscar() {
        buscarProductoStep.stepClickBuscarProducto();
    }

    @Then("valido que me muestre el valor {string}")
    public void validoQueMeMuestreElValor(String txtResultadoEsperado) {
        Assertions.assertEquals(txtResultadoEsperado, buscarProductoStep.stepValidarResultado());
    }
}
