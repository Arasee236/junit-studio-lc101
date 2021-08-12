package main;

public class BonusBinarySearch {
//    public static void main(String[] args)
//    {
//        int intArray[] = {3,5,7,9,17};
//        int result = binarySearch(intArray,5);
//        System.out.println(result);
//
//    }

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;
        while (right >= left) {
            int mid = left + ((right - left) / 2);
            if (sortedNumbers[mid] > n) {
                right = mid;
            } else if (sortedNumbers[mid] < n) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}


