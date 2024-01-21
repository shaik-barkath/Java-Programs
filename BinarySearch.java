package practice1;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 20;
		binarySearch(arr, target);
	}

	public static int binarySearch(int[] arr, int target) {
		int left = arr[0];
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
