package Que8;

import java.util.Scanner;

public class CarEInfo {
private static final Enginet Enginet = null;

public Cart setData()
{

	Cart car=null;
	
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name");
	String a=sc.nextLine();
	
	System.out.println("Enter thr car price");
	double b=sc.nextDouble();
	sc.nextLine();
	
	System.out.println("Enter the Engine type");
	String c=sc.nextLine();
	
	System.out.println("Enter the Engine weight");
	double d=sc.nextInt();
	 car=new Cart(a, b, Enginet);
	 
	 Enginet engine=new Enginet(c, d);
	 return car;
	
	
}
}
