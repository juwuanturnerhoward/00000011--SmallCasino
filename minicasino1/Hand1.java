/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicasino1;

import java.util.*;
import minicasino1.Card1;

public class Hand1 
{
  private ArrayList<Card1> cards = new ArrayList<Card1>();
  private Deck1 deck;
  static int aceCount;

  public Hand1(Deck1 deck) 
  {
    this.deck = deck;
    aceCount = 0;

    // Deal two cards to initialize the hand:
    cards.addAll(deck.drawCards(2));
  }

  /**
   * Calculates the value of the hand. Face cards are worth 10 and an Ace is
   * worth 1 or 11.
   */
  public int value() 
  {
    int total = 0;
    boolean hasAce = false;
    System.out.println("In value");
    for (Card1 card : cards) 
    {
     // System.out.println("Card Address: " + card);
      int val = card.getCardValue();
      if (val == 1) {
        hasAce = true;
      }
      total += val;
    }
    //System.out.println("Outside of loop");

    while (total < 11 && hasAce) 
    {
      total += 10;
    }
    return total;
  }

  /**
   * Add one card to the hand from the shoe.
   */
  public Card1 hit() 
  {
    return deck.drawCards(1).get(0);
  }

  /**
   * During the play only the first card of the dealers hand should be shown.
   * @return 
   */
  public Card1 firstCard() 
  {
    return cards.get(0);
  }

 /* public void checkForAce(Hand1 hand, int handTotal) 
  {
    for (int i = 1; i <= cards.size(); i++) 
    {
      if (("ACE".equals(cards.get(i).getFaceValue())) && handTotal > 21)
      {
         this.handTotal -= 10;
      }
    }
  }*/
public ArrayList<Card1> getHand() 
{
  return this.cards;
}
public int updateHandTotal(Card1 hitCard, int handTotal)
{
  //System.out.println("Inside of the aceCount stuff");

  handTotal += hitCard.getCardValue();
  if (hitCard.getFaceValue().equals("ACE")) 
  {
    aceCount++;
  }
  
  if(aceCount > 0 && handTotal > 21) 
  {
    //System.out.println("Inside of the aceCount stuff hand Total");
    handTotal -= 10;
    aceCount--;
  }
  return handTotal;
}
}


/**
 * Represents one card from a standard "bridge" pack of (52) cards. :
 */