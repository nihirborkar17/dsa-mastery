public class BinarySearchAlgo {

    public static void main(String[] args) {
        // Sorted array to perform binary search on
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 17, 18, 22, 45, 89};

        // Target element to find in the array
        int target = 15;

        // Call binarySearch method and store the result
        int ans = binarySearch(arr, target);

        // Print the index of the target if found, else -1
        System.out.println(ans);
    }

    // Method to perform binary search on a sorted array
    static int binarySearch(int[] arr, int target){

        int start = 0; // starting index
        int end = arr.length - 1; // ending index
        int mid = 0; // middle index (will be updated inside the loop)

        // Loop until the search space is valid
        while(start <= end){
            // Calculate mid to avoid overflow
            mid = start + (end - start) / 2;

            // If target is found at mid, return the index
            if(arr[mid] == target){
                return mid;
            }
            // If target is smaller, discard the right half
            else if(arr[mid] > target){
                end = mid - 1;
            }
            // If target is greater, discard the left half
            else{
                start = mid + 1;
            }
        }

        // If target not found, return -1
        return -1;
    }
}
