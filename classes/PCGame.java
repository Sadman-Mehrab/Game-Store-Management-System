package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class PCGame extends Game
{
  private String systemCPU;
  private String systemRAM;
  private String systemGPU;
  private String systemOS;

  public void setSystemCPU(String systemCPU)
  {
    this.systemCPU=systemCPU;
  }

  public void setSystemRAM(String systemRAM)
  {
    this.systemRAM=systemRAM;
  }

  public void setSystemGPU(String systemGPU)
  {
    this.systemGPU=systemGPU;
  }

  public void setSystemOS(String systemOS)
  {
    this.systemOS=systemOS;
  }

  public String getSystemCPU()
  {
    return systemCPU;
  }

  public String getSystemRAM()
  {
    return systemRAM;
  }

  public String getSystemGPU()
  {
    return systemGPU;
  }

  public String getSystemOS()
  {
    return systemOS;
  }

  public void showInfo()
  {
    System.out.println("---------------------------------");
    System.out.println("Name: "+name);
    System.out.println("Category: "+category);
    System.out.println("Type: "+type);
    System.out.println("Publisher: "+publisher);
    System.out.println("Game ID: "+id);
    System.out.println("Price: "+price+" BDT");
    System.out.println();
    System.out.println("---------------------------------");
    System.out.println("System Requirements:");
    System.out.println("---------------------------------");
    System.out.println("Processor: "+systemCPU);
    System.out.println("Memory: "+systemRAM);
    System.out.println("Graphics Card: "+systemGPU);
    System.out.println("Operating System: "+systemOS);
    System.out.println("---------------------------------");
  }

}
