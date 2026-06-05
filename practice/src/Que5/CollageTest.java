package Que5;

public class CollageTest {
public void getData(Collage c)
{
	System.out.println("Enter Address :"+c.add);
	System.out.println("Enter Name :"+c.name);
}
public static void main(String[] args) {
	Collageinfo i=new Collageinfo();
			Collage col=i.setData();
			
			CollageTest t=new CollageTest();
			t.getData(col);
}
}
