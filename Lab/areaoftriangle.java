import java.util.Scanner;

class Triangle {
    public float calculateArea(float base, float height) {
        return (base * height) / 2;
    }
}

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float height = scanner.nextFloat();

       
        Triangle triangle = new Triangle();

        
        float area = triangle.calculateArea(base, height);

        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);

        scanner.close();
    }
}