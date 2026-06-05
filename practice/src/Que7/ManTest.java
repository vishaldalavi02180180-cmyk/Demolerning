package Que7;

public class ManTest {
	
public void getData(Man ml)
{
	
	System.out.println("Enter the Name :"+ml.name);
	System.out.println("Enter the Gender:"+ml.gender);
	
}
public static void main(String[] args) {
	ManInfo i=new ManInfo();
	Man ml=i.setData();
	
	ManTest t=new ManTest();
	t.getData(ml);
	
	
}
}
