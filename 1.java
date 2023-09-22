public class 1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}

    
