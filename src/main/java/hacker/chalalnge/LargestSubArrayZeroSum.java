package hacker.chalalnge;

import java.util.HashMap;

public class LargestSubArrayZeroSum {

	public static int maxLengthSubArray1(int[] a) {
		int max_len = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == 0) {
					max_len = Math.max(max_len, j - i + 1);
				}
			}
		}
		return max_len;
	}

	public static int maxLengthSubArray(int[] a) {
		int len = a.length;
		int sum = 0;
		int max_len = 0;

		if (len == 0) {
			return max_len;
		}

		if (len == 0 && a[0] == 0) {
			return max_len + 1;
		}

		HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			sum += a[i];
			if (sum == 0) {
				max_len = i + 1;
			}
			Integer oldi = temp.get(sum);
			if (oldi != null) {
				max_len = Math.max(max_len, i - oldi);
			} else {
				temp.put(sum, i);
			}
		}
		return max_len;
	}

	public static void main(String[] args) {
		int[] a1 = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int[] a2 = { 1, 2, 3 };
		int[] a3 = { 1, 0, 3 };
		System.out.println(maxLengthSubArray(a1));
		System.out.println(maxLengthSubArray(a2));
		System.out.println(maxLengthSubArray(a3));
	}
}