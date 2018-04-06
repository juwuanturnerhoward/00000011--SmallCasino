/**
 *
 * @author luken
 */
public class RoulettePlayer extends Player
{
  public RoulettePlayer()
  {
    this.bets = new RouletteBet[4];
  }
  
  public void chooseLocationOfBet()
  {
    System.out.println("location of bet called");//this may not be needed
  }
  
   public void getUser()
  {
    System.out.println("get user function called");//this gets user data to use in this player for the game roulette
  }

  @Override
  public void placeBet(int playerBet) {
   System.out.println("placeBet called");//this is where the bet is placed into the bets array
  }
  
  private RouletteBet[] bets;//the 4 bets that the user can have placed at one time
}
