import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Enter the first number: ");
                float num1 = Float.parseFloat(input.nextLine());

                System.out.print("Enter the second number: ");
                float num2 = Float.parseFloat(input.nextLine());


                System.out.println("Select an operation: +, -, *, /");
                String operation = input.nextLine();

                switch (operation) {
                    case "+":
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case "-":
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case "*":
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Cannot divide by zero!");
                        }
                        System.out.println("Result: " + (num1 / num2));
                        break;
                    default:
                        System.out.println("Invalid operation.");
                        break;
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a numeric value (float or int).");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        input.close();
    }
}
