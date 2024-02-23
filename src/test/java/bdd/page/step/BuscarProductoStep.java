package bdd.page.step;

import bdd.page.BuscarProducto;

public class BuscarProductoStep {

    public BuscarProducto buscarProducto(){
        return new BuscarProducto();
    }

    public void stepIniciarNavegador(String url){
        buscarProducto().iniciarNavegador(url);
    }

    public void stephacerClickenBuscar(){
        buscarProducto().hacerClickenBuscar();
    }

    public void stepEscribirProducto(String txtProduct){
        buscarProducto().escribirProducto(txtProduct);
    }

    public void stepClickBuscarProducto(){
        buscarProducto().clickBuscarProducto();
    }
    public String stepValidarResultado(){
        return buscarProducto().validarResultados();
    }



}
