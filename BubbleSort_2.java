public class BubbleSort_2 {

    static void BubbleSort(int arr[]){
        
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }

    static void SelectionSort(int arr[]){
        int l=arr.length;
        print(arr);
        System.out.println();
        for(int i = 0; i<l-1;i++){
            int minIndex = i;
            for(int j = i+1 ; j<l;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

            print(arr);
            System.out.println();
        }
    }

    

    static void print(int arr[]){
            
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,2};

        SelectionSort(arr);
        print(arr);
        
       
    }
    
}
