package BasicMath;

public class PalindromeString {


    static boolean palindromeCheck(String str){
        if(revStr(str).equals(str))return true;
        return false;
    }

    static String revStr(String str){
        String rev = "";

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length()/2; i++) {
            swap(arr, i, str.length()-i-1);
        }

        rev = new String(arr);

        return rev;
    }
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
