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
   * Constructor for the CrapsPlayer class. Gets the data for the User and 
   * initates currentBet to 0.
   */
  public CrapsPlayer()
  {
    user = User.getUser();
    currentBet = 0;
  }
 
  @Override
  public void placeBet(int playerBet)
  {
    user.deductFunds(playerBet);
    setCurrentBet(playerBet);
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
