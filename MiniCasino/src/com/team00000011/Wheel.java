/**
 *
 * @author luken
 */
public class Wheel
{
  public Wheel()
  {
    this.wheelData = new char[]{'G','B','R','B','R','B','R','B','R','B','R',
      'B','R','B','R','B','R','B','R','B','R','B','R','B','R','B','R','B','R',
      'B','R','B','R','B','R','B','R','G'};
  }
  
  public char getWheelData(int val)
  {
    char temp = this.wheelData[val];
    return temp;
  }
  
  private char[] wheelData;//this holds the color of the numbers on the roulette wheel
}
