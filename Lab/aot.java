import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float height = scanner.nextFloat();

        float area = 0.5f * base * height;

        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);
        
        scanner.close();
    }
    
}
