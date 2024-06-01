package org.example;
// Define the class SearchingAlgorithm
public class SearchingAlgorithm {

    // Method to perform binary search on a sorted array of integers
    public boolean binarySearch(int[] arr, int target) {
        // Initialize low and high pointers
        int low = 0;
        int high = arr.length - 1;

        // Continue searching while the low pointer is less than or equal to the high pointer
        while (low <= high) {
            // Calculate the middle index
            int mid = low + (high - low) / 2;

            // If the target is found at the mid index, return true
            if (arr[mid] == target) {
                return true;
                // If the target is greater than the element at mid index, adjust the low pointer
            } else if (arr[mid] < target) {
                low = mid + 1;
                // If the target is less than the element at mid index, adjust the high pointer
            } else {
                high = mid - 1;
            }
        }

        // Return false if the target is not found in the array
        return false;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of SearchingAlgorithm
        SearchingAlgorithm searchAlg = new SearchingAlgorithm();

        // Unsorted array of integers
        int[] nums = {34, 20, 14, 50, 24, -1, 4, 95, 30, 55};

        // Sort the array using Java's built-in sort method
        java.util.Arrays.sort(nums);

        // Perform binary search to find if 20 is in the sorted array
        boolean found = searchAlg.binarySearch(nums, 20);

        // Print the sorted array (for verification)
        System.out.println("Sorted array: " + java.util.Arrays.toString(nums));

        // Print the result of the search
        System.out.println("Is 20 in the list? " + found);
    }

    int[][] edges = {
            {0, 1}, {0, 2}, {0, 3}, {0, 4},
            {1, 3}, {1, 4},
            {2, 3}, {2, 5},
            {3, 4}, {3, 5},
            {4, 5}
    };


    int[][] adjacencyMatrix = {
            {0, 1, 1, 1, 1, 0}, // Connections for node 0
            {1, 0, 0, 1, 1, 0}, // Connections for node 1
            {1, 0, 0, 1, 0, 1}, // Connections for node 2
            {1, 1, 1, 0, 1, 1}, // Connections for node 3
            {1, 1, 0, 1, 0, 1}, // Connections for node 4
            {0, 0, 1, 1, 1, 0}  // Connections for node 5
    };





}
