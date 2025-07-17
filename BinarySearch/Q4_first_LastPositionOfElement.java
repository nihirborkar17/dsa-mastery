public class Q4_first_LastPositionOfElement {
    public static void main(String[] args) {
        // Sorted array with duplicate elements
        int[] nums = {5, 7, 7, 8, 8, 10};
        
        // Target value to find the first and last occurrence
        int target = 8;

        // Call the searchRange method to get the result
        int[] ans = searchRange(nums, target);

        // Print the result as space-separated indices
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    // Function to find the first and last occurrence of a target in a sorted array
    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        // Initialize left and right positions as -1 (not found)
        int left = -1;
        int right = -1;

        // First pass: Find the first occurrence (left boundary)
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                left = mid;       // Update left index
                end = mid - 1;    // Continue searching left half
            } else if (nums[mid] < target) {
                start = mid + 1;  // Search in the right half
            } else {
                end = mid - 1;    // Search in the left half
            }
        }

        // Reset search bounds for second pass
        start = 0;
        end = nums.length - 1;

        // Second pass: Find the last occurrence (right boundary)
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                right = mid;      // Update right index
                start = mid + 1;  // Continue searching right half
            } else if (nums[mid] < target) {
                start = mid + 1;  // Move right
            } else {
                end = mid - 1;    // Move left
            }
        }

        // Return the range as an array
        return new int[] {left, right};
    }
}
