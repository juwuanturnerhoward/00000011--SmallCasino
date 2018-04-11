/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team00000011;
import java.util.*;
import com.team00000011.Card;

/**
 *
 * @author
 */
public class Hand 
{
  public Hand()
  {
    playerHand = new ArrayList<>();
    handLimit = 10;
    cardsInHand = 0;
  }
  
  /**
     * Add the card aCard to the hand.
     */
  public void addCard(Card aCard)
  {
   if(cardsInHand < handLimit)
   {
     this.playerHand.add(aCard);
     cardsInHand++;
   }
   else
     System.out.println("You can not hold anymore cards in your hand");
  }
  
  /**
   * Remove all cards from the hand and reset cardsInHand to 0.
   */
  public void emptyHand()
  {
    playerHand.clear();
    cardsInHand = 0;
  }
  
  /**
   * calculates hand size
   * @return the playerHand size  
   */
  public int getHandValue()
  {
    int handValue = 0;
    for(Card card : playerHand)
    {
				handValue += card.getCardValue();
    }
    return handValue;
  }
  private int handLimit;           //limit of how many cards in the hand
  private int cardsInHand;        // Counts how many cards are in hand
  public int totalHandValue;      // Total value of all cards in player hand
  private ArrayList<Card> playerHand;
}
