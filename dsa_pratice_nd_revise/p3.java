import java.util.*;

public class p3{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input 

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output

        for(int i = 0;i < numbers.length; i++){
            if( x >= 0 && x < numbers.length){
                System.out.print("Value at index " + x + " = " + numbers[x]);
            }else{
                System.out.print("Invalid input");
            }
        }
    }
}
