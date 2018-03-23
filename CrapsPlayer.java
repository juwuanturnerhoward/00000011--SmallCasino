/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
  public void placeBet(int playerBet)
  {
    long currencyHolder;
    
    //Uses getCurrency to capture the users current currency
    currencyHolder = user.getCurrency();
    
    if(currencyHolder < playerBet)
    {
      System.out.println("Temp holder for error");
    }
    else
    {
      user.deductFunds(playerBet);
    }
  }
  
  /**
   * This function accepts two Die object and uses functions within the objects 
   * to set and 
   * @param one A die to be rolled by the player
   * @param two A die to be rolled by the player
   */
  void rollDie(Die one, Die two)
  {
    int rolledOne;
    int rolledTwo;
    
    //Rolls die one and sets its value
    rolledOne = one.roll();
    one.setValue(rolledOne);
    
    //Rolls die two and sets its value
    rolledTwo = two.roll();
    two.setValue(rolledTwo);
  }
  
  /**
   * @return the currentBet
   */
  public long getCurrentBet()
  {
    return currentBet;
  }

  /**
   * @param currentBet the currentBet to set
   */
  public void setCurrentBet(long currentBet)
  {
    this.currentBet = currentBet;
  }
  
  private long currentBet;
}
