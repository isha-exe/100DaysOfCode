package BasicMath;

public class TrailingZero {
    //to find number of zeroes at the end, we need to find number of (2,5) pairs
    // and beacuse mostly number of 2's is greater than number of 5's ,
    // we find total number of 5 in the number

    static int totalNoOf5(int n){
        //code to calculate total number of 5 in the end
        int ans = 0;
        for (int i = 5; i <=n; i=i*5){
            ans += n/i;
        }
        return ans; //this is also the required answer
    }
}
