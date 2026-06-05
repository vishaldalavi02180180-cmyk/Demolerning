package Que5;

public class CollagesgTest {

public void getData(Collagesg c)
{
	System.out.println("Enter the Name: "+c.getName());
	System.out.println("Enter the Adderess :"+c.getAdd());
}
public static void main(String[] args) {
	CollagesgInfo i=new CollagesgInfo();
	Collagesg col=i.setData();
	CollagesgTest t=new CollagesgTest();
	t.getData(col);
}
}
