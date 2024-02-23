package bdd.page;

import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscarProducto extends DOM {

    //Aqui van los localizadores y acciones de la página
    @FindBy(id = "twotabsearchtextbox")
    protected WebElement txtBuscar;

    @FindBy(id = "nav-search-submit-button")
    protected  WebElement btnBuscar;

    @FindBy(xpath = "//*[contains(text(),'Resultados')]")
    WebElement resultadoObtenido;

    public void hacerClickenBuscar(){
        onClick(txtBuscar);
    }

    public void iniciarNavegador(String url){
        iniciarNavegador(url);
    }

    public void escribirProducto(String txtProducto){
        type(txtBuscar, txtProducto);
    }
    public void clickBuscarProducto(){
        onClick(btnBuscar);

    }
    public String validarResultados(){
         return getText(resultadoObtenido);


    }

}
