package Que8;

public class CarETest {

	  void getData(Car c) {
	        System.out.println("\n----- Car Details -----");
	        System.out.println("Car Name   : " + c.name);
	        System.out.println("Car Price  : " + c.price);
	        System.out.println("Engine Type   : " + c.engine.type);
	        System.out.println("Engine Weight : " + c.engine.weight);
	    }

	    // Main method
	    public static void main(String[] args) {
	        CarInfo info = new CarInfo();

	        // Getting Car object with data
	        Car car = info.setData();

	        // Printing data
	        CarETest t = new CarETest();
	        t.getData(car);
	    }
}
