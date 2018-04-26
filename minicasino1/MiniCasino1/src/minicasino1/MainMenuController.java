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
import static minicasino1.MiniCasino1_1.user;

public class MainMenuController implements Initializable {

  @FXML
  private Button blackjack;
 @FXML
  private Button crapsButton;
  @FXML
  private Button userButton;
  @FXML
  private Button instructions;
  @FXML
  private Label bankAccount = new Label();
  @FXML
  private Button mainMenuButton;
  @FXML
  public Label username = new Label();
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
  public void initialize(URL url, ResourceBundle rb) {
    bankAccount.setText("Bank Account: " + Integer.toString(user.getCurrency()));
    username.setText(user.getName());
    currency.setText(Integer.toString(user.getCurrency()));
    experience.setText(Integer.toString(user.getExperience()));
  }

  //Start of MainMenu
  @FXML
  private void playCraps(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) crapsButton.getScene().getWindow();
    Scene scene = CrapsGUI.createScene();
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }

  @FXML
  private void playBlackjack(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) blackjack.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("BlackJack.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }

  @FXML
  private void playInstructions(ActionEvent event) throws IOException {
  }

  @FXML
  private void playUser(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    stage = (Stage) userButton.getScene().getWindow();
    root = FXMLLoader.load(getClass().getResource("UserGUI.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
    stage.setFullScreen(true);
  }
  //End of MainMenu
}
