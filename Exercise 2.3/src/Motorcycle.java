import java.util.Scanner;

public class Motorcycle {
	String brand;
	String colour;
	String type;

	
	Scanner s = new Scanner(System.in);
	
	void canMove() {
		System.out.println("Can move forward.");
	}
	void printSpecScanner() {
		System.out.println("Enter brand, colour, type");
		String b = s.nextLine();
		String c = s.nextLine();
		String t = s.nextLine();
		

		System.out.println("Brand :" + b);
		System.out.println("Colour :" + c);
		System.out.println("Type :" + t);
		canMove();
	}
	void totalPrice() {
		System.out.println("Motorcycle Price");
		System.out.println("Enter price : RM");
		double p = s.nextDouble();
		System.out.println("Quantity :");
		int q = s.nextInt();
		double price = p*q;
		System.out.printf("Total price : RM%.2f",price);
	}
	void speed() {
		System.out.println("\nSpeed calculation : Please enter distance & time (hour)");
		double d = s.nextDouble();
		int m = s.nextInt();
		double s = d/m;
		System.out.printf("Distance :%.2f km",d);
		System.out.println("\nTime taken (hour):"+ m + " hour ");
		System.out.printf("Motorcycle speed :%.2f km/h",s);
	}
	void fuelPrice() {
		System.out.println("\nFuel Price");
		System.out.println("Enter fuel (litre) :");
		double f = s.nextDouble();
		System.out.printf("Fuel is : %.2fL",f);
		double fuel = 2.00*f;
		System.out.printf("\nTotal fuel price : RM%.2f",fuel);
		
	}

	}

