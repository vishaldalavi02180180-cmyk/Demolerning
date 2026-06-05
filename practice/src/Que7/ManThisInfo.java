package Que7;

import java.util.Scanner;

public class ManThisInfo {
ManThis m=null;
	public ManThis setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name :");
		String a=sc.nextLine();
		
		System.out.println("Gender:");
		String b=sc.nextLine();
		m=new ManThis(a, b);
		m.name=a;
		m.gender=b;
		return m;
		
	}
}
