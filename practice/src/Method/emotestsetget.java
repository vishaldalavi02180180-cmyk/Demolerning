package Method;

import java.util.Scanner;

public class emotestsetget {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	int a=sc.nextInt();
	System.out.println("Enter Department");
	String b=sc.next();
Empsettergetter em=new 	Empsettergetter();
em.setId(a);
em.setDept(b);


EmpinfoSetter in=new EmpinfoSetter();
in.getData(em);

}
}
