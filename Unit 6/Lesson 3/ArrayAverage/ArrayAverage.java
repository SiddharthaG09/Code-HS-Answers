public class ArrayAverage {
    private int[] values;

    double average = 0;

    public ArrayAverage(int[] theValues) {
        values = theValues;
    }

    public double getAverage() {
        // your code goes here!

        for (int value : values) {
            average += value;
        }

        return average / values.length;
    }

    public String toString() {
        return "The average of the array is " + getAverage();
    }
}