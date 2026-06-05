package Que5;

import java.util.Scanner;

public class CollagesgInfo {
	Collagesg co=new Collagesg();
	public Collagesg setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name is :");
		String a=sc.next();
		
		System.out.println("Adderes is :");
		String b=sc.next();
		
		co.setAdd(b);
		co.setName(a);
		return co;
	}

}
