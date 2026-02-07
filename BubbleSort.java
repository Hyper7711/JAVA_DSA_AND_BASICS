import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the size of array :- " );
        int[] arr = new int[n];

        System.out.println("Enter the elements of array :- ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int pass = 0; pass < n-1; pass++){

            for(int i = 0; i < n - 1 - pass;i++){

                if(arr[i] > arr[i + 1]){

                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // print array 
        for(int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }

    sc.close();
    
    }
}


