package assementpack;

public class ForEachExample {
	public static void main(String args[]) {
		// declaring an array
		int arr[] = { 12, 13, 14, 44 };
		String s1[]= {"suresh","selenium","project","training"};

		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
		for(String s:s1) {
			System.out.println(s);
		}
	}
}
