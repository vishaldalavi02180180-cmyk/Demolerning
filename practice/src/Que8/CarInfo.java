package Que8;

import java.util.Scanner;

public class CarInfo {

	Car setData() {
        Scanner sc = new Scanner(System.in);

        Car c = new Car();
        c.engine = new Engine();   // Creating Engine object

        System.out.print("Enter Car Name: ");
        c.name = sc.nextLine();

        System.out.print("Enter Car Price: ");
        c.price = sc.nextDouble();
        sc.nextLine(); // buffer clear

        System.out.print("Enter Engine Type: ");
        c.engine.type = sc.nextLine();

        System.out.print("Enter Engine Weight: ");
        c.engine.weight = (double) sc.nextDouble();

        return c;   // Returning Car object
    }

}
