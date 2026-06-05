package Que6;

public class DevelopersgTest {
public void getData(Developersg de)
{
	System.out.println("Enter the salary :"+de.getSalary());
	System.out.println("Enter the name :"+de.getName());
	
}
public static void main(String[] args) {
	DevelopersgInfo i=new DevelopersgInfo();
	Developersg dl=i.setData();
	DevelopersgTest t=new DevelopersgTest();
	t.getData(dl);
}
}
