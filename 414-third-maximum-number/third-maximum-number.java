import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        // Step 1: Sort array in increasing order
        Arrays.sort(nums);
        
        // The last element is always the maximum (1st distinct max)
        int distinctCount = 1;
        
        // Step 2: Traverse from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            // Only count if the number is different from the one ahead of it
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
            }
            
            // As soon as we find the 3rd distinct number, return it
            if (distinctCount == 3) {
                return nums[i];
            }
        }
        
        // Step 3: If there are fewer than 3 distinct numbers, return the 1st maximum
        return nums[nums.length - 1];
    }
}