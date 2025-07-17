public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Ascending sorted array
        int[] arrA = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 17, 18, 22, 45, 89};
        int targetA = 16;

        // Descending sorted array
        int[] arrB = {99, 88, 76, 65, 54, 43, 32, 21, 10, 5, 2};
        int targetB = 65;

        // Perform order-agnostic binary search on ascending array
        int ascendingResult = binarySearch(arrA, targetA);
        System.out.println("Index of " + targetA + " in ascending array: " + ascendingResult);

        // Perform order-agnostic binary search on descending array
        int descendingResult = binarySearch(arrB, targetB);
        System.out.println("Index of " + targetB + " in descending array: " + descendingResult);
    }

    // Order-Agnostic Binary Search implementation
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        // Check if the array is sorted in ascending or descending order
        if (arr[start] < arr[end]) {
            // Ascending order binary search
            while (start <= end) {
                mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else {
            // Descending order binary search
            while (start <= end) {
                mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
