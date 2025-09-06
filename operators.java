import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("+++++ Arthematic +++++" );
        System.out.println("( a + b ) = " + (a + b));
        System.out.println("( a - b ) = " + (a - b));
        System.out.println("( a * b ) = " + (a * b));
        System.out.println("( a / b ) = " + (a / b));
        System.out.println("( a % b ) = " + (a % b));



    }
}