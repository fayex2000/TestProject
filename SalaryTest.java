import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.sql.DataSource;



public class SalaryTest {
	
	static double calcSalary(List<Employee> lst) throws Exception
	{
		double total = 0.00;
		for (Employee e: lst)
		{
			if (e != null)
				total += e.getPt().getSalary();
		}
		
		return total;
	}
	
	void findPrimeNumber (int num)
	{
		boolean pNumber[] = new boolean[num];
		
		for (int i=0; i<num; i++)
		{
			pNumber[i] = true;
		}
		
		int n1 = num / 2;
		
		int k = 2;
		
		while (true)
		{
			if (k == n1)
				break;
			
			
			int j = 2;
			
			while (true)
			{
				if (j == n1)
					break;
				
				int m = k * j;
				if (m <= num)
					pNumber[m-1] = false;
				else
					break;
				
				j++;
				k = j;
				
			}
				
			
		}
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		Employee e1 = new Employee(new SalaryEmployee(10000.00));
		Employee e2 = new Employee(new SalaryEmployee(6000.00));
		Employee e3 = new Employee(new HourlyEmployee(100, 20));
		
		double totalS = calcSalary(Arrays.asList(e1, e2, e3));
		
		
		System.out.println("Total Salary Pay is: "+totalS);
	
		
		
	}
}
