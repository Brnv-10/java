public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        int decimal = 10; // The decimal number to convert
        
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("The binary representation of " + decimal + " is: " + binary);
    }
}

