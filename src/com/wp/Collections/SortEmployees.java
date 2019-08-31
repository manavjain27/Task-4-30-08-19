package com.wp.Collections;

import java.util.*;

public class SortEmployees implements Comparator<EmployeesInfo>{
	
	public String sortChoice;
	public String sortOrder;
	
	
	

	public SortEmployees(String sortChoice, String sortOrder) {
		super();
		this.sortChoice = sortChoice;
		this.sortOrder = sortOrder;
	}




	public int compare(EmployeesInfo e1,EmployeesInfo e2)
	{
		if(this.sortChoice.equals("empno"))
		{
			if(this.sortOrder.equals("asc"))
			{
				return e1.empno-e2.empno;
			}
			else
				return e2.empno-e1.empno;
		}
		
		else if(this.sortChoice.equals("ename"))
		{
			if(this.sortOrder.equals("asc"))
			{
				return (int)(e1.ename.compareTo(e2.ename));
			}
			else
				return (int)(e2.ename.compareTo(e1.ename));
		}
		
		else
			if(this.sortOrder.equals("asc"))
			{
				return (int)(e1.esal-e2.esal);
			}
			else
				return (int)(e2.esal-e1.esal);
			
		
	}
	

}
