import java.util.*;

public class SumOfNaturalNumbers {

    public static int NumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = NumberSum(n);
        System.out.println(ans);
    }

}
