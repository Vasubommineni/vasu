public class HelloWorld {
    public static void main(String[] args) {
        // Print Hello, World!
        System.out.println("Hello, World!");

        // Add two numbers and print the result
        int num1 = 5;
        int num2 = 10;
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}