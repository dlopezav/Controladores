/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author dlopezav
 */
public class Ventana3 {
    private GridPane x;
    private Button boton;
    private Button boton2;
    private Scene scene;

    public Ventana3() {
        
        this.x = new GridPane();
        this.boton = new Button("Ir a 1");
        this.x.add(boton, 0, 2);
        this.boton2 = new Button("Ir a 2");
        this.x.add(boton2, 2, 2);
        this.scene = new Scene(x,300,300);
        this.x.setPadding(new Insets(20, 20, 20, 20));
        x.setHgap(10);
        x.setVgap(10);
        
        
    }

    public void mostrar(Stage stage){
        stage.setScene(scene);
        stage.setTitle("Ventana 3");
        stage.show();
    }
    
    public GridPane getX() {
        return x;
    }

    public void setX(GridPane x) {
        this.x = x;
    }

    

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }

    public Button getBoton2() {
        return boton2;
    }

    public void setBoton2(Button boton2) {
        this.boton2 = boton2;
    }


    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
