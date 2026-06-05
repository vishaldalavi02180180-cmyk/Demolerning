package Que4;

import java.util.Scanner;

public class Patiantsginfo {
Patiantsg p=new Patiantsg();;
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id :");
		int a=sc.nextInt();
		
		System.out.println("Enter disease :");
		String b=sc.next();
		
		p.setId(a);
		p.setDisease(b);
		
	}
	public void getData()
	{
		System.out.println("enter id :"+p.getId());
		System.out.println("Enter disease :"+p.getDisease());
	}
}
