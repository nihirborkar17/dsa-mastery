public class Q1_CeilingOfANumber {

    public static void main(String[] args) {
        // Sorted array
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        // Target number to find the ceiling for
        int target = 9;

        // Function call to find the smallest number >= target
        int num = smallestNumberGreaterThanTarget(arr, target);

        // Output the result
        System.out.println("Number is " + num + ".");
    }

    // Function to find the ceiling: smallest number >= target
    static int smallestNumberGreaterThanTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        // Variable to store the potential ceiling number
        int number = Integer.MIN_VALUE;

        // Binary search loop
        while (start <= end) {
            mid = start + (end - start) / 2;

            // If target is found, it is the ceiling itself
            if (arr[mid] == target) {
                number = arr[mid];
                return number;
            }
            // If mid element is greater than or equal to target,
            // it's a potential ceiling. Move to left half to find a smaller valid number.
            else if (arr[mid] >= target) {
                number = arr[mid];
                end = mid - 1;
            }
            // If mid element is less than target, ignore left half
            else {
                start = mid + 1;
            }
        }

        // Return the smallest number greater than or equal to target,
        // or Integer.MIN_VALUE if not found (e.g., target > all elements)
        return number;
    }
}
