package assementpack;

public class reversenumber {

	public static void main(String[] args) {
	/*	int number = 987654, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}*/
		int num=5878729; 
		int rev=0;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("The reverse of the given number is: " + rev);
	}
}
