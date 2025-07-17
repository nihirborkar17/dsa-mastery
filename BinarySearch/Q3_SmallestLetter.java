public class Q3_SmallestLetter {
    public static void main(String[] args) {
        // Sorted array of characters
        char[] letters = {'c', 'f', 'j'};
        
        // Target character
        char target = 'a';

        // Call the function to find the smallest letter greater than target
        char ans = nextGreatestLetter(letters, target);
        
        // Print the result
        System.out.println(ans);
    }

    // Function to find the smallest letter in the array that is strictly greater than the target
    // The array is considered circular (wrap-around behavior)
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;

        // Standard binary search
        while (start <= end) {
            mid = start + (end - start) / 2;

            // If current letter is greater than target, it might be the answer; search left half
            if (letters[mid] > target) {
                end = mid - 1;
            } 
            // If letter is less than or equal to target, discard left half
            else {
                start = mid + 1;
            }
        }

        // Modulo operator handles wrap-around case:
        // If target >= all elements, we return letters[0]
        return letters[start % letters.length];
    }
}
