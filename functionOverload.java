 //question 11

public class functionOverload{
    public static void main(String[] args) {
       functionOverload example = new functionOverload();

        // Call the overloaded add() method with different argument types
        example.add(5, 10);
        example.add(3.14, 2.5);
        example.add(10, 5.5f);
        example.add(6.7f, 8);
    }

    // Overloaded add() method with different parameter types
    public void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Adding two doubles: " + (a + b));
    }

    public void add(int a, float b) {
        System.out.println("Adding an integer and a float: " + (a + b));
    }

    public void add(float a, int b) {
        System.out.println("Adding a float and an integer: " + (a + b));
    }
}
