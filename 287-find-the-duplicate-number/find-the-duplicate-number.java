class Solution {
    public int findDuplicate(int[] arr) {

        //Cyclic sort
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1; //correct index for the array
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
            
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]-1!= i){
                return arr[i];
            }
        }return -1;
    }
    void swap(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}