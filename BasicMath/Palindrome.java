package BasicMath;

public class Palindrome {

    static int rev(int n){
        int rem, rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;
    }

    static boolean palindromeCheck(int n){
        if(rev(n)==n)return true;
        return false;
    }
}
