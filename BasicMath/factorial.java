package BasicMath;

public class factorial {
    static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact*= i;
        }
        return fact;
    }
}
