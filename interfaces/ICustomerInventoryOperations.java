package interfaces;
import java.util.*;
import java.lang.*;
import classes.*;

public interface ICustomerInventoryOperations
{
  void purchaseGame(Customer c, int gameId);
  void refundGame(Customer c, int gameId);
}
