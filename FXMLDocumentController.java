/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgui;

import blackjackgui.Card1.faceValue;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
//import blackjackgui.Card1;
import blackjackgui.Deck1;
import java.util.Collections;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author E430
 */
public class FXMLDocumentController implements Initializable {

  @FXML
  private Button stay;
  @FXML
  private Button hit;
  @FXML
  private Label handValue;
  @FXML
  private Label firstCard;
  @FXML
  private Label secondCard;
  @FXML
  private Label thirdCard;
  @FXML
  private Label fourthCard;
  private static Deck1 deck = new Deck1();
  private static Hand1 handTest = new Hand1(deck);
  private static Hand1 dealerHandTest = new Hand1(deck);
  private static int handTotal = 0;
  private static int playerInitialValue = 0;
  private static int dealerHandTotal = 0;
  private static int dealerInitialValue = 0;
  private static int posCounter = 0;
  private static int bet = 0;
  private static int Account = 1000;
  private static int amtAsAccounted = 0;
  @FXML
  private Button mainMenu;
  @FXML
  private Label dealerFirstCard;
  @FXML
  private Label dealerSecondCard;
  @FXML
  private Label dealerThirdCard;
  @FXML
  private Label dealerFourthCard;
  @FXML
  private Label dealerFifthCard;
  @FXML
  private Label fifthCard;
  @FXML
  private Label action;
  @FXML
  private Button deal;
  @FXML
  private Label dealerValue;
  @FXML
  private Label header;
  @FXML
  private Label playerFunds;
  @FXML
  private Button betOption3;
  @FXML
  private Button betOption2;
  @FXML
  private Button betOption1;
  @FXML
  private Label betAmount;
  @FXML
  private Label bankAccount;

  private void handleButtonAction(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {

    // TODO
  }

  @FXML
  private void stay(ActionEvent event) {
    dealerHandTotal = dealerInitialValue;
    posCounter = 1;
    while (dealerHandTotal <= 16 && handTotal <= 21) {
      Card1 hitCard = dealerHandTest.hit();
      String unicodeCardImage = null;
      dealerHandTotal += hitCard.getCardValue();
      switch (hitCard.getFaceValue()) {
        case "ACE":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD1";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC1";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB1";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA1";
              break;
          }
          break;

        case "TWO":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD2";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC2";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB2";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA2";
              break; // Spade
          }
          break;

        case "THREE":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD3";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC3";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB3";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA3";
              break;// Spade
          }
          break;

        case "FOUR":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD4";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC4";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB4";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA4";
              break;// Spade
          }
          break;

