import java.util.Scanner;

public class linear_search_using_Methods {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        basicLinearSearch();
        linearSearchNotFound(sc);
        linearSearchCount(sc);
        linearSearchUserArray(sc);

        sc.close();
    }


    // BASIC LINEAR SEARCH (FIXED ARRAY & KEY)

    static void basicLinearSearch() {

        int[] arr = {1, 2, 3, 6, 8, 9};
        int key = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Match found at index = " + i);
                break;
            }
        }
    }


    // VARIATION 1: ELEMENT NOT FOUND CASE
 
    static void linearSearchNotFound(Scanner sc) {

        int[] arr2 = {11, 22, 33, 44, 55, 66};

        System.out.print("\nEnter element to search: ");
        int key2 = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == key2) {
                System.out.println("Element found at index = " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No such element is present");
        }
    }


    // VARIATION 2: COUNT OCCURRENCES

    static void linearSearchCount(Scanner sc) {

        int[] arr4 = {77, 88, 99, 0, 12, 13, 14, 15};

        System.out.print("\nEnter element to count: ");
        int key3 = sc.nextInt();

        int count = 0;

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == key3) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element appears " + count + " times");
        }
    }


    // VARIATION 3: USER INPUT ARRAY SEARCH

    static void linearSearchUserArray(Scanner sc) {

        System.out.print("\nEnter size of array: ");
        int n = sc.nextInt();

        int[] arr5 = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr5[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key4 = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] == key4) {
                System.out.println("Element found at index = " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }   
}
