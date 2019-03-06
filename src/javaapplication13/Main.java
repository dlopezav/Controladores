/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author dlopezav
 */
public class Main extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //1. Registrar variable en el Singleton
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        //Modelo en memoria
        Modelo modelo = new Modelo();
        //2. Invocar el controlador de la vista que quiero visualizar
        ControladorVentana ventana = new ControladorVentana(modelo);
        //Modelo en memoria
        Modelo modelo2 = new Modelo();
        //2. Invocar el controlador de la vista que quiero visualizar
        ControladorVentana2 ventana2 = new ControladorVentana2(modelo2);
        ventana.mostrarVista();
        
        
    }
}
