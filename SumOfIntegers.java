public class SumOfIntegers {
    public static void main(String[] args) {
        int sum = 0;

        // Check if there are command line arguments
        if (args.length > 0) {
            // Iterate through each command line argument
            for (String arg : args) {
                try {
                    // Parse the argument as an integer
                    int num = Integer.parseInt(arg);
                    sum += num; // Add the number to the sum
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input: " + arg);
                }
            }

            System.out.println("Sum of the integers: " + sum);
        } else {
            System.out.println("No integers provided.");
        }
    }
}
