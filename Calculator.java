import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number =");
		double a = scan.nextDouble();
		System.out.println("Enter another number =");
		double b = scan.nextDouble();
		System.out.println("Enter the Operation (+,-,*,/) =");
		char operation = scan.next().charAt(0);
		calculate(a, b, operation);
		scan.close();
	}

	private static void calculate(double a, double b, char operation) {
		switch (operation) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		}
	}

	public static double calculate(double a, double b, String operation) {
		switch (operation) {
		case "Add":
			System.out.println(a + b);
			break;
		case "Subtraction":
			System.out.println(a - b);
			break;
		case "Multiplication":
			System.out.println(a * b);
			break;
		case "Division":
			System.out.println(a / b);
			break;
		}
		return b;
	}
}
