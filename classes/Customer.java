package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class Customer implements IGameOperations, ITransactions
{

	private String name;
	private int customerId;
	private int gameCount;
	private double balance;
	private Game games[] = new Game[100];


	public void setName(String name)
	{
		this.name = name;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public String getName(){return name;}
	public int getCustomerId(){return customerId;}
	public double getBalance(){return balance;}

	public void Withdraw(double amount)
	{
		if(amount > 0 && amount<= balance)
			{balance -= amount;System.out.println("Transaction Successful");}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}
	public void Deposit(double amount)
	{
		if(amount > 0)
			{balance += amount;System.out.println("Transaction Successful");}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}

	public void insertGame(Game g)
	{
		int flag = 0;
		for(int i=0; i<games.length; i++)
		{
			if(games[i] == null)
			{
				games[i] = g;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Game Added");}
		else {System.out.println("Game Could Not Be Added");}
	}
	public void removeGame(Game g)
	{
		int flag =0;
		for(int i=0; i<games.length; i++)
		{
			if(games[i] == g)
			{
				games[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("Game Removed");}
		else{System.out.println("Game Could Not Be Removed");}
	}
	public Game getGame(int id)
	{
		Game g = null;
		for(int i=0; i<games.length; i++)
		{
			if(games[i] != null)
			{
				if(games[i].getId() == id)
				{
					g=games[i];
					break;
				}
			}
		}
		return g;
	}
	public void showAllGames()
	{
		for(int i=0; i<games.length; i++)
		{
			if(games[i] != null)
			{
				System.out.println("-----------------------");
				games[i].showInfo();
				System.out.println();
			}
		}
	}
	public void showInfo()
	{
		 calculateGameCount();
     System.out.println("Name: "+name);
     System.out.println("Customer ID: "+customerId);
     System.out.println("Balance: "+balance+" BDT");
     System.out.println("Number of Games: "+gameCount);
	}

	public void showGameList()
	{
		System.out.println("---------------------------------");
		System.out.println("Showing Game List ");
		System.out.println("---------------------------------");
		for(int i=0;i<games.length;i++)
		{
			if(games[i] != null)
			{
				System.out.println("Name: "+games[i].getName());
				System.out.println("ID: "+games[i].getId());
				System.out.println("Price: "+games[i].getPrice()+" BDT");
				System.out.println();
			}
		}
		System.out.println("---------------------------------");
	}

	public void calculateGameCount()
	{
		gameCount = 0;
		for(int i=0;i<games.length;i++)
		{
			if(games[i] != null)
			{
				gameCount++;
			}
		}
	}

}
