package hacker.chalalnge;

public class NextGreaterElement {
	static void nge(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int temp = -1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + "\t->\t" + temp);
		}
	}

	public static void main(String[] args) {
		NextGreaterElement.nge(new int[] { 2, 8, 0, 1, 11, 12, 3 });
	}
}
