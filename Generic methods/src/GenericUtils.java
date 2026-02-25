/**
 * Utility class containing generic helper methods.
 */
public class GenericUtils {

    /**
     * Reverses the given array in-place.
     * No new array is created.
     *
     * @param <T>   the type of the array elements
     * @param array the array to reverse
     */
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // swap elements
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    /**
     * Calculates the sum of all elements in a numeric array.
     * Only subclasses of java.lang.Number are allowed.
     *
     * @param <T>   type extending Number
     * @param array array of numeric values
     * @return sum of all values as double
     */
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;

        for (T element : array) {
            total += element.doubleValue();
        }

        return total;
    }
}
