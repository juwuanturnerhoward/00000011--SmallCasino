/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team00000011.GamePlayers;
import com.team00000011.Card;
import com.team00000011.Deck;
import com.team00000011.Hand;
import com.team00000011.Player;
import com.team00000011.GamePlayers.Dealer;
import com.team00000011.*;
/**
 *
 * @author
 */
public class BlackjackPlayer extends Player 
{
  
  public BlackjackPlayer()
  {
    user = User.getUser();
		this.hand = new Hand();
    bet = 0;
  }  
  
  
  public void hit(Card card)
  {
		System.out.println("Player has hit");
		hand.addCard(card);
	}

  private Hand hand;
  private int bet;

  @Override
  public void placeBet(int amountOfBet) {
    throw new UnsupportedOperationException("Not supported yet.");
    //To change body of generated methods, choose Tools | Templates.
  }
}
