class Solution {
    public int missingNumber(int[] arr) {
        //We will do cyclic sort as we see the range is from 1 to n or 0 to n;
        
         int n=arr.length;
         int i=0;

         while(i<n){
             int correct_index = arr[i];
             if(arr[i]<arr.length && arr[i]!= arr[correct_index]){
                 swap(arr,i, correct_index);
             }
             else{
                 i++;
             }
             
        }
        //search for misssing number
             for(int index=0;index<arr.length;index++){
                if(index!=arr[index]){
                    return index;
                }
               
             }
             return n;

    

    
        


    }
    void swap(int [] arr, int present, int second){
        int temp =arr[present];
        arr[present] = arr[second];
        arr[second] = temp;
    }
}