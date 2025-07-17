public class Leetcode_1672_RichestCustomerWealth {

    public static void main(String[] args) {
        // Each row represents a customer, and each column is their account balance in different banks
        int[][] accounts = {{1,2,3},{3,2,1}};

        // Output the maximum wealth among all customers
        System.out.println(maximumWealth(accounts));
    }

    // Method to calculate the maximum wealth (richest customer)
    static int maximumWealth(int[][] accounts){
        // Initialize max to the smallest possible integer value
        int max = Integer.MIN_VALUE;

        // Traverse each customer (each row in 2D array)
        for(int i = 0; i< accounts.length; i++){
            int currSum = 0; // Holds the current customer's total wealth

            // Traverse each account of the current customer
            for(int j = 0; j < accounts[i].length; j++){
                currSum += accounts[i][j]; // Sum the balances
            }

            // Update max if current customer's wealth is greater
            max = Math.max(max, currSum);
        }

        // Return the wealth of the richest customer
        return max;
    } 
}
