public class RevArray {
    static void rev(int[] arr){
        for (int k = 0; k < arr.length/2; k++) {
            swap(arr, k , arr.length-k-1);
        }
    }
    static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
