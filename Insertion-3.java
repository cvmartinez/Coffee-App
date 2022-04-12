
public class Insertion {

	public static void sort(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i < hi + 1; i++) {
			for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}

	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.println(a[i]);
		}
	}

	public static void main(String[] args) {

		StdOut.print("Number of objects: ");
		int n = StdIn.readInt();
		Integer[] b = new Integer[n];
		for (int i = 0; i < n; i++) {
			b[i] = StdRandom.uniform(-100000, 100000);
			StdOut.println(b[i] + "\t" + "milliseconds");

		}

		Insertion.sort(b);

	}

}
