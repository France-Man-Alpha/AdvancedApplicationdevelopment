import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("👋 Welcome to the Simple Java App!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hi " + name + "! Let's do a simple calculation.");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}

