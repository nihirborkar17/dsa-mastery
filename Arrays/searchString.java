import java.util.Arrays;

public class searchString {
    public static void main(String[] args) {
        // Define a string to search within
        String name = "chris";

        // Define the target character to search for
        char target = 'h';

        // Call the searchElement method to check if target exists in the string
        if(searchElement(name, target)){
            System.out.println("Target is present in the String.");
            
            // Print the string as a character array for visualization
            System.out.println(Arrays.toString(name.toCharArray()));
        } else {
            System.out.println("Target is not present in the String.");
        }
    }

    // Method to search for a character in a given string
    static boolean searchElement(String str, char target){
        // Convert the string to a character array and iterate over it
        for(char c : str.toCharArray()){
            // If any character matches the target, return true
            if(c == target){
                return true;
            }
        }
        // If target character is not found, return false
        return false;
    }
}
