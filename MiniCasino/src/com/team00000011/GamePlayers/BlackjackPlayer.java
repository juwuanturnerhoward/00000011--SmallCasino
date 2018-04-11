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
/**
 *
 * @author
 */
public abstract class BlackjackPlayer extends Player 
{

  
  public BlackjackPlayer()
  {
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
}
