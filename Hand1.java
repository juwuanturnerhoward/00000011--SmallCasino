/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgui;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import blackjackgui.Card1;

/**
 *
 * @author E430
 */
public class Hand1 
{

  private ArrayList<Card1> cards = new ArrayList<Card1>();
  private Deck1 deck;

  public Hand1(Deck1 deck) 
  {
    this.deck = deck;

    // Deal two cards to initialize the hand:
    cards.addAll(deck.drawCards(2));

  }

  /**
   * Calculates the value of the hand. Picture cards are worth 10 and an Ace is
   * worth 1 or 11. 152:
   */
  public int value() 
  {
    int total = 0;
    boolean hasAce = false;
    for (Card1 card : cards) 
    {
      int val = card.getCardValue();
      if (val == 1) {
        hasAce = true;
      }
      total += val;
    }

    while (total < (21 - 10) && hasAce) 
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
public ArrayList<Card1> getHand() {
  return this.cards;
}

}


/**
 * Represents one card from a standard "bridge" pack of (52) cards. :
 */
