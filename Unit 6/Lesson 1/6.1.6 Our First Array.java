public class FirstArray {
    public static void main(String[] args) {
        // Create the 3 arrays here
        String[] cities = { "Las Vegas", "Minsk", "Sao Paulo" };
        int[] population = { 667501, 2038822, 12330000 };
        double[] sunshine = { 8.11, 1.36, 6.05 };
        // Print all 3 arrays according to the output in the description
        System.out.println("Las Vegas's population is " + population[0] + ".");
        System.out.println("Minsk's population is " + population[1] + ".");
        System.out.println("Sao Paulo's population is " + population[2] + ".");
        System.out.println();
        System.out.println("The least amount of sunshine Las Vegas gets is " + sunshine[0] + " hours a day.");
        System.out.println("The least amount of sunshine Minsk gets is " + sunshine[1] + " hours a day.");
        System.out.println("The least amount of sunshine Sao Paulo gets is " + sunshine[2] + " hours a day.");

    }
}