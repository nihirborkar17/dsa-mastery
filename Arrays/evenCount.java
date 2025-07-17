// Try Solving : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// Question ask to implement a solution that can figure out count of number with even digits.

public class evenCount {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        
        System.out.println(findNumbers(nums));
        System.out.println(findNumberFormula(nums));
    }

    // Implementation 1: This implementation use function "findNumbers()" to count total even digit numbers 
    // + uses a function "even()" to find out even digit number in the array. 
    
    static int findNumbers(int[] nums){
        int count =0;

        for(int i : nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int number){
        int count = 0;
        while(number != 0){
            count++;
            number /= 10;
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }

    // Implementation 2: This implementation use function "findNumberFormula()" to find the count directly using Math.log10() function.

    static int findNumberFormula(int[] nums){
        int count = 0;

        for(int i : nums){
            int ele = (int)(Math.log10(i)) + 1;
            if(ele %2 == 0){
                count++;
            }
        }
        return count;
    }
}
