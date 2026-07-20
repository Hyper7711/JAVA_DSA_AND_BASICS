import java.util.*;

public class p3 {
    
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;


        inverted half pyramid(rotate180 degree)- 

        for (int i = 1; i <= n; i++){

            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        inverted half pyramid with numbers

        for(int i = 1; i <= n; i ++){

            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        Floyd's triangle - 

        for(int i = 1; i <= n ; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num = num + 1;
            }
            System.out.println();
        }

        0-1 Triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= i; j++){
                int sum = i + j;

                if(sum % 2 == 0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    sc.close();
    }
}
