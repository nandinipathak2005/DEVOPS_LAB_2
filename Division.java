// Contribution by Sneha - UIT2023843
public class Division {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        // Checking if b is zero to avoid an error
        if (b != 0) {
            int result = a / b;
            System.out.println("The result of division is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}