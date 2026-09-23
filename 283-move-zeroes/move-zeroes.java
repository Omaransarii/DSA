class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0;
        int second = first + 1;
        
        while (second < nums.length) {
            
            if (nums[first] == 0 && nums[second] != 0) {
                swap(nums, first, second);
                first++;
                second++; // FIXED: Move second forward instead of resetting it
            } 
           
            else if (nums[first] != 0) {
                first++;
                second++;
            } 
            // If both are 0, or first is 0 and second is 0, just look for a non-zero with second
            else {
                second++;
            }
        }
    }
    
    void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
