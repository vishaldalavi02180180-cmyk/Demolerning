package Method;

import java.util.Scanner;

public class Ctest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employe id");
	int a=sc.nextInt();
	
	System.out.println("Enter the department");
	String s=sc.next();
	
	C c=new C();
	c.department=s;
	c.id=a;
	System.out.println("value of id :"+c.id);
	System.out.println("Department: "+c.department);
}
}
