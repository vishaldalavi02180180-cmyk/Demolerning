package Que7;

import java.util.Scanner;

public class MansgInfo {
	Mansg m=new Mansg();
	public Mansg setData()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR NAME:");
	String a=sc.nextLine();
	
	System.out.println("ENTER YOUR GENDER :");
	String b=sc.nextLine();
	m.setName(a);
	m.setGender(b);
	return m;
}
}