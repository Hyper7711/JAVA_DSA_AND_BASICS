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

    // Hollow Square
    public static void HollowSquare(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted Triangle
    public static void InvertedTriangle(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
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

    // Inverted Half Pyramid (Rotated 180 Degrees)
    public static void InvertedHalfPyramid180(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid with Numbers
    public static void InvertedHalfPyramidNumbers(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Floyd's Triangle
    public static void FloydTriangle(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // 0-1 Triangle
    public static void ZeroOneTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
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
        System.out.println("4. Inverted Triangle");
        System.out.println("5. Hollow Square");
        System.out.println("6. Inverted Half Pyramid (180 Degree)");
        System.out.println("7. Inverted Half Pyramid with Numbers");
        System.out.println("8. Floyd's Triangle");
        System.out.println("9. 0-1 Triangle");

        int choice = sc.nextInt();

        System.out.print("Enter a number: ");
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
            case 4:
                InvertedTriangle(n);
                break;
            case 5:
                HollowSquare(n);
                break;
            case 6:
                InvertedHalfPyramid180(n);
                break;
            case 7:
                InvertedHalfPyramidNumbers(n);
                break;
            case 8:
                FloydTriangle(n);
                break;
            case 9:
                ZeroOneTriangle(n);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}