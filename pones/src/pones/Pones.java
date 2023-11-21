/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pones;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//new
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;


/**
 *
 * @author HP
 */
public class Pones extends Application {
     protected TextField tfCelsus = new TextField();
     protected TextField tfFahrenheit = new TextField();
    @Override
    public void start(Stage primaryStage) {
        // Set text field preferences
        tfCelsus.setAlignment(Pos.BOTTOM_RIGHT);
        tfFahrenheit.setAlignment(Pos.BOTTOM_RIGHT);
        
        GridPane root = new GridPane();
	root.setAlignment(Pos.CENTER);
	root.setHgap(10);
	root.setVgap(2);
        
        root.add(new Label("Celsus"), 0, 0);
	root.add(tfCelsus, 1, 0);
        root.add(new Label("tfFahrenheit"), 0, 1);
	root.add(tfFahrenheit, 1, 1);
        
        //action
//       tfCelsius.setOnAction(e -> {
//            double fahren = Double.parseDouble(celsius.getText());
//            String convertToFahren = Double.toString((fahren * 1.8) + 32);
//            fahrenheit.setText(convertToFahren);
//        });
//
//        tfFahrenheit.setOnAction(e -> {
//            double cel = Double.parseDouble(fahrenheit.getText());
//            String convertToCelsius = Double.toString((cel - 32) / 1.8);
//            celsius.setText(convertToCelsius);
//        });

//        //space
//        GridPane root = new GridPane();
//       root.setPadding(new Insets(20));
//       root.setHgap(25);
//       root.setVgap(15);
//        
//
//       
//       //text next text filed
//       Label labelUserName = new Label("Celsuse");
//       //text file (user write here
//        TextField fieldUserName = new TextField();
//        
//        //text next text filed
//         Label labelPassword = new Label("Fahrenheit");
//        //text file (user write here
//       PasswordField fieldPassword = new PasswordField();
//        
//       Button loginButton = new Button("Login");
//       
//         // the place of text
//        GridPane.setHalignment(labelUserName, HPos.RIGHT);
//        // Put on cell (0,1)
//       root.add(labelUserName, 0, 1);
//       
//       //the place of text
//       GridPane.setHalignment(labelPassword, HPos.RIGHT);
//       root.add(labelPassword, 0, 2);
//       
//      // Horizontal alignment for User Name field. (place)
//       GridPane.setHalignment(fieldUserName, HPos.LEFT);
//       root.add(fieldUserName, 1, 1);
//       
//       // Horizontal alignment for Password field.(place)
//       GridPane.setHalignment(fieldPassword, HPos.LEFT);
//       root.add(fieldPassword, 1, 2);
//       
//       
       
        //(1)
        Scene scene = new Scene(root, 250, 100);
       primaryStage.setTitle("Exercise 4");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
