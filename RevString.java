public class RevString {
    public String rev(String str){
        //getting length of the string
        int n = str.length();

        //converting the string into a char array
        char[] arr = str.toCharArray();

        //iterating till mid element ans swaping with corresponding element from end
        for (int i = 0; i < n/2; i++) {
            swap(arr, i , n-i-1);
        }

        //converting char array to string
        String ans = new String(arr);
        return ans;
    }
    //creating the swap function
    public void swap(char[] arr, int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
