package employee;

public class QuickSort {

    // starts the quick sort on the whole array
    public static <T extends Comparable<T>> void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // recursive quick sort method
    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {

        // only sort if there are at least two elements
        if (low < high) {

            // find where the pivot ends up
            int pivotIndex = partition(array, low, high);

            // sort the left side of the pivot
            quickSort(array, low, pivotIndex - 1);

            // sort the right side of the pivot
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // this method moves elements around the pivot
    private static <T extends Comparable<T>> int partition(T[] array, int low, int high) {

        // choose the last element as the pivot
        T pivot = array[high];

        // index for smaller elements
        int i = low - 1;

        // go through the array
        for (int j = low; j < high; j++) {

            // if current element is smaller than or equal to pivot
            if (array[j].compareTo(pivot) <= 0) {

                i++;

                // swap elements
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // put pivot in the correct position
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the pivot index
        return i + 1;
    }
}