package Que6;

import java.util.Scanner;

public class DevelopersgInfo {
Developersg d=new Developersg();
	public Developersg setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Salary is :");
		int a=sc.nextInt();
		
		System.out.println("Name is :");
		String b=sc.next();
		d.setSalary(a);
		d.setName(b);
		return d;
		
	}
}
