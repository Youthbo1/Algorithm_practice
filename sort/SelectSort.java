package sort;

public class SelectSort {

	public static void main(String[] args) {

		int[] a = { 5, 4, 3, 1 };
		sort(a);

		for (int i : a) {
			System.out.println(i);
		}

	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index])
					index = j;
			}
			if (index != i) {
				int temp = a[index];
				a[index] = a[i];
				a[i] = temp;
			}
		}
	}

}
