package Que6;

import java.util.Scanner;

public class DeveloperOInfo {
	DeveloperO d=new DeveloperO();
public DeveloperO setData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("salary is :");
	int a=sc.nextInt();
	
	System.out.println("Name is :");
	String b=sc.next();
	d.salary=a;
	d.name=b;
	return d;
	
	
}
}
