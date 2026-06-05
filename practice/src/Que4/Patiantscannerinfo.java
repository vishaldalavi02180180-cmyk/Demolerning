package Que4;

import java.util.Scanner;

public class Patiantscannerinfo {
	Patiant p=new Patiant();
public void setData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("id is:");
	int a=sc.nextInt();
	
	System.out.println("disease is:");
	String b=sc.next();
	
    p.id=a;
    p.disease=b;

}
public void getData()
{
	System.out.println("Enter the id :"+p.id);
	System.out.println("Enter disease :"+p.disease);
}
}
