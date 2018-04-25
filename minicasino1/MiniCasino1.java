package minicasino1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MiniCasino1 extends Application 
{
    
  @Override
  public void start(Stage stage) throws Exception 
  {
    Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    stage.setMaximized(true);
  }

  /**
  * @param args the command line arguments
  */
  public static void main(String[] args) 
  {
    user = new User("Player1");
    launch(args);
  }
  public static User user;
}