package consructor;

public class Car {

	String manufacturer;
	String model;
	double price;

	void drive() {
		System.out.println("Broom Broom...");
	}

	void honk() {
		System.out.println("poo pee poo pee...");
	}

	Car(String manufacturer, String model, double price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
	}

}
