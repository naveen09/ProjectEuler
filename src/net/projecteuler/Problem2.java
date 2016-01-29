package net.projecteuler;

/**
 * 
 * @author Naveen
 * 
 *         Each new term in the Fibonacci sequence is generated by adding the
 *         previous two terms. By starting with 1 and 2, the first 10 terms will
 *         be:
 * 
 *         1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 *         By considering the terms in the Fibonacci sequence whose values do
 *         not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {
	static int N = 4000000;
	static int sum = 0;

	public static void main(String[] args) {

		int a = 0, b = 1;
		while (sum < N) {
			int temp = b;
			b = a + b;
			a = temp;
			if (b % 2 == 0) {
				sum += b;
			}
		}
		System.out.println("Sum:\t" + sum);
	}
}