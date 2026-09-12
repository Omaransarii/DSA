class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> lucky = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int [] min = new int[m]; // Min element for each row (size m)
        int [] max = new int[n]; // Max element for each col (size n)
        // 1. Find min of each row
        for(int i=0;i<m;i++){
            min[i] = matrix[i][0]; // Initialize outside the j loop
            
            for(int j=0;j<n;j++){
                
                if(matrix[i][j]<min[i]){
                    min[i]= matrix[i][j];
                }
            }

        } 
        // 2. Find max of each column
        for(int j=0;j<n;j++){
            max[j]= matrix[0][j];
            for(int i=0;i<m;i++){
                if(matrix[i][j]>max[j]){
                max [j] = matrix[i][j];
            }
            } 
        }    
            
        // 3. Find elements matching both conditions    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {    
                if(matrix[i][j]== min[i]&& matrix[i][j]== max[j] ){
                    lucky.add(matrix[i][j]);
           }
            }
        }

        return lucky;
    }
}