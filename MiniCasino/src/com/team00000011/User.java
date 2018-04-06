package com.team00000011;
/**
 *
 * @author juwuanturner_howard
 */
public class User
{
  private String name;
  private int experience;
  private int currency;
		
  public User(){
    name = "";
    experience = currency = 0;
  }
    
  public User(String name)
  {
    this.name = name;
    experience = 0;
    currency = 1000;
  }

  public String getName()
  {
    return name;
  }
	
  public void setname(String name)
  {
    this.name = name;
  }
    
  public int getExperience()
  {
    return experience;
  }
    
  public int getCurrency()
  {
    return currency;
  }
    
  /* Testing purposes
  public void displayUserInfo()
	{
    System.out.println("Name: " + name);
    System.out.println("Experience: " + experience);
    System.out.println("Currency: " + currency);
  }*/
    
  public void addFunds(int amount)
  {
    currency += amount;
  }
  
  public void deductFunds(int amount)
  {
    currency -= amount;
  }
    
  public void addExperience(int amount)
  {
    experience += amount; 
  }
}
