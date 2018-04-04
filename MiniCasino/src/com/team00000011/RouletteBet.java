/**
 *
 * @author luken
 */
public class RouletteBet 
{
  private int amount;
  private int[] values;
  private int payoutMult;
  
  public RouletteBet(int am, int[] val)
  {
    this.amount = am;
    this.values = val;
    if (values[0] >= 37 && values[0] <= 40)//checking if even, odd or color bet
    {
      this.payoutMult = 2;
    } 
    else if (values[0] < 37 && values[1] < 0)//checking if single value bet
    {
      this.payoutMult = 36;
    }
    else if (values[0] < 37 && values[2] < 0)//checking if two value bet
    {
      this.payoutMult = 18;
    }
    else//if all other checks fail then must be four value bet
    {
      this.payoutMult = 9;
    }
  }
  
  public int getAmount()
  {
    int temp = this.amount;
    return temp;
  }
  
  public int getPayoutMult()
  {
    int temp = this.payoutMult;
    return temp;
  }
  
  public int getValue(int value)
  {
    int temp = this.values[value];
    return temp;
  }
}
