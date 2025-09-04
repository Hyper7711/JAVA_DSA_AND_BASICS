import java.util.Scanner;

public class prime {
    public static void isprime(int n) {
     
        boolean check=true;


       for(int i=2;i<=n-1;i++){
        if(n%i==0){
            check=false;
            break;
        }
       }

        if(check == true){
            System.out.println("number is prime");

        }else{
             System.out.println("number is not prime");
        }

      
        
    }
      public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUM");
        int n = sc.nextInt();
        isprime(n);
        sc.close();
            
        }

}   

