/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicasino1;

import java.util.*;
import minicasino1.Card1;

public class Hand1 {

  private ArrayList<Card1> cards = new ArrayList<Card1>();
  private Deck1 deck;
  private int aceCount;

  public Hand1(Deck1 deck) {
    this.deck = deck;
    aceCount = 0;
  }

  /**
   * Calculates the value of the hand. Face cards are worth 10 and an Ace is
   * worth 1 or 11.
   */
  public int value() {
    int total = 0;
    boolean hasAce = false;
    System.out.println("In value");
    for (Card1 card : cards) {
      int val = card.getCardValue();
      if (val == 1) {
        hasAce = true;
      }
      total += val;
    }

    while (total < 11 && hasAce) {
      total += 10;
    }
    return total;
  }

  /**
   * Add one card to the hand from the shoe.
   */
  public Card1 hit() {
    return deck.drawCards(1).get(0);
  }

  public void updateHand() {
    aceCount = 0;

  }

  /**
   * During the play only the first card of the dealers hand should be shown.
   *
   * @return
   */
  public Card1 firstCard() {
    return cards.get(0);
  }

  public ArrayList<Card1> getHand() {
    return this.cards;
  }

  public int updateHandTotal(Card1 hitCard, int handTotal) {
    handTotal += hitCard.getCardValue();
    if (hitCard.getFaceValue().equals("ACE")) {
      aceCount++;
    }

    if (aceCount > 0 && handTotal > 21) {
      handTotal -= 10;
      aceCount--;
    }
    return handTotal;
  }
}
