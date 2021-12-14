package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class WordGame
{
  private String alphabets = new String("abcdefghijklmnopqrstuvwxyz");
  private Random r = new Random();
  private int n = r.nextInt(25);
  private char c = alphabets.charAt(n);

  public void showMenu()
  {
    System.out.println("\n ------------");
    System.out.println(" MAKE A WORD ");
    System.out.println(" ------------\n");
    System.out.println("Given Letter is '"+c+"'");
    System.out.println("Type A Word That Contains That Given Letter(In Lowercase Only)");
  }

  public void playGame(String word)
  {
    int flag = 0;
    for(int i=0;i<word.length();i++)
    {
      if(word.charAt(i)==c){flag = 1; break;}
    }
    if(flag == 1){System.out.println("\nYou've Won! :) \nYour Word Contains The Given Letter!");}
    else{System.out.println("\nYou've Lost! :( \nYour Word Does Not Contain The Given Letter!");}
  }
}
