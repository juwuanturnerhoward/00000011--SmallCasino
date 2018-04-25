package com.team00000011;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import com.team00000011.GamePlayers.CrapsPlayer;

/**
 *
 * @author kaleb.nelson
 */
public class Craps extends Game
{
   
  
  @Override
  public void play(){}
  
  @Override
  public void returnHome() {}
  
  /**
   * Constructor for the Craps class. Initalizes the Dice array.
   */
  public Craps()
  {
    for(int i = 0; i < 2; i++)
    {
      Dice[i] = new Die();
    }
  }
  
  /**
   * Checks the first roll of the game; Uses a tracker variable inside the game
   * logic to check if needed
   */
  void checkFirstRoll()
  {
    //Gets the total value of the dice roll
    getDiceTotalValue(Dice[0],Dice[1]);
    
    //If/else block for checking of die
    //Checks if the user rolled 7 or 11, which is a win
    if(this.currentDiceSum == 7 || this.currentDiceSum== 11)
    {
      popupWindow("Congrats! You rolled a " + 
              Integer.toString(this.currentDiceSum) +"! You won" +
              Integer.toString(gamePlayer.getCurrentBet() * 2) +" dollars!");
      gamePlayer.user.addFunds(gamePlayer.getCurrentBet() * 2);
      gamePlayer.placeBet(0);
      Dice[0].setValue(0);
      Dice[1].setValue(0);
      this.targetDiceValue = 0;
    }
    
    //Checks if the user rolled a 2,3 or 12, which is an automatic loss
    else if(this.currentDiceSum == 2 || this.currentDiceSum == 3 || 
            this.currentDiceSum == 12)
    {
      popupWindow("Sorry! You rolled a " + 
              Integer.toString(this.currentDiceSum) + "! You lost your bet...");
      gamePlayer.placeBet(0);
      Dice[0].setValue(0);
      Dice[1].setValue(0);
      this.targetDiceValue = 0;
    }
    
    //Continues informs user to roll again
    else
    {
      popupWindow("You haven't won yet! Roll again for another chance to win!");
      this.targetDiceValue = this.currentDiceSum;
    }
  }
  
  /**
   * This function checks the next roll of the die, being implemented with a 
   * tracking variable inside of the game logic
   */
  void checkNextRoll()
  {
    getDiceTotalValue(Dice[0],Dice[1]);
    
    if(compareDiceValues() == true)
    {
    
      popupWindow("Congrats! You hit the target dice value!"
              + "You won " + Integer.toString(gamePlayer.getCurrentBet() * 2) + 
              "dollars!");
      
      gamePlayer.user.addFunds(gamePlayer.getCurrentBet() * 2);
      gamePlayer.placeBet(0);
      Dice[0].setValue(0);
      Dice[1].setValue(0);
      this.targetDiceValue = 0;
    }
    else if (this.currentDiceSum == 2 || this.currentDiceSum == 3 || 
            this.currentDiceSum == 7 || this.currentDiceSum == 12)
    {
      popupWindow("Sorry! You rolled a " + Integer.toString(this.currentDiceSum)
              + "! You lost your bet");
      gamePlayer.placeBet(0);
      Dice[0].setValue(0);
      Dice[1].setValue(0);
      this.targetDiceValue = 0;
    }
    
    else
    {
      popupWindow("You haven't hit your target value yet! Roll again!");
    }
  }
  /**
   * This function serves to check if currentDiceSum and targetDiceValue are 
   * are equal to one another within checkNextRoll()
   * @return true if the currentDiceSum and targetDiceValue are equal
   * @return false if currentDiceSum and targetDiceValue are not equal
   */
  boolean compareDiceValues()
  {
    if(this.currentDiceSum == this.targetDiceValue)
    {
      return true;
    }
    
    else
    {
      return false;
    }
  }
  /**
   * This function serves to add together the two values of the die objects
   * to give an integer for use in later functions.
   * @param one carries the first index of the Dice variable in the class
   * @param two carries the second index of the Dice variable in the class
   */
  private void getDiceTotalValue(Die one, Die two)
  {
    int dieSum;
    
    dieSum = one.getValue() + two.getValue();
    
    this.currentDiceSum = dieSum;
  }
  
  /**
   * This function will create a popup window with the text of input in the
   * window. Pressing enter will close this window.
   * @param input a string to be printed in the popup window
   */
  private void popupWindow(String input)
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
      
      //Shows it to the user.
      popup.showAndWait();
  }
  
  private int currentBet;
  Die[] Dice = new Die[2];
  CrapsPlayer gamePlayer = new CrapsPlayer();
  int targetDiceValue;
  private int currentDiceSum;
}
