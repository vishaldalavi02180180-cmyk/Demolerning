package Method;

import java.util.Scanner;

public class StuThisscannerTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Rollno is");
	int a=sc.nextInt();
	
	System.out.println("Name is");
	String b=sc.next();
	
	StuThisscanner s=new StuThisscanner(a,b);
	s.name=b;
	s.rollno=a;
	
	StuThisscannerinfo in=new StuThisscannerinfo();
			in.setData(s);
}
}
