package Que4;

import java.util.Scanner;

public class Patiantthisinfo {

	Patiantthis p=null ;
public void setData()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter id :");
	int a=sc.nextInt();
	
	System.out.println("Enter disease :");
	String b=sc.next();
	
	p=new Patiantthis(a, b);
	
	
}
public void getData()
{
	System.out.println("id is:"+p.id);
	System.out.println("disease is :"+p.disease);
}
}
