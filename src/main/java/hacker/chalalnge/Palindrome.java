package hacker.chalalnge;

import java.util.Scanner;

public class Palindrome {

	public boolean palindrome(String str) {
		int slen = str.length();
		for (int i = 0; i < (slen / 2); i++) {
			if (str.charAt(i) == str.charAt(slen - (i + 1))) {
				continue;
			}
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		System.out.println(palindrome.palindrome(A));
		sc.close();
	}
}
