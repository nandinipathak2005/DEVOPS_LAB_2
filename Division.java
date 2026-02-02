package assgn;
import java.util.*;

public class Division 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int div = a / b;
        System.out.println("The division is: " + div);
    }
}

