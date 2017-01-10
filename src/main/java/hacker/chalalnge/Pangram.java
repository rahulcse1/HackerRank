package hacker.chalalnge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().toUpperCase().replaceAll(" ", "");
		char[] charArray = str.toCharArray();
		int len = str.length();
		if ((len >= 1) && (len <= 10 * 10 * 10)) {
			Set<Character> set = new HashSet<Character>();
			for (int i = 0; i < charArray.length; i++) {
				set.add(charArray[i]);
			}
			System.out.println(set.size() == 26 ? "pangram" : "not pangram");
		} else {
			throw (new Exception("Not a valid input"));
		}
	}
}
