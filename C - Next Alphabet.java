import java.util.Scanner;
 
public class codeforces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'z'){
           System.out.println("a");   
        } 
        else  System.out.println(++ch);
        sc.close();
    }
}
