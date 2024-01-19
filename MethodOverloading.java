import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter flavour = ");
		String flavour = scan.nextLine();
		System.out.println("Enter quantity = ");
		int quantity = scan.nextInt();
		orderChai();
		orderChai(quantity);
		orderChai(flavour);
		orderChai(flavour, quantity);
		scan.close();
	}

	public static void orderChai(String flavour, int quantity) {
		System.out.println("Bill for " + flavour + "chai of " + quantity + "cups = " + (quantity * 15));
	}

	public static void orderChai(String flavour) {
		System.out.println("Bill for " + flavour + "chai = 15.00");
	}

	public static void orderChai(int quantity) {
		System.out.println("Bill for" + quantity + "cups = " + (quantity * 10));
	}

	public static void orderChai() {
		System.out.println("Bill for 1 cup of chai = 10.00");
	}

}
