package sort;

public class BubbleSort {

	public static void sort(int a[]) {
		int temp;
		int size = a.length;
		// for (int i = 0; i < size - 1; i++) {
		for (int i = size - 1; i >=0; i--) {
			int flag = 0;
			for (int j = 0; j < i ; j++) {
				if (a[j] > a[j + 1]) {
					// System.out.println("swap");
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}
				if (flag == 0)
					break;
			
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 8, 7, 6, 1 };
		sort(a);

		for (int i : a) {
			System.out.println(i);
		}

	}
}
