class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // Step 1: Create an m x n grid (matrix)
        // Java initializes all cells to 0 by default
        int[][] matrix = new int[m][n];

        // Step 2: Process each operation command in indices
        for (int i = 0; i < indices.length; i++) {
            // Extract the row and column targets for this operation
            int r = indices[i][0];
            int c = indices[i][1];

            // Add 1 to every cell across row 'r' (horizontal sweep)
            for (int col = 0; col < n; col++) {
                matrix[r][col]++;
            }

            // Add 1 to every cell down column 'c' (vertical sweep)
            for (int row = 0; row < m; row++) {
                matrix[row][c]++;
            }
        }

        // Step 3: Count how many cells ended up with odd values
        int count = 0;

        // Traverse every row in the matrix
        for (int i = 0; i < m; i++) {
            // Traverse every column in the current row
            for (int j = 0; j < n; j++) {
                // If dividing by 2 leaves a remainder (not 0), the number is odd
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        // Return the final count of odd cells
        return count;
    }
}