
public class SumWhile {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		double average;
		while (number <= 100) {
			sum += number;
			++number;
		}
		average = (double)sum/100;
		System.out.println("The sum of 1 to 100 is " + sum);
		System.out.println("The average is " + average);
	}
}
	