package Que5;

public class CollageThisTest {

	public void getData(CollageThis c)
	{
		System.out.println("Enter the name :"+c.name);
		System.out.println("Enter the Address : "+c.add);
	}
	public static void main(String[] args) {
		CollageThisInfo i=new CollageThisInfo();
		CollageThis col=i.setData();
		
		CollageThisTest t=new CollageThisTest();
		t.getData(col);
	}
}
