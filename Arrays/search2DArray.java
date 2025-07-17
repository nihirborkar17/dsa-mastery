import java.util.Arrays;

public class search2DArray {
    public static void main(String[] args) {
        // Initialize a 2D array where each row can have a different number of columns (jagged array)
        int [][] arr = {
            {12, 3, 4, 5},
            {33, 4, 55, 32, 3},
            {33456, 67, 88896, 333}
        };

        // Set the target value to be searched in the 2D array
        int target = 33;

        // Call the search2d method and store the result in ans
        int[] ans = search2d(arr, target);

        // Print the result (row and column index) if found, else [-1, -1]
        System.out.println(Arrays.toString(ans));
    }

    // Method to search for the target in a 2D array
    static int[] search2d(int[][] arr, int target){
        // Traverse each row of the 2D array
        for(int i = 0; i < arr.length; i++){
            // Traverse each column in the current row
            for(int j = 0; j < arr[i].length; j++){
                // If the target is found, return its indices
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }

        // If the target is not found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