        case "FIVE":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD5";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC5";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB5";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA5";
              break;// Spade
          }
          break;

        case "SIX":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD6";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC6";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB6";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA6";
              break; // Spade
          }
          break;

        case "SEVEN":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD7";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC7";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB7";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA7";
              break; // Spade
          }
          break;

        case "EIGHT":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD8";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC8";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB8";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA8";
              break; // Spade
          }
          break;

        case "NINE":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCD9";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCC9";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCB9";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCA9";
              break; // Spade
          }
          break;

        case "TEN":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCDA";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCCA";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCBA";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCAA";
              break;// Spade
          }
          break;

        case "JACK":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCDB";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCCB";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCBB";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCAB";
              break; // Spade
          }
          break;

        case "QUEEN":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCDD";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCCD";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCBD";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCAD";
              break;  // Spade
          }
          break;

        case "KING":
          switch (hitCard.getSuit()) {
            case CLUB:
              unicodeCardImage = "\uD83C\uDCDE";
              break;
            case DIAMOND:
              unicodeCardImage = "\uD83C\uDCCE";
              break;
            case HEART:
              unicodeCardImage = "\uD83C\uDCBE";
              break;
            case SPADE:
              unicodeCardImage = "\uD83C\uDCAE";
              break;  // Spade
          }
          break;
      }
      switch (posCounter) {
        // case 1: dealerFirstCard.setText(unicodeCardImage); break;
        case 1:
          dealerSecondCard.setText(unicodeCardImage);
          break;
        case 2:
          dealerThirdCard.setText(unicodeCardImage);
          break;
        case 3:
          dealerFourthCard.setText(unicodeCardImage);
          break;
        case 4:
          dealerFifthCard.setText(unicodeCardImage);
          break;
      }
      dealerValue.setText(Integer.toString(dealerHandTotal));
      //dealerHandTest.(dealerHandTest, dealerHandTotal);
      posCounter++;
    }
    if (handTotal > dealerHandTotal) {
      if (handTotal <= 21) {
        action.setText("WINNER WINNER CHICKEN DINNER!");
        Account += bet * 2;
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      } else {
        action.setText("YOU LOST!");
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      }
    } else if (handTotal < dealerHandTotal) {
      if (dealerHandTotal <= 21) {
        action.setText("YOU LOST!");
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      } else {
        action.setText("WINNER WINNER CHICKEN DINNER!");
        Account += bet * 2;
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      }
    } else {
      action.setText("PUSH!");
      Account += bet;
      bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
    }
  }

  @FXML
  private void hit(ActionEvent event) {
    posCounter += 1;
    Card1 hitCard = handTest.hit();
    String unicodeCardImage = null;
    handTotal += hitCard.getCardValue();
    switch (hitCard.getFaceValue()) {
      case "ACE":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD1";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC1";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB1";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA1";
            break;
        }
        break;

      case "TWO":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD2";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC2";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB2";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA2";
            break; // Spade
        }
        break;

      case "THREE":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD3";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC3";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB3";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA3";
            break;// Spade
        }
        break;

      case "FOUR":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD4";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC4";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB4";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA4";
            break;// Spade
        }
        break;

      case "FIVE":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD5";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC5";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB5";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA5";
            break;// Spade
        }
        break;

      case "SIX":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD6";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC6";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB6";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA6";
            break; // Spade
        }
        break;

      case "SEVEN":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD7";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC7";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB7";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA7";
            break; // Spade
        }
        break;

      case "EIGHT":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD8";
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC8";
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB8";
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA8";
            break; // Spade
        }
        break;

      case "NINE":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCD9"; // Club
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCC9"; // Diamond
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCB9"; // Heart
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCA9"; // Spade
            break;
        }
        break;

      case "TEN":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCDA"; // Club
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCCA";// Diamond
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCBA";// Heart
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCAA";// Spade
            break;
        }
        break;

      case "JACK":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCDB"; // Club
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCCB"; // Diamond
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCBB"; // Heart
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCAB"; // Spade
            break;
        }
        break;

      case "QUEEN":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCDD"; // Club
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCCD"; // Diamond
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCBD"; // Heart
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCAD"; // Spade
            break;
        }
        break;

      case "KING":
        switch (hitCard.getSuit()) {
          case CLUB:
            unicodeCardImage = "\uD83C\uDCDE"; // Club
            break;
          case DIAMOND:
            unicodeCardImage = "\uD83C\uDCCE"; // Diamond
            break;
          case HEART:
            unicodeCardImage = "\uD83C\uDCBE"; // Heart
            break;
          case SPADE:
            unicodeCardImage = "\uD83C\uDCAE"; // Spade
            break;
        }
        break;
    }
    switch (posCounter) {
      //case 1: firstCard.setText(unicodeCardImage); break;
      //case 2: secondCard.setText(unicodeCardImage); break;
      case 1:
        thirdCard.setText(unicodeCardImage);
        break;
      case 2:
        fourthCard.setText(unicodeCardImage);
        break;
      case 3:
        fifthCard.setText(unicodeCardImage);
        break;
    }
    //handTest.value();
    
    if (handTotal > 21) {
      int amtOfAces = 0;
         for(Card1 c : handTest.getHand()) {
        if(c.getFaceValue().equals("ACE")) {
          amtOfAces += 1;
        }
      }
         if(amtOfAces > amtAsAccounted) {
           handTotal -= 10;
           amtAsAccounted += 1;
           System.out.println("In here fam");
         }
      action.setText("BUSTED!");
      bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      handValue.setText(Integer.toString(handTotal));
      stay(event);
    }
    handValue.setText(Integer.toString(handTotal));
  }

  @FXML
  private void header(MouseEvent event) {

  }

  @FXML
  private void dealerHandValue(MouseEvent event) {

  }

  @FXML
  private void handValue(MouseEvent event) {

  }

  @FXML
  private void mainMenu(ActionEvent event) {

  }

  @FXML
  private void deal(ActionEvent event) {
    handTotal = 0;
    dealerHandTotal = 0;
    posCounter = 0;
    dealerHandTotal = 0;
    playerInitialValue = 0;
    dealerInitialValue = 0;
    firstCard.setText(null);
    secondCard.setText(null);
    thirdCard.setText(null);
    fourthCard.setText(null);
    fifthCard.setText(null);
    dealerFirstCard.setText(null);
    dealerSecondCard.setText(null);
    dealerThirdCard.setText(null);
    dealerFourthCard.setText(null);
    dealerFifthCard.setText(null);
    Account -= bet;
    bankAccount.setText("Bank Account: " + (Integer.toString(Account)));

    for (int i = 0; i < 4; i++) {
      Card1 hitCard = handTest.hit();
      String cardImg = hitCard.getHexaImage();
      switch (i) {
        case 0: {
          firstCard.setText(cardImg);
          playerInitialValue += hitCard.getCardValue();
          break;
        }
        case 1: {
          secondCard.setText(cardImg);
          playerInitialValue += hitCard.getCardValue();
          break;
        }
        case 2: {
          dealerFirstCard.setText(cardImg);
          dealerInitialValue += hitCard.getCardValue();
          break;
        }
        case 3: {
          dealerSecondCard.setText("\uD83C\uDCA0");
          break;
        }
      }
      //Label testLabel = new Label("\uD83C" + (char) number);
      /*
END OF SOLUTION
       */

      if (playerInitialValue == 21) {
        action.setText("BLACKJACK! WINNER!");
        Account += (bet * 3);
      } else if (dealerInitialValue == 21) {
        action.setText("YOU LOST!");
      } else {
        action.setText("HIT OR STAY?");
      }
    }
    handTotal = playerInitialValue;
    dealerValue.setText(Integer.toString(dealerInitialValue));
    handValue.setText(Integer.toString(playerInitialValue));
  }

  @FXML
  private void betOption3(ActionEvent event) {
    bet = 100;
    betAmount.setText("Bet Amount = 100");
  }

  @FXML
  private void betOption2(ActionEvent event) {
    bet = 50;
    betAmount.setText("Bet Amount = 50");
  }

  @FXML
  private void betOption1(ActionEvent event) {
    bet = 25;
    betAmount.setText("Bet Amount = 25");
  }
}
