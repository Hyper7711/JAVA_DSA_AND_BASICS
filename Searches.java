import java.util.Scanner;

public class Searches {
    public static void main(String[] args){

        // Linear search

        int arr[] = {1, 2, 3, 6, 8, 9};
        int key = 8;

        for(int i = 0;i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Match found at index = "+ i);
                break;
            }
        }

        // Linear search variation - 1 :

        int ARR2[] = {11, 22, 33, 44, 55, 66};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required element - ");
        int key2 = sc.nextInt();

        boolean found = false;


        for(int i = 0; i < ARR2.length; i++){
            if(ARR2[i] == key2){
                System.out.println("Element found at index = " + i);
            found = true;
            break;
            }
        }

        if(found == false){
            System.out.println("NO such element is present");
        }

        sc.close();


        // Linear search variation - 2 :

        int ARR3 [] = {77, 88, 99, 00, 12, 13, 14, 15};

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Element to count - ");
        int key3 = sc2.nextInt();

        int count = 0;

        for(int i = 0; i < ARR3.length; i++){
            if(ARR3[i] == key3){
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element appears" + count + "times");
        }

        sc2.close();

        // linear variation - 3 :

        Scanner sc3 = new Scanner(System.in);

        
        System.out.println("Enter size of array");
        int n = sc3.nextInt();

        int ARR4[] = new int[n];

        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            ARR4[i] = sc3.nextInt();
        }

        System.out.println("Enter element to search");
        int key4 = sc3.nextInt();

        boolean found2 = false;

        for(int i = 0;i < ARR4.length; i++){
            if(ARR4[i] == key4){
                System.out.println("Element found at - " + i);
                found2 = true;
                break;
            }
        }

        if(found2 == false){
            System.out.println("Element not found");
        }

        sc3.close();

    }
}
