package Que7;

import java.util.Scanner;

public class MansgInfo {
	Mansg m=new Mansg();
	public Mansg setData()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String a=sc.nextLine();
	
	System.out.println("Enter Gender :");
	String b=sc.nextLine();
	m.setName(a);
	m.setGender(b);
	return m;
}
}