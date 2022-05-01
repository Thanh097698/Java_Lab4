
public class ConsecutiveTotals {
	public static void main(String[] args) {
		int sum = 0;
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		for(int number = LOWERBOUND; number <= UPPERBOUND; number ++) {
			sum += number;
		}
		System.out.println("The sum of 111 to 8899 is " + sum);
	}
}
