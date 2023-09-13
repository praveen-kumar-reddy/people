package assementpack;

public class Multiplication_Table {
	
	public static void main(String[] args) {
		
		int num = 17;
		
		System.out.print("Enter number:");
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(num + " * " +  i + " = " + num * i);
		}
	}
}