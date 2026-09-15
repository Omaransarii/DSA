class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        //We will do cyclic sort as we see the range is from 1 to n or 0 to n;
        //Google question
       // Similar to ques 268
       int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct );
            }
            else{
                i++;
            }
                
            
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!= index+1 ){
                list.add(index+1);
            }
        }
        return list;
    }
    void swap(int [] arr, int present, int second){
        int temp =arr[present];
        arr[present] = arr[second];
        arr[second] = temp;
    }
}