package interfaces;
import java.util.*;
import java.lang.*;
import classes.*;

public interface ICustomerOperations
{
  void insertCustomer(Customer c);
  void removeCustomer(Customer c);
  Customer getCustomer(int customerId);
  void showAllCustomers();
  void calculateCustomerCount();
}
