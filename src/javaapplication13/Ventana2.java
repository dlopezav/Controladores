/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author dlopezav
 */
public class Ventana2 {

   private Scene scene;
   private TextArea txt;
   private VBox x; 
   private Scene scene2;
   private Button boton;


    public Ventana2() {
        this.x = new VBox();
        this.txt = new TextArea();
        this.boton = new Button("Regresar");
        this.x.getChildren().add(txt);
        this.x.getChildren().add(boton);
        this.scene = new Scene(x,300,300);
    }

    public void mostrar(Stage stage){
        stage.setScene(scene);
        stage.setTitle("Ventana 2");
        stage.show();
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public TextArea getTxt() {
        return txt;
    }

    public void setTxt(TextArea txt) {
        this.txt = txt;
    }

    public VBox getX() {
        return x;
    }

    public void setX(VBox x) {
        this.x = x;
    }

    public Scene getScene2() {
        return scene2;
    }

    public void setScene2(Scene scene2) {
        this.scene2 = scene2;
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }
   
   
   
   
}

