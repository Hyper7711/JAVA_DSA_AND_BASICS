import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {

        // initialize array
        
        int arr[] = {2, 4, 6, 8, 10, 12};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // initialize varaibles
        int low = 0;
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

        if(!found){
            System.out.println("Element not found");
        }

        sc.close();
    }
}

