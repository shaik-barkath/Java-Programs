package practice1;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 33;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at " + i + " index ");
			}
		}
		System.out.println("Element not Found ");
	}

}
