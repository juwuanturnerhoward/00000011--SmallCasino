/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Optional;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author kaleb_000
 */
public class CrapsGUIHandler extends Application
{
  
  @Override
  public void start(Stage crapsStage)
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
    userName.setFont(new Font("Castellar", 24));
    userName.setTextFill(Color.web("#FFFF00"));
    tPane.add(userName,0,1,1,1);
    Label experience = new Label("Experience");
    experience.setFont(new Font("Castellar", 24));
    experience.setTextFill(Color.web("#FFFF00"));
    tPane.add(experience,1,0,1,1);
    Label userExperience = new Label(Integer.toString(
    craps.gamePlayer.user.getExperience()));
    userExperience.setFont(new Font("Castellar", 24));
    userExperience.setTextFill(Color.web("#FFFF00"));
    tPane.add(userExperience,1,1,1,1);
    Label currency = new Label("Currency");
    tPane.add(currency,2,0,1,1);
    currency.setFont(new Font("Castellar", 24));
    currency.setTextFill(Color.web("#FFFF00"));
    Label curCurrency = new Label(Integer.toString(
            craps.gamePlayer.user.getCurrency()));
    curCurrency.setFont(new Font("Castellar", 24));
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
    roll.setFont(new Font("Castellar", 24));
    roll.setTextFill(Color.web("#FFFF00"));
    pane.add(roll, 0,1,1,1);
    Label die = new Label(Integer.toString(craps.Dice[0].getValue())
    + ", " + Integer.toString(craps.Dice[1].getValue()));
    pane.add(die,0,2,1,1);
    
    //Display Target Value
    Label target = new Label("Target Roll");
    target.setFont(new Font("Castellar", 24));
    target.setTextFill(Color.web("#FFFF00"));
    pane.add(target,0,3,1,1);
    Label targetV = new Label(Integer.toString(craps.targetDiceValue));
    targetV.setFont(new Font("Castellar", 24));
    targetV.setTextFill(Color.web("#FFFF00"));
    pane.add(targetV,0,4,1,1);
    
    //Display current bet
    Label bet = new Label("Current Bet:");
    bet.setFont(new Font("Castellar", 24));
    bet.setTextFill(Color.web("#FFFF00"));
    pane.add(bet,0,5,1,1);
    Label cBet = new Label(Integer.toString(craps.gamePlayer.getCurrentBet()));
    cBet.setFont(new Font("Castellar", 24));
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
         die.setText(Integer.toString(craps.Dice[0].getValue())
            + ", " + Integer.toString(craps.Dice[1].getValue()));
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
    
    crapsStage.setTitle("Craps: The Game of Rolling Die");
    crapsStage.setScene(scene);
    crapsStage.show();
  
  }
  
  private void rollDieOnClick()
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
  
  /**
   * This function will create a popup window with the text of input in the
   * window
   * @param input a string to be printed in the popup window
   */
  private static void popupWindow(String input)
  {
    Stage popup = new Stage();
      
      popup.initModality(Modality.APPLICATION_MODAL);
      
      Label message = new Label(input);
     
      Button close = new Button("Close");
      close.setOnAction(e->popup.close());
      
      VBox layout= new VBox(10);
     
      
      layout.getChildren().addAll(message, close);
      
      layout.setAlignment(Pos.CENTER);
      
      Scene scene1= new Scene(layout, 300, 250);
      
      popup.setScene(scene1);
      
      popup.showAndWait();
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    //Initializes the objects within the Dice array
    for(int i = 0; i < 2; i++)
    {
      craps.Dice[i] = new Die();
    }
    
   launch(args);
  }
  //Craps object for use in game logic
  int rollCheck;
  static Craps craps = new Craps();
}