/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicasino1;

public class Card1 {

  public static enum faceValue {
    TWO(2, "TWO"), THREE(3, "THREE"), FOUR(4, "FOUR"),
    FIVE(5, "FIVE"), SIX(6, "SIX"), SEVEN(7, "SEVEN"), EIGHT(8, "EIGHT"),
    NINE(9, "NINE"), TEN(10, "TEN"), JACK(10, "JACK"), QUEEN(10, "QUEEN"),
    KING(10, "KING"), ACE(11, "ACE");

    public int cardValue;
    public String faceValue;

    private faceValue(int cardValue, String faceValue) {
      this.cardValue = cardValue;
      this.faceValue = faceValue;
    }

    public int getCardValue() {
      return this.cardValue;
    }

    public String getFaceValue() {
      return this.faceValue;
    }
  }

  public enum suit {
    HEART, DIAMOND, SPADE, CLUB
  }

  public Card1(faceValue card, suit cardSuit) {
    this.card = card;
    this.cardSuit = cardSuit;
  }

  public suit getSuit() {
    return this.cardSuit;
  }

  public int getCardValue() {
    return this.card.getCardValue();
  }

  public String getFaceValue() {
    return this.card.getFaceValue();
  }

  public String getHexaImage() {
    String hexa = "0xDC";
    switch (this.getSuit()) {
      case CLUB:
        hexa += "D";
        break;
      case DIAMOND:
        hexa += "C";
        break;
      case HEART:
        hexa += "B";
        break;
      case SPADE:
        hexa += "A";
        break;
    }

    switch (this.getFaceValue()) {
      case "TWO":
      case "THREE":
      case "FOUR":
      case "FIVE":
      case "SIX":
      case "SEVEN":
      case "EIGHT":
      case "NINE":
        hexa += Integer.toString(this.getCardValue());
        break;
      case "TEN":
        hexa += "A";
        break;
      case "JACK":
        hexa += "B";
        break;
      case "QUEEN":
        hexa += "D";
        break;
      case "KING":
        hexa += "E";
        break;
      case "ACE":
        hexa += "1";
        break;
      default:
        hexa += "1";
    }
    System.out.println("HEXA: " + hexa);
    int number = Integer.decode(hexa);
    return "\uD83C" + (char) number;
  }
  private suit cardSuit;
  private faceValue card;
}
