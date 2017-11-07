package hacker.chalalnge;

public class SprialMatrix {

	static String spiralMatrix(int[][] matrix) {
		int cols = matrix[0].length;
		int rows = matrix.length;
		int i, r = 0, c = 0;
		String finalString = "";
		while (r < rows && c < cols) {
			for (i = c; i < cols; i++) {
				finalString += matrix[r][i] + " ";
			}
			r++;
			for (i = r; i < rows; i++) {
				finalString += matrix[i][cols - 1] + " ";
			}
			cols--;

			if (r < rows) {
				for (i = cols - 1; i >= c; i--) {
					finalString += matrix[rows - 1][i] + " ";
				}
				rows--;
			}

			if (c < cols) {
				for (i = rows - 1; i >= r; i--) {
					finalString += matrix[i][c] + " ";
				}
				c++;
			}

		}
		return finalString.trim();
	}

	public static void main(String[] args) {
		int[][] matrix = { };
		System.out.println(SprialMatrix.spiralMatrix(matrix));
	}

}