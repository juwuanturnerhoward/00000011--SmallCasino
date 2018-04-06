package com.team00000011.GamePlayers;

import com.team00000011.Die;
import com.team00000011.Player;
import com.team00000011.User;
/**
 *
 * @author kaleb.nelson
 */
public class CrapsPlayer extends Player
{
 /**
  * Overrides the placeBet function in the Player abstract class. Accepts a
  * value from the 
  * @param playerBet 
  */
 
  @Override
  public void placeBet(int playerBet)
  {
    if(user.getCurrency() < playerBet)
    {
      System.out.println("You dont have enough money for that much!!!");
    }
    else
    {
      user.deductFunds(playerBet);
      setCurrentBet(playerBet);
    }
    
  }
  
  /**
   * This function accepts two Die object and uses functions within the objects 
   * to set and print the die values
   * @param one A die to be rolled by the player
   * @param two A die to be rolled by the player
   */
  public void rollDie(Die one, Die two)
  {
    //Rolls die one and sets its value
    one.setValue(one.roll());
    
    //Rolls die two and sets its value
    two.setValue(two.roll());
    
    //Temp print out
    System.out.println("You rolled a " + one.getValue() + 
            "and a " + two.getValue() + "!");
  }
  
  /**
   * @return the currentBet
   */
  public int getCurrentBet()
  {
    return currentBet;
  }

  /**
   * @param currentBet the currentBet to set
   */
  private void setCurrentBet(int Bet)
  {
    this.currentBet = Bet;
  }
  
  private int currentBet;
}
