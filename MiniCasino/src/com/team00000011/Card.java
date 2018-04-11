/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team00000011;

/**
 *
 * @author E430
 */
public class Card {
    public enum faceValue {
      ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
      EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);
    
    public int cardValue;
    private faceValue(int num)
    {
      this.cardValue = num;
    }
    public int getFaceValue()
    {
      return this.cardValue;
    }
    
    
    }
    public enum suit {HEART, DIAMOND, SPADE, CLUB}

 
  public Card (faceValue cardValue, suit cardSuit)
  {
    this.cardValue = cardValue;
    this.cardSuit = cardSuit;
  }
 
  public suit getSuit()
  {
    return this.cardSuit;
  }
 
 
  public int getCardValue()
  {
    return this.cardValue.getFaceValue();
  } 
  public String toString()
    {
       StringBuilder sb = new StringBuilder();
       switch ( cardValue )
       {
        case ACE: sb.append( 'A' );
             switch ( cardSuit )
              {
                  case CLUB : sb.append( "U+1F0D1" );  break;  // Club
                  case DIAMOND : sb.append( "U+1F0C1" );  break;  // Diamond
                  case HEART : sb.append( "U+1F0B1" );  break;  // Heart
                  case SPADE : sb.append( "U+1F0A1" );  break;  // Spade
              }
             
          break;

        case TWO: sb.append( 2 );
     
             switch ( cardSuit )
              {
                 case CLUB : sb.append( "U+1F0D2" );  break;  // Club
                 case DIAMOND : sb.append( "U+1F0C2" );  break;  // Diamond
                 case HEART : sb.append( "U+1F0B2" );  break;  // Heart
                 case SPADE : sb.append( "U+1F0A2" );  break;  // Spade
              }
                 break;
        
        case THREE: sb.append( 3 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D3" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C3" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B3" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A3" );  break;  // Spade
              }
                 break;
          
        case FOUR: sb.append( 4 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D4" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C4" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B4" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A4" );  break;  // Spade
              }
                 break;
          
        case FIVE: sb.append( 5 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D5" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C5" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B5" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A5" );  break;  // Spade
              }
                 break;

        case SIX: sb.append( 6 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D6" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C6" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B6" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A6" );  break;  // Spade
              }
                 break;
          
        case SEVEN: sb.append( 7 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D7" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C7" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B7" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A7" );  break;  // Spade
              }
                 break;
             
        case EIGHT: sb.append( 8 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D8" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C8" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B8" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A8" );  break;  // Spade
              }
                 break;
          
        case NINE: sb.append( 9 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0D9" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0C9" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0B9" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0A9" );  break;  // Spade
              }
                 break;

        case TEN: sb.append( 10 );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0DA" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0CA" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0BA" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0AA" );  break;  // Spade
              }
                 break;
          
        case JACK: sb.append( 'J' );
             switch ( cardSuit )
              {
                case CLUB: sb.append( "U+1F0DB" );  break;  // Club
                case DIAMOND: sb.append( "U+1F0CB" );  break;  // Diamond
                case HEART: sb.append( "U+1F0BB" );  break;  // Heart
                case SPADE: sb.append( "U+1F0AB" );  break;  // Spade
              }
              break;
          
        case QUEEN: sb.append( 'Q' );
             switch ( cardSuit )
              {
                case CLUB: sb.append( "U+1F0DD" );  break;  // Club
                case DIAMOND: sb.append( "U+1F0CD" );  break;  // Diamond
                case HEART: sb.append( "U+1F0BD" );  break;  // Heart
                case SPADE: sb.append( "U+1F0AD" );  break;  // Spade
              }
              break;
          
        case KING: sb.append( 'K' );
             switch ( cardSuit )
              {
                 case CLUB: sb.append( "U+1F0DE" );  break;  // Club
                 case DIAMOND: sb.append( "U+1F0CE" );  break;  // Diamond
                 case HEART: sb.append( "U+1F0BE" );  break;  // Heart
                 case SPADE: sb.append( "U+1F0AE" );  break;  // Spade
              }
              break;
       }       
       return sb.toString();
    }
    

        // private final faceValue cardFace;
        // private final suit cardSuit;
    private suit cardSuit;
    private faceValue cardValue;
}



