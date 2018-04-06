package com.team00000011;

import com.team00000011.Die;
import com.team00000011.GamePlayers.CrapsPlayer;

/**
 *
 * @author kaleb.nelson
 */
public class Craps implements Game
{
  @Override
  public void play()
  {
    System.out.println("Welcome to Craps! The simple dice rolling game!");
    System.out.println("Please press R to roll the die!");
    
    
  }
  @Override
  public boolean checkFundAvailability() 
  {
    return false;
  }
  
  @Override
  public void returnHome() {}
  
  private boolean checkFirstRoll()
  {
    if(this.currentDiceSum == 7 || this.currentDiceSum== 11)
    {
      System.out.println("Congrats! You won your bet!");
      
      return true;
    }
    else if(this.currentDiceSum == 2 || this.currentDiceSum == 3 || 
            this.currentDiceSum == 12)
    {
      System.out.println("Sorry! You rolled a " + this.currentDiceSum + 
              "! You lost your bet");
      
      return true;
    }
    else
    {
      System.out.println("You haven't won yet! Roll again for another chance "
              + "to win!");
      this.targetDiceValue = this.currentDiceSum;
      return false;
    }
  }
  
  /**
   * This function 
   * @return true if compareDiceValues returns true OR if currentDiceSum is
   * equal to 2, 3, or 12
   */
  private boolean checkNextRoll()
  {
    if(compareDiceValues() == true)
    {
    
      System.out.println("Congrats! You hit the target dice value!"
              + "You won " + (currentBet * 2) + "dollars!");
      return true;
    }
    else if (this.currentDiceSum == 2 || this.currentDiceSum == 3 || 
              this.currentDiceSum == 12)
    {
      System.out.println("Sorry! You rolled a " + this.currentDiceSum + 
              "! You lost your bet");
      return true;
    }
    
    else
    {
      System.out.println("You haven't hit your target value yet! Roll again!");
      return false;
    }
  }
  /**
   * This function serves to check if currentDiceSum and targetDiceValue are 
   * are equal to one another within checkNextRoll()
   * @return true if the currentDiceSum and targetDiceValue are equal
   * @return false if currentDiceSum and targetDiceValue are not equal
   */
  private boolean compareDiceValues()
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
  
  //Variables for use in class
  private int currentBet;
  private Die[] Dice = new Die[2];
  private CrapsPlayer gamePlayer = new CrapsPlayer();
  private int targetDiceValue;
  private int currentDiceSum;
}
