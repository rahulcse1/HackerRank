package hacker.chalalnge;

public class SprialMatrix {
	
	static void spiralMatrix(int[][] matrix) {
		
		int rows = matrix[0].length;
		int cols = matrix.length;
		int i, r = 0, c = 0;

		while (r < rows && c < cols) {
			// printing first row.
			for (i = c; i < cols; i++) {
				System.out.print(matrix[r][i] + " ");
			}
			r++;
			for (i = r; i < rows; i++) {
				System.out.print(matrix[i][cols - 1] + " ");
			}
			cols--;
			
			if (r < rows) {
				for (i = cols - 1; i >= c; i--) {
					System.out.print(matrix[rows - 1][i] + " ");
				}
				rows--;
			}
			
			if (c < cols) {
				for (i = rows - 1; i >= r; i--) {
					System.out.print(matrix[i][c] + " ");
				}
				c++;
			}
			
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 2, 4 }, { 5, 6 } };
		SprialMatrix.spiralMatrix(matrix);
	}
	
}