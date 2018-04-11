package com.team00000011;

/**
 *
 * @author luken
 */
public class RouletteBet 
{
  /**
   * 
   * @param amount
   * @param val 
   */
  public RouletteBet(int amount, int[] val)
  {
    this.amount = amount;
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
  
  /**
   * 
   * @return 
   */
  public int getAmount()
  {
    int temp = this.amount;
    return temp;
  }
  
  /**
   * 
   * @return 
   */
  public int getPayoutMult()
  {
    int temp = this.payoutMult;
    return temp;
  }
  
  /**
   * 
   * @param value
   * @return 
   */
  public int getValue(int value)
  {
    int temp = this.values[value];
    return temp;
  }
  
  private int amount;
  private int[] values;
  private int payoutMult;
}
