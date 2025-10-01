import java.util.*;
 
public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long result = 0;
        if (n == 0 || n == 1) {
            System.out.println(n);
        } else {
          long mini = Math.min(n,Math.min(m,k));
          n -= mini;
          m -= mini;
          k -= mini;
          if (n == 0 || k == 0){
            System.out.println(mini);
            return;
          } 
          else {
            if ((n/2) > k){
                mini += k;
                System.out.println(mini);
                return;
            } else {
                mini += (n/2);
                System.out.println(mini);
                return;
            }
          }
        }
        sc.close();
    }
}
