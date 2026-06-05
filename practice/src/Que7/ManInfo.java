package Que7;

import java.util.Scanner;

public class ManInfo {
	Man m=new Man();
public Man setData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("name is :");
	String a=sc.next();
	
	System.out.println("Gender is");
	String b=sc.next();
	
	m.gender=b;
	m.name=a;
	return m;
}
}
