class Solution {
    //Cyclic Sort
    //
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
         int n=arr.length;
         int i=0;

         while(i<n){
             int correct_index = arr[i]-1;
             if(arr[i]!= arr[correct_index]){
                 swap(arr,i, correct_index);
             }
             else{
                 i++;
             }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]-1 != index) {
                list.add(arr[index]);
            }
        }

        // case 2
        return list;

        
    }
    static void swap(int [] arr, int present, int second){
         int temp =arr[present];
        arr[present] = arr[second];
        arr[second] = temp;
    }
}