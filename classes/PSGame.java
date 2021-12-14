package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class PSGame extends Game
{
  private String supporteddevice1;
  private String supporteddevice2;

  public void setSupportedDevice1(String supporteddevice1)
  {
    this.supporteddevice1 = supporteddevice1;
  }

  public void setSupportedDevice2(String supporteddevice2)
  {
    this.supporteddevice2 = supporteddevice2;
  }

  public String getSupportedDevice1()
  {
    return supporteddevice1;
  }

  public String getSupportedDevice2()
  {
    return supporteddevice2;
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
    System.out.println("Supported Devices: "+supporteddevice1+", "+supporteddevice2);
    System.out.println("---------------------------------");
  }

}
