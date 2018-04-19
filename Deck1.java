/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgui;

import java.util.*;
import blackjackgui.Card1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Deck1 {

  private ArrayList<Card1> deck;

  public Deck1() {
    this.deck = new ArrayList<Card1>();
    for (Card1.faceValue fv : Card1.faceValue.values()) {
      for (Card1.suit s : Card1.suit.values()) {
        deck.add(new Card1(fv, s));
      }
    }
  }

  public Card1 removeCard() {
    Card1 card = deck.remove(0);
    return card;
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  public ArrayList<Card1> getDeck() {
    return this.deck;
  }

  public ArrayList<Card1> drawCards(int numCardsToDeal) {
    ArrayList<Card1> cards = new ArrayList<Card1>(numCardsToDeal);

    for (int i = 0; i < numCardsToDeal; i++) {
      if (deck.isEmpty()) {
        deck =  (new Deck1()).deck;
        } else {
        Collections.shuffle(deck);
      }
      cards.add(deck.remove(0));
    }
    return cards;
  }
}
