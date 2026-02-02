public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 2};
        int n = arr.length;

        for (int pass = 0; pass < n - 1; pass++) {

            for (int i = 0; i < n - 1 - pass; i++) {

                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // print the array 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

