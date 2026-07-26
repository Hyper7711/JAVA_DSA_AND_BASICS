import java.util.*;

public class p3{

    // Declaring array

    // int array[] = new int[3];
    // int array2[] = {11,22,33,44,55};

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i = 0; i < size; i ++){
            num [i] = sc.nextInt();
        }

        for(int i  = 0; i < num.length; i ++){
            System.out.println(num [i] + " ");
        }

        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }

    }
}
