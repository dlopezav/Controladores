/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author dfeli
 */
public class JavaApplication13 extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        GridPane x = new GridPane();
        GridPane y = new GridPane();
        TabPane tabPane = new TabPane();
        TextArea txt = new TextArea();
        Tab[] tabs = new Tab[2];
        tabs[0] = new Tab("Menu");
        tabs[1] = new Tab("Menu 2");
       
        for (Tab tab : tabs) {
            tab.setClosable(false);
            tabPane.getTabs().add(tab);
        }
        tabs[0].setContent(x);
        
        
        
        Label Nombre = new Label("Nombre: ");
        Nombre.setFont(new Font(14));
        Label Direccion = new Label("Direccion: ");
        Direccion.setFont(new Font(14));
        Label Telefono = new Label("Telefono: ");
        Telefono.setFont(new Font(14));
        x.add(Nombre, 0, 1);
        x.add(Direccion, 0, 2);
        x.add(Telefono, 0, 3);
        
        TextField sname = new TextField();
        TextField sdir = new TextField();
        TextField stele = new TextField();
        x.add(sname, 1, 1,3,1);
        x.add(sdir, 1, 2,3,1);
        x.add(stele, 1, 3,3,1);
        
        x.setHgap(10);
        x.setVgap(10);
        
        Button boton = new Button("Adicionar");
        x.add(boton, 1, 5,2,1);
        
        
        ////////PESTAÑA 2////////
        y.add(txt, 0, 0);
        Button boton2 = new Button("Regresar");
        y.add(boton2, 0, 1,2,1);
        
        
                
                
        
        
        
        
        tabs[1].setContent(y);
        y.setHgap(10);
        y.setVgap(10);
        
        
        
        
        
        
        
        
        
        
        x.setPadding(new Insets(20, 20, 20, 20));
        y.setPadding(new Insets(20, 20, 20, 20));
        Scene scene = new Scene(tabPane,280,300);
        
        primaryStage.setTitle("Panel");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
