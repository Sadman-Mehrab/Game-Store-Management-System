package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public abstract class Game
{
  protected String name;
  protected String category;
  protected String type;
  protected String publisher;
  protected String releaseDate;
  protected int id;
  protected double price;

  public void setName(String name)
  {
    this.name = name;
  }

  public void setCategory(String category)
  {
    this.category = category;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setPublisher(String publisher)
  {
    this.publisher = publisher;
  }

  public void setReleaseDate(String releaseDate)
  {
    this.releaseDate = releaseDate;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public String getCategory()
  {
    return category;
  }

  public String getType()
  {
    return type;
  }

  public String getPublisher()
  {
    return publisher;
  }

  public String getReleaseDate()
  {
    return releaseDate;
  }

  public int getId()
  {
    return id;
  }

  public double getPrice()
  {
    return price;
  }

  public abstract void showInfo();

}
