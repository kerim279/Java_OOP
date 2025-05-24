import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Type 'Calculator' or 'Converter':");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("calculator")){
            Calculator(scanner);
        } else if (choice.equals("converter")) {
            Converter(scanner);
        }
    }

    private static void Calculator(Scanner scanner) {
        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        System.out.println("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        int result = calculations(a, b, operation);
        System.out.println("Result: " + result);
    }

    private static int calculations(int a, int b, char operation) {
        switch (operation){
            case '+' :
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (a == 0){
                    throw new ArithmeticException("Division by zero!");
                } else if (b == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        }
    private static int convertions(int a){
        return (a - 32) * 5/9;
    }

    private static void Converter(Scanner scanner){
        System.out.println("Convert Fahrenheit to Celsius:");
        int a = scanner.nextInt();
        int result = convertions(a);
        System.out.println("F° = " + result + " C°");
    }
}

