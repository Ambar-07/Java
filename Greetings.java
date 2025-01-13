import java.util.Scanner;
public class Greetings {
    public static void main (String[]args){
    Scanner Userinput = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = Userinput.nextLine();
    System.out.println("Hello " + name + ", Welcome");
    Userinput.close();
    
}
}