package DEVOPS_LAB_2;

import java.util.Scanner;

public class Subtract {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sub = a - b;

        System.out.println("Subtraction of " + a + " & " + b + " is: " + sub);

        sc.close(); 
    }
}
