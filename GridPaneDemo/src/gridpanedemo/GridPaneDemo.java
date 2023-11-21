/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridpanedemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//new
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;


public class GridPaneDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) {
          
        //space
        GridPane root = new GridPane();
       root.setPadding(new Insets(20));
       root.setHgap(25);
       root.setVgap(15);
        
       //leble text or titale
       Label labelTitle = new Label("Enter your user name and password!");
       // Put on cell (0,0), span 2 column, 1 row.
       root.add(labelTitle, 0, 0, 2, 1);
       
       //text next text filed
       Label labelUserName = new Label("User Name");
       //text file (user write here
        TextField fieldUserName = new TextField();
        
        //text next text filed
         Label labelPassword = new Label("Password");
        //text file (user write here
       PasswordField fieldPassword = new PasswordField();
        
       Button loginButton = new Button("Login");
       
         // the place of text
        GridPane.setHalignment(labelUserName, HPos.RIGHT);
        // Put on cell (0,1)
       root.add(labelUserName, 0, 1);
       
       //the place of text
       GridPane.setHalignment(labelPassword, HPos.RIGHT);
       root.add(labelPassword, 0, 2);
       
      // Horizontal alignment for User Name field. (place)
       GridPane.setHalignment(fieldUserName, HPos.LEFT);
       root.add(fieldUserName, 1, 1);
       
       // Horizontal alignment for Password field.(place)
       GridPane.setHalignment(fieldPassword, HPos.LEFT);
       root.add(fieldPassword, 1, 2);
       
       // Horizontal alignment for Login button.
       GridPane.setHalignment(loginButton, HPos.RIGHT);
       root.add(loginButton, 1, 3);
       
        //(1)
        Scene scene = new Scene(root, 300, 300);
       primaryStage.setTitle("GridPanel Layout Demo (o7planning.org)");
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
