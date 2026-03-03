import java.util.Scanner;

public class Pattern {

    // Square Pattern
    public static void square(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pyramid Pattern
    public static void Pyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void Butterfly(int n){
        // Upper part
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Main Method (Menu Driven)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Pattern:");
        System.out.println("1. Square");
        System.out.println("2. Pyramid");
        System.out.println("3. Butterfly");

        int choice = sc.nextInt();

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        switch(choice){
            case 1:
                square(n);
                break;
            case 2:
                Pyramid(n);
                break;
            case 3:
                Butterfly(n);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
