/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team00000011;


import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 *
 * @author kaleb.nelson
 */
public class CrapsGUI
{

  public static Scene createScene()
  {
    BorderPane root = new BorderPane();
    
    //General Design
    root.setPadding(new Insets(15,20, 10, 10));
    root.setStyle("-fx-background-color: green;");
    
    
    //Begin build top of pane
    //Builds in a left to right order
    HBox addTHBox = new HBox();
    addTHBox.setPadding(new Insets(15,12,15,12));
    addTHBox.setSpacing(10);
    
    //Create a grid pane for data management
    GridPane tPane = new GridPane();
    tPane.setPadding(new Insets(20));
    tPane.setHgap(25);
    tPane.setVgap(15);
    
    //Print user Data to top
    Label user = new Label("Username");
    user.setFont(new Font("Castellar", 24));
    user.setTextFill(Color.web("#FFFF00"));
    tPane.add(user,0,0,1,1);
    Label userName = new Label(craps.gamePlayer.user.getName());
    userName.setFont(new Font("Castellar", 18));
    userName.setTextFill(Color.web("#FFFF00"));
    tPane.add(userName,0,1,1,1);
    Label experience = new Label("Experience");
    experience.setFont(new Font("Castellar", 24));
    experience.setTextFill(Color.web("#FFFF00"));
    tPane.add(experience,1,0,1,1);
    Label userExperience = new Label(Integer.toString(
    craps.gamePlayer.user.getExperience()));
    userExperience.setFont(new Font("Castellar", 18));
    userExperience.setTextFill(Color.web("#FFFF00"));
    tPane.add(userExperience,1,1,1,1);
    Label currency = new Label("Currency");
    tPane.add(currency,2,0,1,1);
    currency.setFont(new Font("Castellar", 24));
    currency.setTextFill(Color.web("#FFFF00"));
    Label curCurrency = new Label(Integer.toString(
            craps.gamePlayer.user.getCurrency()));
    curCurrency.setFont(new Font("Castellar", 18));
    curCurrency.setTextFill(Color.web("#FFFF00"));
    tPane.add(curCurrency,2,1,1,1);
    
    
    //Set a spacer to push Return to right
    final Pane spacer = new Pane();
    addTHBox.setHgrow(spacer,Priority.ALWAYS);
    spacer.setMinSize(10,1);
    
    //Create a "Return to Home" button
    final Button returnButton = new Button("Return to Home");
    returnButton.setPrefSize(125,50);
    
    //Adds elements to the HBox
    addTHBox.getChildren().addAll(tPane,spacer,returnButton);
    
    root.setTop(addTHBox);
    //End building of top pane
    
    //Begin building left pane
    //Initialize a new vertical box
    VBox addLVBox = new VBox();
    addLVBox.setPadding(new Insets(15,12,15,12));
    addLVBox.setSpacing(10);
    
    
    //Create a gridpane for space management
    GridPane pane = new GridPane();
    pane.setPadding(new Insets(20));
    pane.setHgap(25);
    pane.setVgap(15);
    
    //Create a title for gridPane
    Label gridTitle = new Label("Game Info");
    gridTitle.setFont(new Font("Castellar", 24));
    gridTitle.setTextFill(Color.web("#FFFF00"));
    pane.add(gridTitle, 0,0,1,1);
    
    //Display current roll
    Label roll = new Label("Current Roll:");
    roll.setFont(new Font("Castellar", 20));
    roll.setTextFill(Color.web("#FFFF00"));
    pane.add(roll, 0,1,1,1);
    Label die = new Label();
    die.setFont(new Font("Castellar", 28));
    die.setTextFill(Color.web("#FFFF00"));
    pane.add(die,0,2,1,1);
    
    //Display Target Value
    Label target = new Label("Target Roll");
    target.setFont(new Font("Castellar", 20));
    target.setTextFill(Color.web("#FFFF00"));
    pane.add(target,0,3,1,1);
    Label targetV = new Label(Integer.toString(craps.targetDiceValue));
    targetV.setFont(new Font("Castellar", 18));
    targetV.setTextFill(Color.web("#FFFF00"));
    pane.add(targetV,0,4,1,1);
    
    //Display current bet
    Label bet = new Label("Current Bet:");
    bet.setFont(new Font("Castellar", 20));
    bet.setTextFill(Color.web("#FFFF00"));
    pane.add(bet,0,5,1,1);
    Label cBet = new Label(Integer.toString(craps.gamePlayer.getCurrentBet()));
    cBet.setFont(new Font("Castellar", 18));
    cBet.setTextFill(Color.web("#FFFF00"));
    pane.add(cBet,0,6,1,1);
    
    //add elements to VBox
    addLVBox.getChildren().addAll(pane);
    
    root.setLeft(addLVBox);
    //End building of left pane
    
    //Begin building the center pane
    VBox addCVBox = new VBox();
    addCVBox.setPadding(new Insets(15,12,15,12));
    addCVBox.setSpacing(10);
    
    //Place a craps table on back
    /*root.getCenter().setStyle(
      "-fx-background-image: url(\"/test1Resources/crapsBackground.jpg\");"
      + "-fx-background-size: 500, 500;"
      + "-fx-background-repeat: no-repeat;");
    */
    
    //Begin building right pane
    VBox addRVBox = new VBox();
    addRVBox.setPadding(new Insets(15,12,15,12));
    addRVBox.setSpacing(10);
    
    //Create the "Roll" button
    final Button rollButton = new Button("Roll Die");
    rollButton.setPrefSize(150,150);
    rollButton.setOnAction(new EventHandler<ActionEvent>()
    {
       @Override
       public void handle(ActionEvent e)
       {
         rollDieOnClick();
         die.setText(unicodeHandler(craps.Dice[0].getValue())
            + ", " + unicodeHandler(craps.Dice[1].getValue()));
         targetV.setText(Integer.toString(craps.targetDiceValue));
         cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
         curCurrency.setText(Integer.toString(
            craps.gamePlayer.user.getCurrency()));
       }
    });
    
    //Create the "Bet" button
    final Button betButton = new Button("Place Bet");
    betButton.setPrefSize(150,150);
    betButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent e)
      {
        openBetWindow();
        cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
        curCurrency.setText(Integer.toString(
                craps.gamePlayer.user.getCurrency()));
      }
    });
    
    //Create the "Restart" Button
    final Button restartButton = new Button("Restart");
    restartButton.setPrefSize(150,150);
    restartButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent e)
      {
        craps.gamePlayer.placeBet(0);
        for(int j = 0; j < 2; j++)
          craps.Dice[j].setValue(0);
        die.setText(Integer.toString(craps.Dice[0].getValue())
            + ", " + Integer.toString(craps.Dice[1].getValue()));
        craps.targetDiceValue = 0;
        targetV.setText(Integer.toString(craps.targetDiceValue));
        cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
        rollCheck = 0;
      }
    }
    );
    
    //Add buttons to the box
    addRVBox.getChildren().addAll(rollButton,betButton,restartButton);
    
    //Add to borderpane
    root.setRight(addRVBox);
    //End building of right pane
    
    //Initialize the GUI
    Scene scene = new Scene(root,1280,720);
    
    return scene;
  }
  
  /**
   * Calls the rollDie function from the CrapsPlayer class and begins the 
   * general logic of the game.
   */
  private static void rollDieOnClick()
  {
    craps.gamePlayer.rollDie(craps.Dice[0], craps.Dice[1]);
    if(rollCheck == 0)
        {
          craps.checkFirstRoll();
          rollCheck++;
        }
        else
          craps.checkNextRoll();
  }
  
  /**
   * Opens a window that accepts an integer and sets it as the current bet 
   * for the game.
   */
  private static void openBetWindow()
  {
    TextInputDialog getBet = new TextInputDialog();
        
    getBet.setTitle("Place Bet");
    getBet.setHeaderText("Enter bet amount");
        
    Optional<String> result = getBet.showAndWait();
        
    result.ifPresent(bet -> {
      if(Integer.parseInt(bet) < craps.gamePlayer.user.getCurrency())
      {
        craps.gamePlayer.placeBet(Integer.parseInt(bet));
      } 
      else
      {
        popupWindow("You don't have enough money! Bet a little less");
      }
    });    
  }
  
  private static String unicodeHandler(int currentValue)
  {
    String value;
    switch(currentValue)
    {
      case 1:
       value =  "\u2680";
       break;
      case 2:
        value = "\u2681";
        break;
      case 3: 
        value = "\u2682";
        break;
      case 4:
        value = "\u2683";
        break;
      case 5:
        value = "\u2684";
        break;
      case 6: 
        value = "\u2685";
        break;
    default:
      value = Integer.toString(currentValue);
  }  
  return value;
  }
  /**
   * This function will create a popup window with the text of input in the
   * window. Pressing the enter key will close this window.
   * @param input a string to be printed in the popup window.
   */
  private static void popupWindow(String input)
  {
    //Create a stage to work with
    Stage popup = new Stage();
      
    //Pauses the rest of the GUU
      popup.initModality(Modality.APPLICATION_MODAL);
      
      //Takes the input and displays it to the screen
      Label message = new Label(input);
     
      //Creates a lambda to close the popup when enter is pressed
      Label closeMessage = new Label("Hit enter to close this window");
      popup.addEventHandler(KeyEvent.KEY_PRESSED,(KeyEvent event) -> {
        if (KeyCode.ENTER == event.getCode()){
          popup.close();
        }
      });
      
      //Create a Vertical Box to place object
      VBox layout= new VBox(10);
      
      //Add the labels to the program
      layout.getChildren().addAll(message, closeMessage);
      
      //Centers the messages
      layout.setAlignment(Pos.CENTER);
      
      //Creates a scene object to show the window
      Scene scene1= new Scene(layout, 400, 350);
      
      //Sets the scene
      popup.setScene(scene1);
      
      //Shows it to the user
      popup.showAndWait();
  } 
  static int rollCheck;
  static Craps craps = new Craps();
}

