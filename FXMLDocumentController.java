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
      dealerHandTotal += hitCard.getCardValue();
      String cardImg = hitCard.getHexaImage();
      switch (posCounter) {
        // case 1: dealerFirstCard.setText(unicodeCardImage); break;
        case 1:
          dealerSecondCard.setText(cardImg);
          break;
        case 2:
          dealerThirdCard.setText(cardImg);
          break;
        case 3:
          dealerFourthCard.setText(cardImg);
          break;
        case 4:
          dealerFifthCard.setText(cardImg);
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
    handTotal = handTest.updateHandTotal(hitCard, handTotal);
    String unicodeCardImage = null;
    //handTotal += hitCard.getCardValue();
    String cardImg = hitCard.getHexaImage();
    switch (posCounter) 
    {
      //case 1: firstCard.setText(unicodeCardImage); break;
      //case 2: secondCard.setText(unicodeCardImage); break;
      case 1:
        thirdCard.setText(cardImg);
        break;
      case 2:
        fourthCard.setText(cardImg);
        break;
      case 3:
        fifthCard.setText(cardImg);
        break;
    }
   
    
    // handTotal = handTest.value();
    if (handTotal > 21) 
    {
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
      Integer hitCardValue;

      String cardImg = hitCard.getHexaImage();
      switch (i) {
        case 0: {
          firstCard.setText(cardImg);
          playerInitialValue = handTest.updateHandTotal(hitCard, playerInitialValue);

          break;
        }
        case 1: {
          secondCard.setText(cardImg);
          playerInitialValue = handTest.updateHandTotal(hitCard, playerInitialValue);
          break;
        }
        case 2: {
          dealerFirstCard.setText(cardImg);
          dealerInitialValue = handTest.updateHandTotal(hitCard, dealerInitialValue);

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