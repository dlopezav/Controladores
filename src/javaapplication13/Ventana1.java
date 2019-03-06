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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author dlopezav
 */
public class Ventana1 {
    private GridPane x;
    private Label Nombre;
    private Label Direccion;
    private Button boton;
    private TextField sname;
    private TextField sdir;
    private Scene scene;

    public Ventana1() {
        
        this.sname = new TextField();
        this.sdir = new TextField();
        this.x = new GridPane();
        this.Nombre = new Label("Nombre: ");
        this.Direccion = new Label("Direccion: ");
        this.boton = new Button("Adicionar");
        this.x.add(Nombre, 0, 0);
        this.x.add(Direccion, 0, 1);
        this.x.add(boton, 0, 2);
        this.x.add(sname, 1, 0);
        this.x.add(sdir, 1, 1);
        this.scene = new Scene(x,300,300);
        this.x.setPadding(new Insets(20, 20, 20, 20));
        x.setHgap(10);
        x.setVgap(10);
        
    }

    public void mostrar(Stage stage){
        stage.setScene(scene);
        stage.setTitle("Ventana 1");
        stage.show();
    }
    
    public GridPane getX() {
        return x;
    }

    public void setX(GridPane x) {
        this.x = x;
    }

    public Label getNombre() {
        return Nombre;
    }

    public void setNombre(Label Nombre) {
        this.Nombre = Nombre;
    }

    public Label getDireccion() {
        return Direccion;
    }

    public void setDireccion(Label Direccion) {
        this.Direccion = Direccion;
    }

    public Button getBoton() {
        return boton;
    }

    public void setBoton(Button boton) {
        this.boton = boton;
    }

    public TextField getSname() {
        return sname;
    }

    public void setSname(TextField sname) {
        this.sname = sname;
    }

    public TextField getSdir() {
        return sdir;
    }

    public void setSdir(TextField sdir) {
        this.sdir = sdir;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    
    
    
}
