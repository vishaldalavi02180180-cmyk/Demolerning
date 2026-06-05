package Que7;

public class ManThisTest {
public void getData(ManThis mt )
{
	System.out.println("Enter the name :"+mt.name);
	System.out.println("Enter the Gender :"+mt.gender);
}
public static void main(String[] args) {
	ManThisInfo i=new ManThisInfo();
	ManThis mt=i.setData();
	
	ManThisTest t=new ManThisTest();
	t.getData(mt);
}
}
