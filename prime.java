public class prime {
    public static void isprime(int n) {
     
        boolean check=true;


       for(int i=2;i*i<=n;i++ ){
        if(n%i==0){
            check=false;
            break;
        }
       }

        if(check==true){
            System.out.println("number is prime");

        }else{
             System.out.println("number is not prime");
        }

        
    }
}   

