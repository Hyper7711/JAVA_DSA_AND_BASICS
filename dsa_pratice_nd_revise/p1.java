class p1 {

    public static void maxrem(int n){

    

        int num =0;
        int max = 0;


        for(int i=1;i*i<=n;i++){

            int rem = n%i;

            if(rem>max){
                max=rem;
                num=i;
            }
                i++;
            
        }

        System.out.println(num);
        System.out.println(max);
     

    } 


    public static void main(String args[]){
        int n=87;
        maxrem(n);
    }
    
}
