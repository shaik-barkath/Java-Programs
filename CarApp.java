package consructor;

public class CarApp {

	public static void main(String[] args) {

		Car c1 = new Car("Tata", "NexonEV", 140000.00);
		System.out.println("manufacturer=" + c1.manufacturer + ",model=" + c1.model + ",price=" + c1.price);
		c1.drive();
		c1.honk();

		Car c2 = new Car("Audi", "Q8", 6000000.00);
		System.out.println("manufacturer=" + c2.manufacturer + ",model=" + c2.model + ",price=" + c2.price);
		c2.drive();
		c2.honk();
	}

}
