import java.util.Scanner;

public class InputJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        System.out.println("Gender male ??:  ");
        boolean ismale = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Your Gender is male ??: " + ismale);

        sc.close();

    }
    
}
