
public class SumEvenAndOdd {
	public static void main(String[] args) {
		 int sumOdd = 0;
		 int sumEven = 0;
		 int absDiff;
		 for(int number = 1; number <= 100; number ++) {
			 if(number %2 == 0) {
				 sumEven += number;
			 } else {
				 sumOdd += number;
			 }
		 }
		 if(sumEven > sumOdd) {
			 absDiff = sumEven - sumOdd;
		 } else {
			 absDiff = sumOdd - sumEven;
		 }
		 System.out.println("Sum of the odd number is: " + sumOdd);
		 System.out.println("Sum of the even number is: " + sumEven);
		 System.out.println(" The absolute value is: " + absDiff);
	}
}
