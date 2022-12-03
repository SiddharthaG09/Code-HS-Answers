public class Fibonacci {
    public static void main(String[] args) {

        // number of elements to generate in the sequence
        int max = 15;

        // create the array to hold the sequence of Fibonacci numbers
        int sequence[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 };
        // create the first 2 Fibonacci sequence elements
        sequence[0] = 0;
        sequence[1] = 1;

        // create the Fibonacci sequence and store it in int[] sequence

        // print the Fibonacci sequence numbers
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }

        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));

    }

    // This method returns the element that comes after element 'toFind'
    public static int findNextElement(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return arr[i + 1];
            }
        }
        return -1;

    }
}