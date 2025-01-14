import java.util.Scanner;

class SimpleInterest {
    public float calculateSimpleInterest(float principal, float rate, float time) {
        return (principal * rate * time) / 100;
    }
}

public class simpleintrestcalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the rate of interest: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the time period (in years): ");
        float time = scanner.nextFloat();

        SimpleInterest simpleInterest = new SimpleInterest();

        float simpleInterestAmount = simpleInterest.calculateSimpleInterest(principal, rate, time);

        System.out.println("The simple interest amount for principal amount " + principal + ", rate of interest " + rate
                + ", and time period " + time + " years is " + simpleInterestAmount);

        scanner.close();
    }
}