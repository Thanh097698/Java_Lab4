
public class SumOfTheSquares {
	public static void main(String[] args) {
		int sumSquares = 0;
		for(int number = 1; number <= 3; number ++) {
			sumSquares += Math.pow(number, 2);
		}
		System.out.println("The sum of squares of 1 to 100 is: " + sumSquares);
	}
}
