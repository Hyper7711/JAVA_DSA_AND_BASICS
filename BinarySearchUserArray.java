import java.util.Scanner;

public class BinarySearchUserArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Array elements (sorted)
        System.out.println("Enter array elements in SORTED order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 4: Binary search variables
        // int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        
        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index = " + mid);
                found = true;
                break;
            }
            else if (key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        // Step 6: Not found case
        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
