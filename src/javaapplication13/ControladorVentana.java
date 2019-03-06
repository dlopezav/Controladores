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
public class ControladorVentana {
    private Ventana1 ventana;
    private Modelo modelo;

    public ControladorVentana(Modelo modelo) {
        this.modelo = modelo;
        this.ventana = new Ventana1();
        this.ventana.getBoton().setOnAction(new EventButton());
        this.ventana.getSname().setText(modelo.getX());
        this.ventana.getSdir().setText(modelo.getY());
    }

    
    
    //Clase interna - inner class
    class EventButton implements 
            EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            modelo.setX(ventana.getSname().getText());
            modelo.setY(ventana.getSdir().getText());
            ControladorVentana2 controlador = new ControladorVentana2(modelo);
            
            controlador.mostrarVista();
        }
        
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
        
    }
    
    
    
    
}
