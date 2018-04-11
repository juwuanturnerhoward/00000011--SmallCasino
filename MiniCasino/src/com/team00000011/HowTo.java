package com.team00000011;

public class HowTo
{
  /**
   * 
   */
	private HowTo()
	{
		
	}
  
	/**
   * 
   */
	public void printRouletteInstructions()
	{
		System.out.println(rouletteInstructions);
	}
  
  /**
   * 
   */
	public void printCrapsInstructions()
	{
		System.out.println(crapsInstructions);
	}
  
  /**
   * 
   */
	public void printBlackjackInstructions()
	{
		System.out.println(blackjackInstructions);
	}
	
  private String rouletteInstructions = "TO PLAY ROULETTE:";
	private String crapsInstructions = "TO PLAY CRAPS: ";
	private String blackjackInstructions = "TO PLAY BLACKJACK: ";
	
}
