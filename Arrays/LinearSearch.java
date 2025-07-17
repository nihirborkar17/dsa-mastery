class LinearSearch {
    public static void main(String[] args) {
        // Initialize the array to search in
        int[] arr = { 2, 22, 3, 11, 3, 1, 331, 23, 14 };

        // Set the target element to search for
        int target = 14;
        
        // Call the checkTarget method to determine if the target exists in the array
        boolean ans = checkTarget(arr, target);

        // Print the result based on the method's return value
        if(ans){
            System.out.println("Target exist in the array.");
        }else{
            System.out.println("Target does not exist in the array.");
        }
    }

    // Method to perform linear search in the array
    public static boolean checkTarget(int[] nums, int target){
        // Iterate through each element in the array
        for (int i : nums) {
            // If the current element matches the target, return true
            if (target == i) {
                return true;
            }
        }
        // If target is not found in the entire array, return false
        return false;
    }
}
