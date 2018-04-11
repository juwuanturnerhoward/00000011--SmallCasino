/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team00000011.GamePlayers;

import com.team00000011.*;
import com.team00000011.Card;
import com.team00000011.Deck;
import com.team00000011.Hand;

/**
 *
 * @author
 */
public class Dealer extends BlackjackPlayer
{	
	/**
	 * Constructor for class Dealer
	 */
	public Dealer(Hand hand, Deck deck)
  {
		this.hand = hand;
		this.deck = deck;
	}
	
	
	//adds a card to the dealers hand
	public Card hit()
  {
		System.out.println("Dealer has hit");
		Card card = dealNext();
		hand.addCard(card);
		return card;
	}
	
	//Deals the next card from the deck
	public Card dealNext()
  {
		Card card = deck.removeCard();
		return card;
	}

  public int checkCardState(Hand playerHand)
  {
    handValue = playerHand.getHandValue();
    return handValue;
  }
  int handValue = 0;
	private Hand hand; //The dealers hand
	private Deck deck; //The deck the dealer deals from

  @Override
  public void placeBet(int playerBet) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
