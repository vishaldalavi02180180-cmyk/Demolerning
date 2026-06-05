package Que6;

public class DeveloperThTest {
public void getdata(DeveloperTh dl)
{
	System.out.println("Enter the salary :"+dl.salary);
	System.out.println("Enter the Name :"+dl.name);
	
}
public static void main(String[] args) {
	DeveloperThInfo i=new DeveloperThInfo();
	DeveloperTh dl=i.setData();
	
	DeveloperThTest t=new DeveloperThTest();
	t.getdata(dl);
}
}
