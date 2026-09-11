class Solution {
    public int removeDuplicates(int[] arr) {
        
            if (arr.length <= 1) {
            return arr.length;
        }
            int k=0;
            
        for(int i=1;i<arr.length;i++){     
            
            if(arr[i]>arr[k]){
                k++;
                arr[k] = arr[i];
                
                
            } 
            
        }
        return k+1;  
            
    }
  
        
}
    