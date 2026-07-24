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

        System.out.println("number of pos " + pos);
        System.out.println("number of neg " + neg);
        System.out.println("number is zero "+ zero);
}
}
