package Que8;

public class CartTest {
public void getData(Cart car)
{
	System.out.println("Name is :"+car.name);
	System.out.println("Carprice is :"+car.carprice);
	System.out.println("Engine type is :"+car.enginet.type);
	System.out.println("Engine weight is :"+car.enginet.weight);
	
}
public static void main(String[] args) {
	CarEInfo i=new CarEInfo();
	Cart car=i.setData();
	
	CartTest t=new CartTest();
	 t.getData(car);
}
}
