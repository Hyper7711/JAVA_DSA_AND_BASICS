class Main{
    public static void main(String[] args){

        char[] array = new char[4];  // Array with syntax

        // Assign values into array 

        array[0] = 'j';
        array[1] = 'a';
        array[2] = 'v';
        array[3] = 'a';
        
        for(int i = 0;i < array.length; i++){
            System.out.println(array[i]);


        }

        // Assign + creating the array at a time 
        
        int[] num = {1, 2, 3, 4};

         for(int i = 0;i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}