import java.util.Scanner;
 
public class codeforces{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dis = sc.nextInt();
        double price = sc.nextInt();
 
        double beforePrice = (price / (1 - (dis/100)));
        System.out.printf("%.2f", beforePrice);
        sc.close();
    }
}
