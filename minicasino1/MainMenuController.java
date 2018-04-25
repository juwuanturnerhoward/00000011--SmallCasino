//code by: Juwuan Turner-Howard, Brad Cain, Luke Newman, Kaleb Nelson, and Rachel Gelmis
package minicasino1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import minicasino1.Card1.faceValue;
import minicasino1.Deck1;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static minicasino1.MiniCasino1.user;

public class MainMenuController implements Initializable 
{
    
  @FXML
  private Button blackjack;
  @FXML
  private Button crapsButton;
  @FXML
  private Button userButton;
  @FXML
  private Button instructions;
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
  private Label bankAccount = new Label();
  @FXML
  private Button mainMenuButton;
  @FXML
  public  Label username = new Label();
  @FXML
  private Label currency = new Label();
  @FXML
  private Label experience = new Label();
  @FXML
  private ImageView profilePic;
  
  private static Deck1 deck = new Deck1();
  private static Hand1 handTest = new Hand1(deck);
  private static Hand1 dealerHandTest = new Hand1(deck);
  private static int handTotal = 0;
  private static int playerInitialValue = 0;
  private static int dealerHandTotal = 0;
  private static int dealerInitialValue = 0;
  private static int posCounter = 0;
  private static int bet = 0;
  private static int Account = user.getCurrency();
  
      
  @Override
  public void initialize(URL url, ResourceBundle rb) 
  {
    bankAccount.setText("Bank Account: " + Integer.toString(user.getCurrency()));
    username.setText(user.getName());
    currency.setText(Integer.toString(user.getCurrency()));
    experience.setText(Integer.toString(user.getExperience()));
  }    
  //Start of MainMenu
  @FXML
  private void playCraps(ActionEvent event) throws IOException 
  {
    Stage stage;
    Parent root;
    stage=(Stage) crapsButton.getScene().getWindow();    
    Scene scene = createScene();
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }

