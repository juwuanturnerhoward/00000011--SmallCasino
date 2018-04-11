package com.team00000011;

import com.team00000011.User;
/**
 * 
 * @author juwuanturner_howard
 */
public abstract class Game
{
  Player gamePlayer = null; 
  int currentBet = 0;
  
  /**
   * 
   */
  abstract void play();
  
  /**
   * 
   * @param amountRequested
   * @return 
   */
  static public boolean checkFundVailability(int amountRequested)
  {
    if(amountRequested >= User.getUser().getCurrency())
      return true;
    return false;
  }
  abstract void returnHome();
}
