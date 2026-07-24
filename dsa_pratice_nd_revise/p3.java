import java.util.Scanner;

public class p3{

public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);

    int pos = 0;
    int neg = 0;
    int zero = 0;
    char ch;
    
    do{

        int num = sc.nextInt();

        if(num > 0){
            pos++;
        }
        else if (num < 0){
            neg++;
        }else{
            zero++;
        }

        System.out.println("continue ? ");
        ch = sc.next().charAt(0);    //imp line 

    }while(ch == 'y' );

<<<<<<< HEAD
        System.out.println("number of pos " + pos);
        System.out.println("number of neg " + neg);
        System.out.println("number is zero "+ zero);
}
}
=======
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
>>>>>>> 49c6222f08092887a103fefe4e54d0e2a6e658df
