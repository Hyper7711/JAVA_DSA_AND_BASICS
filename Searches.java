public class Searches {
    public static void main(String[] args){

        int arr[] = {1, 2, 3, 6, 8, 9};
        int key = 8;

        for(int i = 0;i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Match found at index = "+ i);
                break;
            }

        }
    }
}
