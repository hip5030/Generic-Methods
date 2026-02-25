public class Test {

    public static void main(String[] args) {

        // ---- Test reverse with Integer array ----
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original Integer array:");
        printArray(numbers);

        GenericUtils.reverse(numbers);

        System.out.println("Reversed Integer array:");
        printArray(numbers);

        // ---- Test reverse with String array ----
        String[] words = {"Hello", "World", "Java"};

        System.out.println("\nOriginal String array:");
        printArray(words);

        GenericUtils.reverse(words);

        System.out.println("Reversed String array:");
        printArray(words);

        // ---- Test sum method ----
        Double[] decimals = {1.5, 2.5, 3.0};
        double result = GenericUtils.sum(decimals);

        System.out.println("\nSum of Double array: " + result);

        Integer[] moreNumbers = {10, 20, 30};
        System.out.println("Sum of Integer array: " + GenericUtils.sum(moreNumbers));
    }

    /**
     * Helper method to print arrays.
     */
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
