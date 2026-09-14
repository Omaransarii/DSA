class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m=matrix.length;
        int n =matrix[0].length;
       int top = 0, bottom = m - 1;
      int left = 0, right = n - 1;

    while (top <= bottom && left <= right) {
        // 1. Traverse Right along 'top'
        for (int j = left; j <= right; j++) {
            result.add(matrix[top][j]);
        }
        top++; // Shrink top boundary down

        // 2. Traverse Down along 'right'
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }
        right--; // Shrink right boundary left

        // 3. Traverse Left along 'bottom' (only if rows remain)
        if (top <= bottom) {
            for (int j = right; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--; // Shrink bottom boundary up
        }

        // 4. Traverse Up along 'left' (only if columns remain)
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++; // Shrink left boundary right
        }
    }
    return result;
    }
}