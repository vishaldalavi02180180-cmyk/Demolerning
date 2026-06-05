package Method;

import java.util.Scanner;

public class TestEmpScannerThis {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter id");
	int a=sc.nextInt();
	
	System.out.println("Enter department");
	String b=sc.next();
	
	EmpThisScanner em=new EmpThisScanner(a, b);
	em.department=b;
	em.id=a;
	
	EmpScannerInfo ei=new EmpScannerInfo();
	ei.getData(em);
	
}
}
