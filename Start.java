import java.util.*;
import java.io.*;
import java.lang.*;
import classes.*;
import interfaces.*;

public class Start
{
  public static void main(String[] args)
  {
    String userName = new String("admin");
    String password = new String("pass");

    GameStore gs = new GameStore();
    gs.addDefaultGames();
    gs.addDefaultEmployees();
    gs.addDefaultCustomers();
    gs.setBalance(200000);

    boolean programState = true;
    boolean loginState = false;
    Scanner sc = new Scanner(System.in);


    System.out.println("---------------------");
    System.out.println("| Shotota Game Store |");
    System.out.println("---------------------");

    while(programState)
    {

      System.out.println("\n| Welcome To The Main Menu! Enter The Corresponding Numbers To Navigate |");
      System.out.println("1. Login / Continue");
      System.out.println("2. Policies");
      System.out.println("3. Play A Demo Game");
      System.out.println("4. Logout");
      System.out.println("0. Exit Program");
      int choiceMenu;
      try
      {
      choiceMenu = sc.nextInt();
      }
      catch(InputMismatchException ie)
      {
        System.out.println("Invalid Input Provided. Proceeding To Default Login / Continue Menu");
        choiceMenu = 1;
      }
      sc.nextLine();

      switch(choiceMenu)
      {

        case 1:
          String inputUserName = new String();
          String inputPassword = new String();
          if(loginState == false)
          {
            System.out.println("\n| Login |");
            System.out.println("Enter Username:");
             inputUserName = sc.nextLine();
            System.out.println("Enter Password:");
             inputPassword = sc.nextLine();
          }
          if(inputUserName.equals(userName) && inputPassword.equals(password) || loginState == true)
          {
            loginState = true;
            System.out.println("\n| Welcome |");
            System.out.println("| Game Store Operations |");
            System.out.println("1. Game Operations");
            System.out.println("2. Employee Operations");
            System.out.println("3. Customer Operations");
            System.out.println("4. Customer Inventory Operations");
            System.out.println("5. Deposit Game Store Balance");
            System.out.println("6. Withdraw Game Store Balance");
            System.out.println("7. Game Store Info");
            System.out.println("0. Go Back To Main Menu\n");
            int choiceLogin;
            try
            {
            choiceLogin = sc.nextInt();
            }
            catch(InputMismatchException ie)
            {
              System.out.println("Invalid Input Provided. Returning To Main Menu");
              choiceLogin = 0;
            }
            sc.nextLine();

            switch(choiceLogin)
            {
              case 1:
                System.out.println("\n| Game Operations |");
                System.out.println("1. Show Games List");
                System.out.println("2. Show Detailed Games List");
                System.out.println("3. Add Game");
                System.out.println("4. Remove Game");
                System.out.println("5. Search Game");
                System.out.println("0. Go Back To Main Menu\n");
                int choiceGameStore;
                try
                {
                choiceGameStore = sc.nextInt();
                }
                catch(InputMismatchException ie)
                {
                  System.out.println("Invalid Input Provided. Returning To Main Menu");
                  choiceGameStore = 0;
                }
                sc.nextLine();

                switch(choiceGameStore)
                {
                  case 1:
                    gs.showGameList();
                    break;

                  case 2:
                    gs.showAllGames();
                    break;
                  case 3:
                    System.out.println("\n| Add Game |");
                    System.out.println("1. PC Game");
                    System.out.println("2. Playstation Game");
                    System.out.println("3. Xbox Game");
                    System.out.println("0. Go Back To Main Menu\n");
                    int choiceAddGame;
                    try
                    {
                    choiceAddGame = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Returning To Main Menu");
                      choiceAddGame = 0;
                    }
                    sc.nextLine();

                    switch(choiceAddGame)
                    {
                      case 1:
                        System.out.println("\n| Add PC Game |");
                        System.out.println("Name: ");
                        String nme = sc.nextLine();
                        System.out.println("ID: ");
                        int id;
                        try
                        {
                        id = sc.nextInt();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default ID: 9878");
                          id = 9878;
                        }
                        sc.nextLine();
                        System.out.println("Price: ");
                        double prc;
                        try
                        {
                        prc = sc.nextDouble();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default Price: 4000");
                          prc = 4000;
                        }
                        sc.nextLine();
                        System.out.println("Category: ");
                        String cat = sc.nextLine();
                        System.out.println("Type: ");
                        String tpe = sc.nextLine();
                        System.out.println("Publisher: ");
                        String pub = sc.nextLine();
                        System.out.println("Release Date: ");
                        String rd = sc.nextLine();
                        System.out.println("CPU Requirement: ");
                        String cpurq = sc.nextLine();
                        System.out.println("RAM Requirement: ");
                        String ramrq = sc.nextLine();
                        System.out.println("GPU Requirement: ");
                        String gpurq = sc.nextLine();
                        System.out.println("OS Requirement: ");
                        String osrq = sc.nextLine();

                        PCGame apcgame = new PCGame();
                        apcgame.setName(nme);
                        apcgame.setCategory(cat);
                        apcgame.setType(tpe);
                        apcgame.setPublisher(pub);
                        apcgame.setReleaseDate(rd);
                        apcgame.setId(id);
                        apcgame.setPrice(prc);
                        apcgame.setSystemCPU(cpurq);
                        apcgame.setSystemRAM(ramrq);
                        apcgame.setSystemGPU(gpurq);
                        apcgame.setSystemOS(osrq);
                        gs.insertGame(apcgame);
                        break;

                      case 2:
                        System.out.println("\n| Add Playstation Game |");
                        System.out.println("Name: ");
                        String nme1 = sc.nextLine();
                        System.out.println("ID: ");
                        int id1;
                        try
                        {
                        id1 = sc.nextInt();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default ID: 890");
                          id1 = 890;
                        }

                        sc.nextLine();
                        System.out.println("Price: ");
                        double prc1;
                        try
                        {
                        prc1 = sc.nextDouble();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default Price: 4000");
                          prc1 = 4000;
                        }

                        sc.nextLine();
                        System.out.println("Category: ");
                        String cat1 = sc.nextLine();
                        System.out.println("Type: ");
                        String tpe1 = sc.nextLine();
                        System.out.println("Publisher: ");
                        String pub1 = sc.nextLine();
                        System.out.println("Release Date: ");
                        String rd1 = sc.nextLine();
                        System.out.println("Supported Device 1: ");
                        String sd1 = sc.nextLine();
                        System.out.println("Supported Device 2: ");
                        String sd2 = sc.nextLine();

                        PSGame apsgame = new PSGame();
                        apsgame.setName(nme1);
                        apsgame.setCategory(cat1);
                        apsgame.setType(tpe1);
                        apsgame.setPublisher(pub1);
                        apsgame.setReleaseDate(rd1);
                        apsgame.setId(id1);
                        apsgame.setPrice(prc1);
                        apsgame.setSupportedDevice1(sd1);
                        apsgame.setSupportedDevice2(sd2);
                        gs.insertGame(apsgame);
                        break;

                      case 3:
                        System.out.println("\n| Add Xbox Game |");
                        System.out.println("Name: ");
                        String nme2 = sc.nextLine();
                        System.out.println("ID: ");
                        int id2;
                        try
                        {
                        id2 = sc.nextInt();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default ID: 9876");
                          id2 = 9876;
                        }
                        sc.nextLine();
                        System.out.println("Price: ");
                        double prc2;
                        try
                        {
                        prc2 = sc.nextDouble();
                        }
                        catch(InputMismatchException ie)
                        {
                          System.out.println("Invalid Input Provided. Assigned Default Price: 4000");
                          prc2 = 4000;
                        }
                        sc.nextLine();
                        System.out.println("Category: ");
                        String cat2 = sc.nextLine();
                        System.out.println("Type: ");
                        String tpe2 = sc.nextLine();
                        System.out.println("Publisher: ");
                        String pub2 = sc.nextLine();
                        System.out.println("Release Date: ");
                        String rd2 = sc.nextLine();
                        System.out.println("Supported Device 1: ");
                        String sd1x = sc.nextLine();
                        System.out.println("Supported Device 2: ");
                        String sd2x = sc.nextLine();
                        System.out.println("Subscription Availability: ");
                        String subx = sc.nextLine();

                        XBOXGame axboxgame = new XBOXGame();
                        axboxgame.setName(nme2);
                        axboxgame.setCategory(cat2);
                        axboxgame.setType(tpe2);
                        axboxgame.setPublisher(pub2);
                        axboxgame.setReleaseDate(rd2);
                        axboxgame.setId(id2);
                        axboxgame.setPrice(prc2);
                        axboxgame.setSupportedDevice1(sd1x);
                        axboxgame.setSupportedDevice2(sd2x);
                        axboxgame.setSubscriptionAvailability(subx);
                        gs.insertGame(axboxgame);
                        break;

                      case 0:
                        System.out.println("Going Back...");
                        break;

                      default:
                        System.out.println("Inavlid Input");
                      }
                      break;

                case 4:
                  System.out.println("\n| Remove Game |");
                  System.out.println("Enter Game ID: ");
                  int rgameid;
                  try
                  {
                  rgameid = sc.nextInt();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -5");
                    rgameid = -5;
                  }
                  sc.nextLine();
                  gs.removeGame(gs.getGame(rgameid));
                  break;

                case 5:
                  System.out.println("\n| Search Game |");
                  System.out.println("Enter Game ID: ");
                  int sgameid;
                  try
                  {
                  sgameid = sc.nextInt();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -4");
                    sgameid = -4;
                  }
                  sc.nextLine();
                  if(gs.getGame(sgameid) != null )
                  {
                    System.out.println("Game Found");
                    System.out.println("Name: "+gs.getGame(sgameid).getName());
                    System.out.println("ID: "+gs.getGame(sgameid).getId());
                  }
                  else{System.out.println("Game Not Found");}
                  break;

                case 0:
                  System.out.println("Going Back...");
                  break;

                default:
                  System.out.println("Invalid Input");

                }
              break;
              //end of Game Operations


              case 2:
                System.out.println("\n| Employee Operations |");
                System.out.println("1. Show Employee List");
                System.out.println("2. Add Employee");
                System.out.println("3. Remove Employee");
                System.out.println("4. Search Employee");
                System.out.println("5. Increase Employee Salary");
                System.out.println("6. Decrease Employee Salary");
                System.out.println("0. Go Back To Main Menu\n");
                int choiceEmployee;
                try
                {
                choiceEmployee = sc.nextInt();
                }
                catch(InputMismatchException ie)
                {
                  System.out.println("Invalid Input Provided. Returning To Main Menu");
                  choiceEmployee = 0;
                }
                sc.nextLine();

                switch(choiceEmployee)
                {
                  case 1:
                    gs.showAllEmployees();
                    break;

                  case 2:
                    System.out.println("\n| Add Employee |");
                    System.out.println("Name: ");
                    String enme = sc.nextLine();
                    System.out.println("ID: ");
                    int eid;
                    try
                    {
                    eid = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default ID: 3456");
                      eid = 3456;
                    }
                    sc.nextLine();
                    System.out.println("Salary: ");
                    double eslr;
                    try
                    {
                    eslr = sc.nextDouble();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Salary: 20000");
                      eslr = 20000;
                    }
                    sc.nextLine();
                    Employee aemp = new Employee();
                    aemp.setName(enme);
                    aemp.setEmployeeId(eid);
                    aemp.setSalary(eslr);
                    gs.insertEmployee(aemp);
                    break;

                  case 3:
                    System.out.println("\n| Remove Employee |");
                    System.out.println("Enter Employee ID: ");
                    int reid;
                    try
                    {
                    reid = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -23");
                      reid = -23;
                    }
                    sc.nextLine();
                    gs.removeEmployee(gs.getEmployee(reid));
                    break;


                  case 4:
                    System.out.println("\n| Search Employee |");
                    System.out.println("Enter Employee ID: ");
                    int seid;
                    try
                    {
                    seid = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -27");
                      seid = -27;
                    }
                    sc.nextLine();
                    if(gs.getEmployee(seid) != null )
                    {
                      System.out.println("Employee Found");
                      System.out.println("Name: "+gs.getEmployee(seid).getName());
                      System.out.println("Employee ID: "+gs.getEmployee(seid).getEmployeeId());
                      System.out.println("Salary: "+gs.getEmployee(seid).getSalary());
                    }
                    else{System.out.println("Employee Not Found");}
                    break;

                  case 5:
                    System.out.println("Enter Employee ID: ");
                    int ieid;
                    try
                    {
                    ieid = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -79");
                      ieid = -79;
                    }
                    sc.nextLine();
                    if(gs.getEmployee(ieid) == null){System.out.println("Employee Not Found."); break;}
                    System.out.println("\n| Increase Employee Salary |");
                    System.out.println("Amount: ");
                    double ies;
                    try
                    {
                      ies = sc.nextDouble();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Amound : 0");
                      ies = 0;
                    }
                    sc.nextLine();
                    gs.getEmployee(ieid).increaseSalary(ies);
                    break;

                  case 6:
                    System.out.println("Enter Employee ID: ");
                    int deid;
                    try
                    {
                    deid = sc.nextInt();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -49");
                      deid = -49;
                    }
                    sc.nextLine();
                    if(gs.getEmployee(deid) == null){System.out.println("Employee Not Found."); break;}
                    System.out.println("\n| Decrease Employee Salary |");
                    System.out.println("Amount: ");
                    double des;
                    try
                    {
                      des = sc.nextDouble();
                    }
                    catch(InputMismatchException ie)
                    {
                      System.out.println("Invalid Input Provided. Assigned Default Amound : 0");
                      des = 0;
                    }
                    sc.nextLine();
                    gs.getEmployee(deid).decreaseSalary(des);
                    break;

                  case 0:
                    System.out.println("Going Back...");
                    break;

                  default:
                  System.out.println("Invalid Input");
                }
                break;
                //end of employee Operations

                case 3:
                  System.out.println("\n| Customer Operations |");
                  System.out.println("1. Show Customer List");
                  System.out.println("2. Add Customer");
                  System.out.println("3. Remove Customer");
                  System.out.println("4. Search Customer");
                  System.out.println("0. Go Back To Main Menu\n");
                  int choiceCustomer;
                  try
                  {
                  choiceCustomer = sc.nextInt();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Returning To Main Menu");
                    choiceCustomer = 0;
                  }
                  sc.nextLine();

                  switch(choiceCustomer)
                  {
                    case 1:
                      gs.showAllCustomers();
                      break;

                    case 2:
                      System.out.println("\n| Add Customer |");
                      System.out.println("Name: ");
                      String cnme = sc.nextLine();
                      System.out.println("ID: ");
                      int cid;
                      try
                      {
                      cid = sc.nextInt();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default ID: 2387");
                        cid = 2387;
                      }
                      sc.nextLine();
                      System.out.println("Balance: ");
                      double cbal;
                      try
                      {
                      cbal = sc.nextDouble();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Balance: 10000");
                        cbal = 10000;
                      }
                      sc.nextLine();
                      Customer acus = new Customer();
                      acus.setName(cnme);
                      acus.setCustomerId(cid);
                      acus.setBalance(cbal);
                      gs.insertCustomer(acus);
                      break;

                    case 3:
                      System.out.println("\n| Remove Customer |");
                      System.out.println("Enter Customer ID: ");
                      int rcid;
                      try
                      {
                      rcid = sc.nextInt();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -39");
                        rcid = -39;
                      }
                      sc.nextLine();
                      gs.removeCustomer(gs.getCustomer(rcid));
                      break;

                    case 4:
                      System.out.println("\n| Search Customer |");
                      System.out.println("Enter Customer ID: ");
                      int scid;
                      try
                      {
                      scid = sc.nextInt();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -58");
                        scid = -58;
                      }
                      sc.nextLine();
                      if(gs.getCustomer(scid) != null )
                      {
                        System.out.println("Customer Found");
                        System.out.println("Name: "+gs.getCustomer(scid).getName());
                        System.out.println("Customer ID: "+gs.getCustomer(scid).getCustomerId());
                        System.out.println("Balance: "+gs.getCustomer(scid).getBalance());
                      }
                      else{System.out.println("Customer Not Found");}
                      break;

                    case 0:
                      System.out.println("Going Back...");
                      break;

                    default:
                      System.out.println("Invalid Input");
                      break;

                  }
                  break;
                  //end of customer Operations

                case 4:
                  System.out.println("Enter Customer ID: ");
                  int coid;
                  try
                  {
                  coid = sc.nextInt();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -97");
                    coid = -97;
                  }
                  sc.nextLine();
                  if(gs.getCustomer(coid) == null){System.out.println("Customer Not Found."); break;}
                  System.out.println("\n| Customer Inventory Operations |");
                  System.out.println("1. Show Games List");
                  System.out.println("2. Show Detailed Games List");
                  System.out.println("3. Purchase Game");
                  System.out.println("4. Refund Game");
                  System.out.println("5. Customer Details");
                  System.out.println("6. Deposit Customer Balance");
                  System.out.println("7. Withdraw Customer Balance");
                  System.out.println("0. Go Back To Main Menu\n");
                  int choiceCustomerInventory;
                  try
                  {
                  choiceCustomerInventory = sc.nextInt();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Returning To Main Menu");
                    choiceCustomerInventory = 0;
                  }
                  sc.nextLine();

                  switch(choiceCustomerInventory)
                  {
                    case 1:
                      gs.getCustomer(coid).showGameList();
                      break;

                    case 2:
                      gs.getCustomer(coid).showAllGames();
                      break;

                    case 3:
                      System.out.println("\n| Purchase Game |");
                      System.out.println("Enter Game ID: ");
                      int pgid;
                      try
                      {
                      pgid = sc.nextInt();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -108");
                        pgid = -108;
                      }
                      sc.nextLine();
                      gs.purchaseGame(gs.getCustomer(coid), pgid);
                      break;

                    case 4:
                      System.out.println("\n| Refund Game |");
                      System.out.println("Enter Game ID: ");
                      int rgid;
                      try
                      {
                      rgid = sc.nextInt();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid ID: -298");
                        rgid = -298;
                      }
                      sc.nextLine();
                      gs.refundGame(gs.getCustomer(coid), rgid);
                      break;

                    case 5:
                      System.out.println("\n| Customer Details |");
                      gs.getCustomer(coid).showInfo();
                      break;

                    case 0:
                      System.out.println("Going Back...");
                      break;

                    case 6:
                      System.out.println("\n| Deposit Customer Balance |");
                      System.out.println("Amount: ");
                      double dca;
                      try
                      {
                      dca = sc.nextDouble();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid Amount: 0");
                        dca = 0;
                      }
                      sc.nextLine();
                      gs.getCustomer(coid).Deposit(dca);
                      break;

                    case 7:
                      System.out.println("\n| Withdraw Customer Balance |");
                      System.out.println("Amount: ");
                      double wca;
                      try
                      {
                      wca = sc.nextDouble();
                      }
                      catch(InputMismatchException ie)
                      {
                        System.out.println("Invalid Input Provided. Assigned Default Invalid Amount: 0");
                        wca = 0;
                      }
                      sc.nextLine();
                      gs.getCustomer(coid).Withdraw(wca);
                      break;

                    default:
                      System.out.println("Invalid Input");
                      break;
                  }
                  break;
                  //end of customer inventory operations

                case 0:
                  System.out.println("Going Back...");
                  break;

                case 5:
                  System.out.println("\n| Deposit Game Store Balance |");
                  System.out.println("Amount: ");
                  double dga;
                  try
                  {
                    dga = sc.nextDouble();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Assigned Default Invalid Amount: 0");
                    dga = 0;
                  }
                  sc.nextLine();
                  gs.Deposit(dga);
                  break;

                case 6:
                  System.out.println("\n| Withdraw Game Store Balance |");
                  System.out.println("Amount: ");
                  double wga;
                  try
                  {
                    wga = sc.nextDouble();
                  }
                  catch(InputMismatchException ie)
                  {
                    System.out.println("Invalid Input Provided. Assigned Default Invalid Amount: 0");
                    wga = 0;
                  }
                  sc.nextLine();
                  gs.Withdraw(wga);
                  break;

                case 7:
                  gs.showInfo();
                  break;

                default:
                  System.out.println("Invalid Input");
                  break;
            }


          }

          else{System.out.println("Invalid Credentials. Returning to Main Menu...");break;}
          break;

        case 2:
          // System.out.println("Game Store Policies");
          try
          {
            File fileRead = new File("fileio\\policies.txt");
            Scanner fileReader = new Scanner(fileRead);
            while(fileReader.hasNextLine())
            {
              String lines = fileReader.nextLine();
              System.out.println(lines);
            }
            fileReader.close();
          }
          catch(FileNotFoundException fe)
          {
            System.out.println("File Not Found!");
          }

          break;


        case 3:
          WordGame wg = new WordGame();
          wg.showMenu();
          String gameWord = sc.nextLine();
          wg.playGame(gameWord);
          break;

        case 4:
          if(loginState == false){System.out.println("Already Logged Out");}
          else{System.out.println("Logging Out...");loginState = false;}
          break;

        case 0:
          System.out.println("Exiting Program...");
          programState = false;
          break;

        default:
          System.out.println("Invalid Input");
          break;
      }
    }


  sc.close();
  }
}
