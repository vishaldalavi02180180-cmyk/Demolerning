package Method;

import java.util.Scanner;

public class Studentsgtest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Rollno is :");
	int a=sc.nextInt();
	
	System.out.println("Name is");
	String b=sc.next();
	
	Studentsg s=new Studentsg();
	s.setRollno(a);
	s.setName(b);
	Studentsginfo q=new Studentsginfo();
			q.setData(s);
}
}
