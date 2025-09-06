import java.util.Scanner;

public class operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("\n+++++ Arthematic +++++" );
        System.out.println("( a + b ) = " + (a + b));
        System.out.println("( a - b ) = " + (a - b));
        System.out.println("( a * b ) = " + (a * b));
        System.out.println("( a / b ) = " + (a / b));
        System.out.println("( a % b ) = " + (a % b));

        System.out.println("\n+++++ Relational +++++");
        System.out.println("a == b? " +  (a == b));
        System.out.println("a != b? " +  (a != b));
        System.out.println("a > b?  " +  (a > b));
        System.out.println("a < b? " +  (a < b));
        System.out.println("a >= b " +  (a >= b));
        System.out.println("a <= b " +  (a <= b));

        System.out.println("\n+++++ Logical +++++");
        boolean cond1 = (a > 0);
        boolean cond2 = (a > 0);
        System.out.println("Both positive" + (cond1 && cond2));
        System.out.println("At one positive? " + (cond1 || cond2));
        System.out.println("a is not positive? " + (!cond1));

        System.out.println("\n+++++ Assignment +++++");
        int x = a;
        x += b;
        System.out.println("x += b" + x);
        x -= b;
        System.out.println("x -= b" + x);

        System.out.println("\n+++++ Unary +++++");
        int y = a;
        System.out.println("y++ " + (y++));
        System.out.println("After y++, y = " +  y);
        System.out.println("++y = " + (++y));

        sc.close();

    }
}