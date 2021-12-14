package interfaces;
import java.util.*;
import java.lang.*;
import classes.*;

public interface IEmployeeOperations
{
  void insertEmployee(Employee e);
  void removeEmployee(Employee e);
  Employee getEmployee(int employeeId);
  void showAllEmployees();
  void calculateEmployeeCount();
}
