package classes;
import java.util.*;
import java.lang.*;
import interfaces.*;

public class Employee implements IEmployeeSalaryOperations
{
	private String name;
	private int employeeId;
	private double salary;

	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String getName(){return name;}
	public int getEmployeeId(){return employeeId;}
	public double getSalary(){return salary;}

	public void increaseSalary(double amount)
	{
		if(amount > 0)
		{
			salary = salary + amount;System.out.println("Salary Increased");
		}
		else
		{
			System.out.println("Cannot Increase Salary");
		}
	}

	public void decreaseSalary(double amount)
	{
		if(amount > 0 && amount <= salary)
		{
			salary = salary - amount;System.out.println("Salary Decreased");
		}
		else
		{
			System.out.println("Cannot Decrease Salary");
		}
	}



	public void showInfo()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Salary: "+salary+" BDT");
	}
}
