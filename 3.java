import java.util.Scanner;

public class 3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers entered are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
 