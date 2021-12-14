package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class GameStore implements IGameOperations, ICustomerInventoryOperations, IEmployeeOperations, ICustomerOperations, ITransactions
{
  private double balance;
  private int gameCount;
  private int customerCount;
  private int employeeCount;
  private Game games[] = new Game[1000];
  private Customer customers[] = new Customer[200];
  private Employee employees[] = new Employee[20];

  public void setBalance(double balance)
  {
    this.balance = balance;
  }

  public double getBalance()
  {
    return balance;
  }

  public void insertGame(Game g)
  {
    int flag = 0;
    for(int i=0;i<games.length;i++)
    {
      if(games[i] == null)
      {
        games[i] = g;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Game Added");}
    else{System.out.println("Game Could Not Be Added");}
  }

  public void removeGame(Game g)
  {
    if(g == null){System.out.println("Game Not Found."); return;}
    int flag = 0;
    for(int i=0;i<games.length;i++)
    {
      if(games[i] == g)
      {
        games[i] = null;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Game Removed");}
    else{System.out.println("Game Could Not Be Removed");}
  }

  public Game getGame(int id)
  {
    Game g = null;
    for(int i=0;i<games.length;i++)
    {
      if(games[i] != null)
      {
        if(games[i].getId() == id)
        {
          g = games[i];
          break;
        }
      }
    }
    return g;
  }

  public void showAllGames()
  {
    for(int i=0;i<games.length;i++)
    {
      if(games[i] != null)
      {
        System.out.println("---------------------------------");
        games[i].showInfo();
        System.out.println();
      }
    }
  }

  public void insertCustomer(Customer c)
  {
    int flag = 0;
    for(int i=0;i<customers.length;i++)
    {
      if(customers[i] == null)
      {
        customers[i] = c;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Customer Added");}
    else{System.out.println("Customer Could Not Be Added");}
  }

  public void removeCustomer(Customer c)
  {
    if(c == null){System.out.println("Customer Not Found."); return;}
    int flag = 0;
    for(int i=0;i<customers.length;i++)
    {
      if(customers[i] == c)
      {
        customers[i] = null;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Customer Removed");}
    else{System.out.println("Customer Could Not Be Removed");}
  }


  public Customer getCustomer(int customerId)
  {
    Customer c = null;
    for(int i=0;i<customers.length;i++)
    {
      if(customers[i] != null)
      {
        if(customers[i].getCustomerId() == customerId)
        {
          c = customers[i];
          break;
        }
      }
    }
    return c;
  }

  public void showAllCustomers()
  {
    for(int i=0;i<customers.length;i++)
    {
      if(customers[i] != null)
      {
        System.out.println("---------------------------------");
        customers[i].showInfo();
        System.out.println();
        System.out.println("---------------------------------");
      }
    }
  }

  public void insertEmployee(Employee e)
  {
    int flag = 0;
    for(int i=0;i<employees.length;i++)
    {
      if(employees[i] == null)
      {
        employees[i] = e;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Employee Added");}
    else{System.out.println("Employee Could Not Be Added");}
  }

  public void removeEmployee(Employee e)
  {
    if(e == null){System.out.println("Employee Not Found."); return;}
    int flag = 0;
    for(int i=0;i<employees.length;i++)
    {
      if(employees[i] == e)
      {
        employees[i] = null;
        flag = 1;
        break;
      }
    }
    if(flag == 1){System.out.println("Employee Removed");}
    else{System.out.println("Employee Could Not Be Removed");}
  }

  public Employee getEmployee(int employeeId)
  {
    Employee e = null;
    for(int i=0;i<employees.length;i++)
    {
      if(employees[i] != null)
      {
        if(employees[i].getEmployeeId() == employeeId)
        {
          e = employees[i];
          break;
        }
      }
    }
    return e;
  }

  public void showAllEmployees()
  {
    for(int i=0;i<employees.length;i++)
    {
      if(employees[i] != null)
      {
        System.out.println("---------------------------------");
        employees[i].showInfo();
        System.out.println();
        System.out.println("---------------------------------");
      }
    }
  }

  public void purchaseGame(Customer c, int gameId)
  {
    int flag = 0;
    Game g = null;
    for(int i=0;i<games.length;i++)
    {
      if(games[i] != null)
      {
        if((games[i].getId() == gameId))
        {
          if((c.getBalance() >= games[i].getPrice()))
          {
            g = games[i];
            games[i] = null;
            flag = 1;
            break;
          }

        }

      }
    }
    if(flag == 1)
    {
      System.out.println("Purchase Successful");
      this.balance = this.balance + g.getPrice();
      c.insertGame(g);
      c.Withdraw(g.getPrice());
    }
    else{System.out.println("Purchase Unsuccessful");}
  }
////////////////////
  public void refundGame(Customer c, int gameId)
  {
    Game g = c.getGame(gameId);
    if(g == null){System.out.println("Game Not Found in Customer Inventory.");return;}
    int flag = 0;
    for(int i=0;i<games.length;i++)
    {
      if(games[i] == null)
      {
        if(this.balance >= g.getPrice())
        {
          games[i] = g;
          flag = 1;
          break;
        }
      }
    }
    if(flag == 1)
    {
      System.out.println("Refund Successful");
      this.balance = this.balance - g.getPrice();
      c.removeGame(g);
      c.Deposit(g.getPrice());
    }
    else{System.out.println("Refund Unsuccessful!");}

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

  public void addDefaultGames()
  {

    PCGame pc1 = new PCGame();
    pc1.setName("The Witcher 3: The Wild Hunt");
    pc1.setCategory("Open-World,RPG,Action-Adventure");
    pc1.setType("Single-Player");
    pc1.setPublisher("Sony Entertainment");
    pc1.setReleaseDate("18-06-2020");
    pc1.setId(1360);
    pc1.setPrice(4500);
    pc1.setSystemCPU("Ryzen 5 5600G");
    pc1.setSystemRAM("16 Gigabytes");
    pc1.setSystemGPU("RTX 3090");
    pc1.setSystemOS("Windows 11");

    PSGame ps1 = new PSGame();
    ps1.setName("Ghost of Tsushima");
    ps1.setCategory("Open-World,RPG,Action-Adventure");
    ps1.setType("Single-Player");
    ps1.setPublisher("Sony Entertainment");
    ps1.setReleaseDate("23-06-2020");
    ps1.setId(2250);
    ps1.setPrice(5000);
    ps1.setSupportedDevice1("Playstation 4");
    ps1.setSupportedDevice2("Playstation 5");

    XBOXGame xb1 = new XBOXGame();
    xb1.setName("Forza Horizon 5 Ultimate Edition");
    xb1.setCategory("Open-World,Racing,Simulation");
    xb1.setType("Single-Player");
    xb1.setPublisher("Sony Entertainment");
    xb1.setReleaseDate("13-05-2019");
    xb1.setId(3025);
    xb1.setPrice(5500);
    xb1.setSupportedDevice1("Xbox Series X");
    xb1.setSupportedDevice2("Xbox Series S");
    xb1.setSubscriptionAvailability("Available");

    PCGame pc2 = new PCGame();
    pc2.setName("Assssin's Creed Odyssey");
    pc2.setCategory("Open-World,RPG,Action-Adventure");
    pc2.setType("Single-Player");
    pc2.setPublisher("XD Projekt RED");
    pc2.setReleaseDate("23-12-2020");
    pc2.setId(4040);
    pc2.setPrice(3000);
    pc2.setSystemCPU("Ryzen 5 3400G");
    pc2.setSystemRAM("08 Gigabytes");
    pc2.setSystemGPU("GTX 1070");
    pc2.setSystemOS("Windows 10");

    PSGame ps2 = new PSGame();
    ps2.setName("Uncharted 4: GOTY Edition");
    ps2.setCategory("Open-World,RPG,Action-Adventure");
    ps2.setType("Single-Player");
    ps2.setPublisher("Sony Entertainment");
    ps2.setReleaseDate("26-08-2008");
    ps2.setId(5525);
    ps2.setPrice(4500);
    ps2.setSupportedDevice1("Playstation 3");
    ps2.setSupportedDevice2("Playstation 4");

    XBOXGame xb2 = new XBOXGame();
    xb2.setName("Gears of War 5");
    xb2.setCategory("Open-World,Action-Adventure");
    xb2.setType("Single-Player");
    xb2.setPublisher("Sony Entertainment");
    xb2.setReleaseDate("03-07-2018");
    xb2.setId(6258);
    xb2.setPrice(6000);
    xb2.setSupportedDevice1("Xbox One X");
    xb2.setSupportedDevice2("Xbox One S");
    xb2.setSubscriptionAvailability("Available");

    XBOXGame xb3 = new XBOXGame();
    xb3.setName("Devil May Cry 5: Deluxe Edition");
    xb3.setCategory("Action-Adventure");
    xb3.setType("Single-Player");
    xb3.setPublisher("Sony Entertainment");
    xb3.setReleaseDate("03-07-2017");
    xb3.setId(7689);
    xb3.setPrice(6500);
    xb3.setSupportedDevice1("Xbox One X");
    xb3.setSupportedDevice2("Xbox One S");
    xb3.setSubscriptionAvailability("Available");

    PSGame ps3 = new PSGame();
    ps3.setName("Uncharted 5: A Thief's Rebirth");
    ps3.setCategory("RPG,Arcade");
    ps3.setType("Single-Player");
    ps3.setPublisher("Sony Entertainment");
    ps3.setReleaseDate("26-08-2005");
    ps3.setId(8785);
    ps3.setPrice(4500);
    ps3.setSupportedDevice1("Playstation 3");
    ps3.setSupportedDevice2("Playstation 4");

    PCGame pc3 = new PCGame();
    pc3.setName("The Witcher 2");
    pc3.setCategory("Open-World,RPG,Action-Adventure");
    pc3.setType("Single-Player");
    pc3.setPublisher("XD Projekt RED");
    pc3.setReleaseDate("23-12-2020");
    pc3.setId(9858);
    pc3.setPrice(3000);
    pc3.setSystemCPU("Ryzen 5 3400G");
    pc3.setSystemRAM("12 Gigabytes");
    pc3.setSystemGPU("GTX 1070");
    pc3.setSystemOS("Windows 10");


    games[0] = pc1; games[1] = pc2; games[2] = pc3;
    games[3] = ps1; games[4] = ps2; games[5] = ps3;
    games[6] = xb1; games[7] = xb2; games[8] = xb3;


  }

  public void addDefaultEmployees()
  {
    Employee e1 = new Employee();
    e1.setName("Nathan Drake");
    e1.setEmployeeId(958);
    e1.setSalary(15000);

    Employee e2 = new Employee();
    e2.setName("Carl Johnson");
    e2.setEmployeeId(928);
    e2.setSalary(10000);

    Employee e3 = new Employee();
    e3.setName("Alan Wake");
    e3.setEmployeeId(202);
    e3.setSalary(35000);

    employees[0] = e1; employees[1] = e2; employees[2] = e3;
  }

  public void addDefaultCustomers()
  {
    Customer c1 = new Customer();
    c1.setName("Ezio Auditore");
    c1.setCustomerId(259);
    c1.setBalance(10000);

    Customer c2 = new Customer();
    c2.setName("Leon Kennedy");
    c2.setCustomerId(989);
    c2.setBalance(12000);

    customers[0] = c1; customers[1] = c2;

  }

  public void showInfo()
  {
    calculateGameCount();
    calculateCustomerCount();
    calculateEmployeeCount();
    System.out.println("| Store Info |");
    System.out.println("Store Balance: "+balance+" BDT");
    System.out.println("Number of Games: "+gameCount);
    System.out.println("Number of Customers: "+customerCount);
    System.out.println("Number of Employees: "+employeeCount);
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

  public void calculateEmployeeCount()
	{
    employeeCount = 0;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i] != null)
			{
				employeeCount++;
			}
		}
	}

  public void calculateCustomerCount()
	{
    customerCount = 0;
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i] != null)
			{
				customerCount++;
			}
		}
	}

  public void Withdraw(double amount)
	{
		if(amount >0 && amount<= balance)
			{balance = balance - amount;System.out.println("Transaction Successful");}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}

	public void Deposit(double amount)
	{
		if(amount >0)
			{balance = balance + amount;System.out.println("Transaction Successful");}
		else
		{
			System.out.println("Invalid Transaction");
		}
	}






}
