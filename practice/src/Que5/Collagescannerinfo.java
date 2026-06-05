package Que5;

import java.util.Scanner;

public class Collagescannerinfo {
CollageScanner c=new CollageScanner();

	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("id is :");
		String a=sc.next();
		
		System.out.println("Adderess :");
		String b=sc.next();
		c.name=a;
		c.add=b;
		
	}
	public void getData()
	{
		System.out.println("Enter id:"+c.name);
		System.out.println("Adderess is  :"+c.add);
	}
}
