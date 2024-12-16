
import java.util.Scanner;

public class Assignment06{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1, input2;
        int num1 = 0, num2 = 0,num3, q = 0;
        int[] arr = new int[2];
        try {
            System.out.println("Enter the First integer (Num1):");
            input1 = scan.nextLine();
            System.out.println("Enter the Second integer (Num2):");
            input2 = scan.nextLine();
            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);
        } 
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception for Num1: Please enter a valid integer."+e);
        }

        try {
            System.out.println("Enter the First integer (Num3):");
            num1 = scan.nextInt();
            System.out.println("Enter the Second integer (Num4):");
            num2 = scan.nextInt();
            q = num1 / num2;
            System.out.println("The result of Num1 / Num2 is: " + q);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero."+e);
        }
        try {
            System.out.println("Enter the First integer (Num5):");
            num1 = scan.nextInt();
            System.out.println("Enter the Second integer (Num6):");
            num2= scan.nextInt();
            System.out.println("Enter the Second integer (Num6):");
            num3 = scan.nextInt();
            System.out.println("Accessing array element at index 2: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }
        scan.close(); 
    }
}
