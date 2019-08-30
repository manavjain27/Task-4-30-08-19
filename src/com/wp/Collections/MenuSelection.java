package com.wp.Collections;
import java.util.*;
public class MenuSelection {
	
	public static ArrayList<EmployeesInfo> empList=new ArrayList<>();
	public static ArrayList<String> itList=new ArrayList<>();
	public static ArrayList<String> hrList=new ArrayList<>();
	public static ArrayList<String> marketList=new ArrayList<>();
	public static ArrayList<String> otherList=new ArrayList<>();
	
	public static HashMap <String,ArrayList<String>> map=new HashMap<>();
	
	public static Scanner sc=new Scanner(System.in);
	
															//Add Employee
	
	public void addEmployee()
	{
		System.out.println("Enter Employee No.");
		int empNum=sc.nextInt();
		
		System.out.println("Enter Employee Name.");
		String empName=sc.next();
		
		System.out.println("Enter Employee Salary.");
		double empSal=sc.nextDouble();
		
		System.out.println("Enter Employee Designation.");
		String empDesig=sc.next();
		
		System.out.println("Enter Employee Department.");
		String empDepartment=sc.next();
		
		EmployeesInfo empInfo=new EmployeesInfo(empNum,empName,empSal,empDesig,empDepartment);
		empList.add(empInfo);
		
		if(empDepartment.equals("it"))
		{
			itList.add(empName);
			map.put(empDepartment, itList);
		}
		else if(empDepartment.equals("hr"))
		{
			hrList.add(empName);
			map.put(empDepartment, hrList);
		}
		else if(empDepartment=="marketing")
		{
			marketList.add(empName);
			map.put(empDepartment, marketList);
		}
		else
		{
			otherList.add(empName);
			map.put(empDepartment, otherList);
		}
		
		
	}
															//View Employees
	public void viewEmployees()
	{
		for(EmployeesInfo e:empList)
			System.out.println(e);
	}
	
															//Remove Employee
	public void removeEmployee()
	{
		System.out.println("Enter Employee No :");
		int eno=sc.nextInt();
		int index=0,tmp=-1;
		
		for(EmployeesInfo e:empList)
		{
			tmp++;
			
			if(e.empno==eno)
			{
				index=tmp;
				break;
			}
		}
		
			empList.remove(index);
			System.out.println("Employee Removed");
			
	}
															//Clear Data
	public void clearData()
	{
		empList.clear();
		System.out.println("List Cleared");
	}
															//Change Sal
	public void changeSal()
	{
		System.out.println("Enter Employee No :");
		int eno=sc.nextInt();
		
		System.out.println("Enter Employee Salary :");
		double newSal=sc.nextDouble();
		int index=0,tmp=-1;
		
		for(EmployeesInfo e:empList)
		{
			tmp++;
			
			
			if(e.empno==eno)
			{
				index=tmp;
				break;
			}
		}
		
		empList.get(index).esal=newSal;
		System.out.println("Salary Updated");
		
		
	}
																		//Search Employee
	public void searchEmployee()
	{
		System.out.println("Enter Employee No :");
		int eno=sc.nextInt();
		int index=0,tmp=-1;
		
		for(EmployeesInfo e:empList)
		{
			tmp++;
			
			if(e.empno==eno)
			{
				index=tmp;
				break;
			}
		}
		
		System.out.println("Employee Details");
		System.out.println(empList.get(index));
	}
																		//View Dept Wise List
	public void viewDeptWiseList()
	{
		
		System.out.println("Enter Department Name");
		String deptName=sc.next();
		
		System.out.println(map.get(deptName));
		
		
		
	}
	
	
																	//Main Function
	public static void main(String[] args) {
		
		
		
		MenuSelection menuselection=new MenuSelection();
		
		System.out.println("Menu");
		
		System.out.println("1.Add Employee");
		System.out.println("2.View All Employees");
		System.out.println("3.Remove Employee");
		System.out.println("4.Clear Data");
		System.out.println("5.Change salary of Employee");
		System.out.println("6.Search Employee");
		System.out.println("7.View Department Wise List");
		System.out.println("8.Exit");
		
		int choice=0;
		
		while(true)
		{
		System.out.println("Enter Your Choice.....");
		choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			
			menuselection.addEmployee();
			break;
			
		case 2:
			
			menuselection.viewEmployees();
			break;
			
		case 3:
			menuselection.removeEmployee();
			break;
			
		case 4:
			
			menuselection.clearData();
			break;
			
		case 5:
			menuselection.changeSal();
			break;
			
		case 6:
			menuselection.searchEmployee();
			break;
			
		case 7:
			menuselection.viewDeptWiseList();
			break;
			
		case 8:
			System.exit(0);
			break;
		
		default:
			System.out.println("Wrong Choice");
		}
		}

	}

}
