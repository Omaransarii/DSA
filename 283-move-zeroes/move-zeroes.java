class Solution {
    public void moveZeroes(int[] nums) {
        int first = 0; // Tracks the position where the next non-zero should go
        
        // 'second' scans through the entire array looking for non-zero elements
        for (int second = 0; second < nums.length; second++) {
            // When we find a non-zero element, swap it with the 'first' pointer
            if (nums[second] != 0) {
                swap(nums, first, second);
                first++; // Move the 'first' pointer forward
            }
        }
    }
    
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
