package employee;

public class SelectionSort {

    /**
     * Sorts an array of objects using the Selection Sort algorithm.
     */
    public static <T extends Comparable<T>> void sort(T[] array) {
        int n = array.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Check if current element is smaller compared to the rest of the elements
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Manually compare objects using the compareTo implementation
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}