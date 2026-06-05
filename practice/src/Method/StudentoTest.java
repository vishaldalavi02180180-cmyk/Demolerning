package Method;

import java.util.Scanner;

public class StudentoTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Rollno is :");
	int a=sc.nextInt();
	
	System.out.println("Name is:");
	String b=sc.next();
	
	StudentO s=new StudentO();
	s.name=b;
	s.rollno=a;
	
	Studentoinfo e=new Studentoinfo();
	e.setData(s);
}
}
