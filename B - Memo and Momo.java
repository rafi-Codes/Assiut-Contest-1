import java.util.Scanner;
 
public class codeforces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
 
        if (a % k == 0 && b % k == 0){
            System.out.println("Both");
        } else  if (a % k == 0){
            System.out.println("Memo");
        } else  if (b % k == 0){
            System.out.println("Momo");
        } else {
            System.out.println("No One");
        }
        sc.close();
    }
}
