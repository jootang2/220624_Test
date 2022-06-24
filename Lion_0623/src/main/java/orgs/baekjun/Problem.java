package orgs.baekjun;
import java.util.Scanner;

public class Problem {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result;
        int X = N % 5;


        if (X % 3 == 0) {
            result = N / 5 + X / 3;
        } else {
            result = -1;
        }

        System.out.println(result);
    }
}
