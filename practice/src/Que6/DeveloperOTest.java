package Que6;

public class DeveloperOTest {
public void getData(DeveloperO d)
{
	System.out.println("Enter the Salary :"+d.salary);
	System.out.println("Enter the Name : "+d.name);
}
public static void main(String[] args) {
	DeveloperOInfo i=new DeveloperOInfo();
	DeveloperO d=i.setData();
	DeveloperOTest t=new DeveloperOTest();
	t.getData(d);
}
}
