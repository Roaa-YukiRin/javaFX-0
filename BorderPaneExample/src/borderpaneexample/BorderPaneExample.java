/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borderpaneexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

import javafx.scene.text.*;
import javafx.scene.layout.HBox;
/**
 *
 * @author HP
 */
public class BorderPaneExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a border pane
       BorderPane pane = new BorderPane(); 
       
       //top
        HBox top = new HBox();
        top.getChildren().add(new Text("Top"));
        top.setStyle("-fx-border-color: red;");
        
                //right
        HBox right = new HBox();
        right.getChildren().add(new Text("Right"));
        right.setStyle("-fx-border -color: red;");
        
         //bottom
        HBox bottom = new HBox();
        bottom.getChildren().add(new Text("Bottom"));
        bottom.setStyle("-fx-border-color: red;");
        bottom.setPadding(new Insets(11.5, 70.5, 13.5, 71.5));
        
        //left
        HBox left = new HBox();
        left.getChildren().add(new Text("Left"));
        left.setStyle("-fx-border-color: red;");
        
        //center
        HBox center = new HBox();
        center.getChildren().add(new Text("Center"));
        center.setStyle("-fx-border-color: red;");

        //Place nodes in the pane
        pane.setTop(top);
        pane.setRight(right);
        pane.setBottom(bottom);
        pane.setLeft(left);
        pane.setCenter(center);
        
        Scene scene = new Scene(pane,200,200);// Create a scene and place it in the stage
        primaryStage.setTitle("ShowBorderPane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
