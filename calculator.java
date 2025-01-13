import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //first number
        System.out.print("Enter the first number :");
        float a = input.nextFloat();

        //second number
        System.out.print("Enter the second number :");
        float b = input.nextFloat();

        //operation
        //System.out.print("Enter the operation :");
        float sum = a+b;
        float diff = a-b;
        float mul = a*b;
        float div = a/b;


        System.out.println("the sum of the given number is :"+sum);
        System.out.println("the difference of the given number is :"+diff);
        System.out.println("the multiplication of the given number is :"+mul);
        System.out.println("the division of the given number is :"+div);

        input.close();
        }
}
