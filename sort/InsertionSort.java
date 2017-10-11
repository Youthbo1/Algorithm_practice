package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4, 3, 1 };
		shellSort(a);

		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void sort(int [] a) {
		for(int p=1;p<a.length;p++) {
			int temp=a[p];
			int i;
			for ( i = p; i >0&&a[i-1]>temp; i--) {
				a[i]=a[i-1];
			}
			a[i]=temp;
		}
		
	}
	public static void shellSort(int [] a) {
		int D,p;
		for(D=a.length/2;D>0;D/=2) {
			for( p=D;p<a.length;p++) {
				int temp=a[p];
				int i;
				for ( i = p; i >=D&&a[i-D]>temp; i-=D) {
					a[i]=a[i-D];
				}
				a[i]=temp;
			}
		}
	}
}
