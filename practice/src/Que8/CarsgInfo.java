package Que8;

import java.util.Scanner;

import cc.Carengine;

public class CarsgInfo {
	Carsg cc=new Carsg();
	Carengine car=new Carengine();
	
	
	public Carsg setData()
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String a=sc.next();
		
		System.out.println("Enter the price :");
		double b=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("enter the type :");
		String c=sc.nextLine();
		
		System.out.println("Enter the weight :");
		double d=sc.nextDouble();
		cc.setName(a);
		cc.setPrice(b);
		car.toString();
		
		cc.setEngine(car);
		
		return car;
		
	}


	private void setEngine(Carengine ce2) {
		// TODO Auto-generated method stub
		
	}
}
