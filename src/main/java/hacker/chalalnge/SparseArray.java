package hacker.chalalnge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SparseArray {
	
	HashMap<String, Integer> sparseArray(String[] source, String[] keys) {
		HashMap<String, Integer> output = new HashMap<>();
		for (int i = 0; i < keys.length; i++) {
			String key = keys[i];
			int counter = 0;
			for (int j = 0; j < source.length; j++) {
				if (key == source[j]) {
					counter++;
					output.put(key, counter);
				}
				if (j == source.length - 1 && counter == 0) {
					output.put(key, counter);
				}
			}
		}
		return output;
	}

	void sparseArray() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String str = scan.nextLine();
			map.merge(str, 1, Integer::sum);
		}
		int n1 = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n1; i++) {
			String str = scan.nextLine();
			System.out.println(map.getOrDefault(str, 0));
		}
		scan.close();
	}

	public static void main(String[] args) {

		// one way
		SparseArray sa = new SparseArray();
		String[] source = { "aba", "baba", "aba", "xzxb" };
		String[] keys = { "aba", "xzxb", "ab" };
		HashMap<String, Integer> sparseArray = sa.sparseArray(source, keys);
		Set<Entry<String, Integer>> entrySet = sparseArray.entrySet();
		for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// 2nd way java8 better way.
//		sa.sparseArray();
	}
}
