package net.projecteuler;

/**
 * 
 * @author Naveen
 * 
 * 
 *         A palindromic number reads the same both ways. The largest palindrome
 *         made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 *         Find the largest palindrome made from the product of two 3-digit
 *         numbers.
 */
public class Problem4 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 999; i > 99; --i) {
			for (int j = 999; j > 99; --j) {
				int temp = i * j;
				if (isPalindrome(i * j) && temp > max) {
					max = temp;

				}
			}
		}
		System.out.println(max);
	}

	private static boolean isPalindrome(int i) {
		StringBuffer num = new StringBuffer(i + "");
		return num.reverse().toString().equals(i + "");
	}
}