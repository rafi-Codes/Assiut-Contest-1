import java.util.*;
 
public class codeforces {
    public static boolean isValid (int l, int r){
        return ((l == r || Math.abs(l - r) == 1) && (l != 0 || r != 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        
        if (isValid(l,r)) System.out.println("YES");
        else System.out.println("NO");
 
        sc.close();
    }
}
