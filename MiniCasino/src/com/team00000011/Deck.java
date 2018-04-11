package com.team00000011;
import java.util.*;
import com.team00000011.Card;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Deck 
{
  private ArrayList<Card> deck;
 
  /**
   * 
   */
  public Deck()
  {
    this.deck = new ArrayList<Card>();
    for(Card.faceValue fv : Card.faceValue.values())
    {
      for(Card.suit s : Card.suit.values())
      {
        deck.add(new Card(fv, s));
      }
    }
    
    for (int i = 0; i < deck.size(); i++)
    {
      System.out.println(deck.get(i).getCardValue());
    }
  }
  
  /**
   * 
   * @return 
   */
  public Card removeCard()
  {
    Card card = deck.remove(0);
    return card;
  }
  
  /**
   * 
   */
  public void shuffle()
  { 
    Collections.shuffle(deck);
  }  
  
  /**
   * 
   * @return 
   */
  public ArrayList<Card> getDeck()
  {
    return this.deck;
  }
}

