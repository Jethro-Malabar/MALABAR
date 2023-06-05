/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package jethrofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       try{
           
   Parent root=FXMLLoader.load(getClass().getResource("Online Store.fxml"));
   Scene scene=new Scene(root);
   scene.getStylesheets().add(getClass().getResource("online store.css").toExternalForm());
   
   primaryStage.setTitle("Clothing Shop");
   primaryStage.setScene(scene);
   primaryStage.show();
   
           
           
           
           
           
       }catch(Exception e){
           e.printStackTrace();
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
