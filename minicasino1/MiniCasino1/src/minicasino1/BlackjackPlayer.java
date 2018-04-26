/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicasino1;

/**
 *
 * @author juwuanturner_howard
 */
public class BlackjackPlayer extends Player {
  private User user;
  
  public BlackjackPlayer() {
    user = User.getUser();
  }

  @Override
  public void placeBet(int amountOfBet) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
