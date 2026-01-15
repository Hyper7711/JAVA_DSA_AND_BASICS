// Array problems :
// Q.1] intergers = [1, 2, 3, 4], print the sum of intergers.
// Q.2] given arrays - int[] a = {1, 2, 3, 4}; and int[] b = {5, 6, 7, 8};
// create 3rd array such that : third[i] = first[i] + second[n - 1 - i]


// Q.1]

public class Test {
    public static void main(String[] args) {

        // Q.1] 

        int arr[] = {1, 2, 3, 4}; 
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);

        // Q.2]

        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8};

        int c[] = new int[a.length];

        for(int i = 0; i < a.length; i++){
        c[i] = a[i] + b [a.length - 1 - i];
        }

        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
    }
}

