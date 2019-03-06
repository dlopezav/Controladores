/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author dlopezav
 */
public class ControladorVentana3 {
    private Modelo modelo;
    private Ventana3 ventana;

    public ControladorVentana3(Modelo modelo) {
        this.modelo = modelo;
        this.ventana = new Ventana3();
        this.ventana.getBoton().setOnAction(new EventButton1());
        this.ventana.getBoton2().setOnAction(new EventButton2());
    }
    class EventButton1 implements 
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana controlador = new ControladorVentana(modelo);
                controlador.mostrarVista();
        }
        
    }
    class EventButton2 implements 
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            ControladorVentana2 controlador = new ControladorVentana2(modelo);
                controlador.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
        
    }
}
