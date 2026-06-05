package Que6;

import java.util.Scanner;

public class DeveloperThInfo {
DeveloperTh d=null;
	public DeveloperTh setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Salary is :");
		int a=sc.nextInt();
		
		System.out.println("Name is :");
		String b=sc.next();
		
		d=new DeveloperTh(a, b);
		d.salary=a;
		d.name=b;
		
		return d;
		
	}
}
