package DEVOPS_LAB_2;

public class Addition {
    class Add {
    public int add(int a, int b) {
        return a + b;
    }
}
    public static void main(String[] args) {
        Addition main = new Addition();
        Add adder = main.new Add();
        int sum = adder.add(5, 7);
        System.out.println("The sum is: " + sum);
    }
}