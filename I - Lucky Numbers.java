import java.util.*;
 
public class Main {
    public static boolean check (int a, int b){
        if (a == b) {
            return true;
        }
        else if (a > b){
            try{
            if (a % b == 0) return true;
            } 
            catch (Exception e){
                return true;
            }
        } 
        else if (b > a) {
            try {
            if (b % a == 0) return true;
            } 
            catch (Exception e) {
              return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int a = Integer.parseInt(String.valueOf(num.charAt(0)));
        int b = Integer.parseInt(String.valueOf(num.charAt(1)));
        
        if (check(a,b)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
