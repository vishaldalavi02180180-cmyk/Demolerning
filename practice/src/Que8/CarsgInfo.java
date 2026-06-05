package Que8;

import java.util.Scanner;

public class CarsgInfo {

	public Carsg setData()
	{
		Carsg c=new Carsg();
		c.carengine e=new Carengine();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		c.setName(sc.nextLine());
		
		System.out.println("Enter the price :");
		c.setPrice(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("enter the type :");
		engine.setType(sc.nextLine());
		
		System.out.println("Enter the weight :");
		engine.setWaight=sc.nextDouble();
		
		c.setEngine(engine);
		
		return c;
		
	}
}
