package hacker.chalalnge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lexicographically {

	public void lexicographically(String str, int k, int slen) {
		List<String> sol = new ArrayList<String>();
		String val = null;
		for (int i = 0; i < slen; i++) {
			if (i <= (slen - k)) {
				val = str.substring(i, i + k);
			} else {
				val = str.substring(i);
				break;
			}
			sol.add(val);
		}
		Collections.sort(sol);
		System.out.println(sol.get(0));
		System.out.println(sol.get(sol.size() - 1));
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int k = in.nextInt();
		int slen = S.length();
		if (slen >= 1) {
			Lexicographically ss = new Lexicographically();
			ss.lexicographically(S, k, slen);
		} else {
			in.close();
			throw new Exception("Not valid string");
		}
		in.close();
	}
}
