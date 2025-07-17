public class Q2_FloorOfANumber {

    public static void main(String[] args) {
        // Sorted input array
        int[] nums = {2, 3, 5, 9, 14, 16, 18};

        // Target value for which we want to find the floor
        int target = 1;

        // Call the binarySearch method to get the floor
        int ans = binarySearch(nums, target);

        // Print the result
        System.out.println(ans);    
    }

    // Method to find the floor of a number in a sorted array
    // Floor: Greatest number <= target
    static int binarySearch(int[] nums, int target) {
        int ans = -1; // Initialize answer to -1 (if no floor exists)
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        // Binary search loop
        while (start <= end) {
            mid = start + (end - start) / 2;

            // If the mid element is exactly the target, return it as the floor
            if (nums[mid] == target) {
                return nums[mid];
            }
            // If mid element is greater than target, discard the right half
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            // If mid element is less than target, it's a possible floor
            // Save it and try to find a better (greater) floor
            else {
                ans = nums[mid];
                start = mid + 1;
            }
        }

        // Return the greatest number less than or equal to the target
        return ans;
    }
}
