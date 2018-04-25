/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicasino1;

public class CrapsPlayer extends Player
{
 /**
  * Overrides the placeBet function in the Player abstract class. Accepts a
  * value from the 
  * @param playerBet 
  */
  
  /**
   * 
   */
  public CrapsPlayer()
  {
    user = MiniCasino1.user;
    currentBet = 0;
  }
 
  @Override
  public void placeBet(int playerBet)
  {
    // Check if the user has funds outside of this with checkFundAvailability in
    // Craps
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