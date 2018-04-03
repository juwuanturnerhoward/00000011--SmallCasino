package com.team00000011;

public abstract class Game
{
  Player gamePlayer = null; 
  int currentBet = 0;
  abstract void play();
  abstract boolean checkFundVailability(); 
  abstract void returnHome();
}
