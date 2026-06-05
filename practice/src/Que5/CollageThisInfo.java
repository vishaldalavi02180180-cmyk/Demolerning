package Que5;

import java.util.Scanner;

public class CollageThisInfo {
	CollageThis co=null;
public CollageThis setData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("name is :");
	String a=sc.next();
	
	System.err.println("Address :");
	String b=sc.next();
	co=new CollageThis(a, b);
	co.add=b;
	co.name=a;
	return co;
}
}