  @FXML
  private void playBlackjack(ActionEvent event) throws IOException 
  {
    Stage stage; 
    Parent root;
    stage= (Stage) blackjack.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("BlackJack.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }
    
  @FXML
  private void playInstructions(ActionEvent event) throws IOException
  {
  }

  @FXML
  private void playUser(ActionEvent event) throws IOException
  {
    Stage stage; 
    Parent root;
    stage= (Stage) userButton.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("UserGUI.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
    stage.setFullScreen(true);
  }
  //End of MainMenu
  //start of BlackJack 
  @FXML
  private void stay(ActionEvent event) 
  {
    dealerHandTotal = dealerInitialValue;
    posCounter = 1;
    while (dealerHandTotal <= 16 && handTotal <= 21) 
    {
      Card1 hitCard = dealerHandTest.hit();
      dealerHandTotal += hitCard.getCardValue();
      String cardImg = hitCard.getHexaImage();
      switch (posCounter) 
      {
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
    if (handTotal > dealerHandTotal) 
    {
      if (handTotal <= 21) 
      {
        action.setText("WINNER WINNER CHICKEN DINNER!");
        user.addFunds(bet * 2);
        Account += bet * 2;
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      } else 
      {
        action.setText("YOU LOST!");
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      }
    } 
    else if (handTotal < dealerHandTotal) 
    {
      if (dealerHandTotal <= 21) 
      {
        action.setText("YOU LOST!");
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      } 
      else 
      {
        action.setText("WINNER WINNER CHICKEN DINNER!");
        user.addFunds(bet * 2);
        Account += bet * 2;
        bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
      }
    } 
    else 
    {
      action.setText("PUSH!");
      user.addFunds(bet);
      Account += bet;
      bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
    }
  }

  @FXML
  private void hit(ActionEvent event) 
  {
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
  private void BJtoMM(ActionEvent event) throws IOException
  {
    Stage stage; 
    Parent root;
    stage= (Stage) mainMenu.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }

  @FXML
  private void deal(ActionEvent event) 
  {
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
    user.deductFunds(bet);
    bankAccount.setText("Bank Account: " + (Integer.toString(Account)));
    
    for (int i = 0; i < 4; i++) 
    {
      Card1 hitCard = handTest.hit();
      Integer hitCardValue;

      String cardImg = hitCard.getHexaImage();
      switch (i) 
      {
        case 0: 
        {
          firstCard.setText(cardImg);
          playerInitialValue = handTest.updateHandTotal(hitCard, playerInitialValue);
          break;
        }
        case 1: 
        {
          secondCard.setText(cardImg);
          playerInitialValue = handTest.updateHandTotal(hitCard, playerInitialValue);
          break;
        }
        case 2: 
        {
          dealerFirstCard.setText(cardImg);
          dealerInitialValue = handTest.updateHandTotal(hitCard, dealerInitialValue);
          break;
        }
        case 3: 
        {
          dealerSecondCard.setText("\uD83C\uDCA0");
          break;
        }
      }
      //Label testLabel = new Label("\uD83C" + (char) number);
      /*
END OF SOLUTION
       */

      if (playerInitialValue == 21) 
      {
        action.setText("BLACKJACK! WINNER!");
        Account += (bet * 3);
        user.addFunds(bet * 3);
      } 
      else if (dealerInitialValue == 21) 
      {
        action.setText("YOU LOST!");
      } 
      else 
      {
        action.setText("HIT OR STAY?");
      }
    }
    handTotal = playerInitialValue;
    dealerValue.setText(Integer.toString(dealerInitialValue));
    handValue.setText(Integer.toString(playerInitialValue));
  }

  @FXML
  private void betOption3(ActionEvent event) 
  {
    bet = 100;
    betAmount.setText("Bet Amount = 100");
  }

  @FXML
  private void betOption2(ActionEvent event) 
  {
    bet = 50;
    betAmount.setText("Bet Amount = 50");
  }

  @FXML
  private void betOption1(ActionEvent event) 
  {
    bet = 25;
    betAmount.setText("Bet Amount = 25");
  }
  //End of BlackJack
  //Start of userprofile
  @FXML
  private void mainMenuSwitch(ActionEvent event) throws IOException //this to switch
  {
    Stage stage; 
    Parent root;        
    stage=(Stage) mainMenuButton.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true); 
  }
  //End of userprofile
  //Start of Craps
 public static Scene createScene()
  {
    BorderPane root = new BorderPane();
    
    //General Design
    root.setPadding(new Insets(15,20, 10, 10));
    root.setStyle("-fx-background-color: green;");
    
    
    //Begin build top of pane
    //Builds in a left to right order
    HBox addTHBox = new HBox();
    addTHBox.setPadding(new Insets(15,12,15,12));
    addTHBox.setSpacing(10);
    
    //Create a grid pane for data management
    GridPane tPane = new GridPane();
    tPane.setPadding(new Insets(20));
    tPane.setHgap(25);
    tPane.setVgap(15);
    
    //Print user Data to top
    Label user = new Label("Username");
    user.setFont(new Font("Castellar", 24));
    user.setTextFill(Color.web("#FFFF00"));
    tPane.add(user,0,0,1,1);
    Label userName = new Label(craps.gamePlayer.user.getName());
    userName.setFont(new Font("Castellar", 24));
    userName.setTextFill(Color.web("#FFFF00"));
    tPane.add(userName,0,1,1,1);
    Label experience = new Label("Experience");
    experience.setFont(new Font("Castellar", 24));
    experience.setTextFill(Color.web("#FFFF00"));
    tPane.add(experience,1,0,1,1);
    Label userExperience = new Label(Integer.toString(
    craps.gamePlayer.user.getExperience()));
    userExperience.setFont(new Font("Castellar", 24));
    userExperience.setTextFill(Color.web("#FFFF00"));
    tPane.add(userExperience,1,1,1,1);
    Label currency = new Label("Currency");
    tPane.add(currency,2,0,1,1);
    currency.setFont(new Font("Castellar", 24));
    currency.setTextFill(Color.web("#FFFF00"));
    Label curCurrency = new Label(Integer.toString(
            craps.gamePlayer.user.getCurrency()));
    curCurrency.setFont(new Font("Castellar", 24));
    curCurrency.setTextFill(Color.web("#FFFF00"));
    tPane.add(curCurrency,2,1,1,1);
    
    
    //Set a spacer to push Return to right
    final Pane spacer = new Pane();
    addTHBox.setHgrow(spacer,Priority.ALWAYS);
    spacer.setMinSize(10,1);
    
    //Create a "Return to Home" button
    final Button returnButton = new Button("Return to Home");
    returnButton.setPrefSize(125,50);
    returnButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override 
      public void handle(ActionEvent e) 
      {
        Stage stage = null; 
        Parent root = null;
        stage = (Stage) returnButton.getScene().getWindow();
        try 
         {
         root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
         } catch (IOException ex) {
          Logger.getLogger(MainMenuController.class.getName()).log(Level.SEVERE, null, ex);
         }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setMaximized(true);
      }
    });
    
    
    //Adds elements to the HBox
    addTHBox.getChildren().addAll(tPane,spacer,returnButton);
    
    root.setTop(addTHBox);
    //End building of top pane
    
    //Begin building left pane
    //Initialize a new vertical box
    VBox addLVBox = new VBox();
    addLVBox.setPadding(new Insets(15,12,15,12));
    addLVBox.setSpacing(10);
    
    
    //Create a gridpane for space management
    GridPane pane = new GridPane();
    pane.setPadding(new Insets(20));
    pane.setHgap(25);
    pane.setVgap(15);
    
    //Create a title for gridPane
    Label gridTitle = new Label("Game Info");
    gridTitle.setFont(new Font("Castellar", 24));
    gridTitle.setTextFill(Color.web("#FFFF00"));
    pane.add(gridTitle, 0,0,1,1);
    
    //Display current roll
    Label roll = new Label("Current Roll:");
    roll.setFont(new Font("Castellar", 24));
    roll.setTextFill(Color.web("#FFFF00"));
    pane.add(roll, 0,1,1,1);
    Label die = new Label(Integer.toString(craps.Dice[0].getValue())
    + ", " + Integer.toString(craps.Dice[1].getValue()));
    pane.add(die,0,2,1,1);
    
    //Display Target Value
    Label target = new Label("Target Roll");
    target.setFont(new Font("Castellar", 24));
    target.setTextFill(Color.web("#FFFF00"));
    pane.add(target,0,3,1,1);
    Label targetV = new Label(Integer.toString(craps.targetDiceValue));
    targetV.setFont(new Font("Castellar", 24));
    targetV.setTextFill(Color.web("#FFFF00"));
    pane.add(targetV,0,4,1,1);
    
    //Display current bet
    Label bet = new Label("Current Bet:");
    bet.setFont(new Font("Castellar", 24));
    bet.setTextFill(Color.web("#FFFF00"));
    pane.add(bet,0,5,1,1);
    Label cBet = new Label(Integer.toString(craps.gamePlayer.getCurrentBet()));
    cBet.setFont(new Font("Castellar", 24));
    cBet.setTextFill(Color.web("#FFFF00"));
    pane.add(cBet,0,6,1,1);
    
    //add elements to VBox
    addLVBox.getChildren().addAll(pane);
    
    root.setLeft(addLVBox);
    //End building of left pane
    
    //Begin building the center pane
    VBox addCVBox = new VBox();
    addCVBox.setPadding(new Insets(15,12,15,12));
    addCVBox.setSpacing(10);
    
    //Place a craps table on back
    /*root.getCenter().setStyle(
      "-fx-background-image: url(\"/test1Resources/crapsBackground.jpg\");"
      + "-fx-background-size: 500, 500;"
      + "-fx-background-repeat: no-repeat;");
    */
    
    //Begin building right pane
    VBox addRVBox = new VBox();
    addRVBox.setPadding(new Insets(15,12,15,12));
    addRVBox.setSpacing(10);
    
    //Create the "Roll" button
    final Button rollButton = new Button("Roll Die");
    rollButton.setPrefSize(150,150);
    rollButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent e)
      {
        rollDieOnClick();
        die.setText(Integer.toString(craps.Dice[0].getValue())
           + ", " + Integer.toString(craps.Dice[1].getValue()));
        targetV.setText(Integer.toString(craps.targetDiceValue));
        cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
        curCurrency.setText(Integer.toString(
           craps.gamePlayer.user.getCurrency()));
      }
    });
    
    //Create the "Bet" button
    final Button betButton = new Button("Place Bet");
    betButton.setPrefSize(150,150);
    betButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent e)
      {
        openBetWindow();
        cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
        curCurrency.setText(Integer.toString(
                craps.gamePlayer.user.getCurrency()));
      }
    });
    
    //Create the "Restart" Button
    final Button restartButton = new Button("Restart");
    restartButton.setPrefSize(150,150);
    restartButton.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override
      public void handle(ActionEvent e)
      {
        craps.gamePlayer.placeBet(0);
        for(int j = 0; j < 2; j++)
          craps.Dice[j].setValue(0);
        die.setText(Integer.toString(craps.Dice[0].getValue())
            + ", " + Integer.toString(craps.Dice[1].getValue()));
        craps.targetDiceValue = 0;
        targetV.setText(Integer.toString(craps.targetDiceValue));
        cBet.setText(Integer.toString(craps.gamePlayer.getCurrentBet()));
        rollCheck = 0;
      }
    }
    );
    
    //Add buttons to the box
    addRVBox.getChildren().addAll(rollButton,betButton,restartButton);
    
    //Add to borderpane
    root.setRight(addRVBox);
    //End building of right pane
    
    //Initialize the GUI
    Scene scene = new Scene(root,1280,720);
    
    return scene;
  }
 
  private static void rollDieOnClick()
  {
    craps.gamePlayer.rollDie(craps.Dice[0], craps.Dice[1]);
    if(rollCheck == 0)
        {
          craps.checkFirstRoll();
          rollCheck++;
        }
        else
          craps.checkNextRoll();
  }
  private static void openBetWindow()
  {
    TextInputDialog getBet = new TextInputDialog();
        
    getBet.setTitle("Place Bet");
    getBet.setHeaderText("Enter bet amount");
        
    Optional<String> result = getBet.showAndWait();
        
    result.ifPresent(bet -> {
      if(Integer.parseInt(bet) < craps.gamePlayer.user.getCurrency())
      {
        craps.gamePlayer.placeBet(Integer.parseInt(bet));
      } 
      else
      {
        popupWindow("You don't have enough money! Bet a little less");
      }
    });    
  }
  
  /**
   * This function will create a popup window with the text of input in the
   * window
   * @param input a string to be printed in the popup window
   */
  private static void popupWindow(String input)
  {
    Stage popup = new Stage();
      
    popup.initModality(Modality.APPLICATION_MODAL);
      
    Label message = new Label(input);
     
    Button close = new Button("Close");
    close.setOnAction(e->popup.close());
      
    VBox layout= new VBox(10);
     
      
    layout.getChildren().addAll(message, close);
      
    layout.setAlignment(Pos.CENTER);
      
    Scene scene1= new Scene(layout, 300, 250);
      
    popup.setScene(scene1);
      
    popup.showAndWait();
  } 
  static int rollCheck;
  static Craps craps = new Craps();
  //End of craps
}
