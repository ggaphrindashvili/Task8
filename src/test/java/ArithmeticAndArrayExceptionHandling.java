import java.util.Scanner;

public class ArithmeticAndArrayExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {5, 10, 15, 20 , 25};

        try {
            System.out.print("Enter an index: ");
            int index = scanner.nextInt();
            System.out.println("Array element: " + array[index]);
             int fixedNumber = 100;
            int result = fixedNumber / index;
            System.out.println("Division result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            scanner.close();

        }
    }
}