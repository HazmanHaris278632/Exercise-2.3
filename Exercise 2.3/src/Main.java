import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Motorcycle Sportbike = new Motorcycle(); //create first new object Sportbike
		
		System.out.println("===Motorcycle 1===");
		Sportbike.printSpecScanner();
	        Sportbike.totalPrice();
		Sportbike.speed();
		Sportbike.fuelPrice();
		
		System.out.println();
		
		Motorcycle Scooter = new Motorcycle(); //create second new object Scooter
		
		System.out.println("\n===Motorcycle 2===");
		Scooter.printSpecScanner();
		Scooter.totalPrice();
		Scooter.speed();
		Scooter.fuelPrice();
		
		System.out.println();
		
		Motorcycle Offroad = new Motorcycle(); //create third new object Offroad
		
		System.out.println("\n===Motorcycle 3===");
		Offroad.printSpecScanner();
		Offroad.totalPrice();
		Offroad.speed();
		Offroad.fuelPrice();
		

	}

}
