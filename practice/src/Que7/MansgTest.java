package Que7;

public class MansgTest {
public void getData(Mansg ml)
{
	System.out.println("Name:"+ml.getName());
	System.out.println("Gender :"+ml.getGender());
}
public static void main(String[] args) {
	MansgInfo i=new MansgInfo();
	Mansg ml=i.setData();
	
	MansgTest t=new MansgTest();
	t.getData(ml);
}
}
