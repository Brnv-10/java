public class 2 {
    public static void main(String[] args) {
        if (args.length == 1) {
            int number = Integer.parseInt(args[0]);
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Please provide a single integer as input.");
        }
    }
    
}

