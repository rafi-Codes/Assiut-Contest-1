import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();
       
 
        long product = n * k;
 
        if (product % a != 0) {
            System.out.println("double");
        } else {
            long result = product / a;
            if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
                System.out.println("int");
            } else {
                System.out.println("long long");
            }
        }
         sc.close();
    }
}
