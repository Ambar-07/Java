import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //integer value 
        System.out.print("Enter the integer value :");
        int a = input.nextInt();

        //float value
        System.out.print("Enter the float value :");
        float c = input.nextFloat();

        //character 
        System.out.print("Enter the character :");
        char b = input.next().charAt(1); 
        
        System.out.println("integer value is :" +a);
        System.out.println("float value is :" +c);
        System.out.println("the given character is :" +b);

    }
}
