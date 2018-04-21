/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Rachel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button Blackjack;
    private Label label;
    @FXML
    private Button Craps;
    @FXML
    private Button User;
    @FXML
    private Button Instructions;
    private Button Back;
   /* private void PlayBlackJack(ActionEvent event) throws IOException
    {
        Stage stage;
        Parent root;
        System.out.println("hit");
        stage=(Stage) Blackjack.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("test.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);
        
    }
    */
      private void changeScenes(ActionEvent event) throws IOException 
  {
    Stage stage; 
    Parent root;
    stage= (Stage)Blackjack.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("test.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setFullScreen(true);
  }
      private void goBack(ActionEvent event) throws Exception
    {
        Stage stage;
        Parent root;
        System.out.println("hit");
        stage=(Stage) Back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void PlayRoulette(ActionEvent event) {
    }

    @FXML
    private void PlayCraps(ActionEvent event) throws IOException 
    {
        Stage stage;
        Parent root;
        System.out.println("hit");
        stage=(Stage) Craps.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("test.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);
    }

    @FXML
    private void playBlackjack(ActionEvent event) throws IOException 
    {
    
        Stage stage;
        Parent root;
        System.out.println("hit");
        stage=(Stage) Blackjack.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("test.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);
        
    }
    
        @FXML
    private void Instructions(ActionEvent event) 
    {
    }

    @FXML
    private void User(ActionEvent event) 
    {
    }
    
}
