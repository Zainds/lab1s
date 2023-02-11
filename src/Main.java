import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a, b, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n (4-digit)"); n = in.nextInt();

        a = n / 1000;
        b = n / 100 % 10;
        c = n / 10 % 10;
        d = n % 10;
        if ((a == b && a == c) || (a == c && a == d) || (b == c && b == d) || (a == b && a == d)){
            System.out.println("3 цифры");
        }
        else {
            System.out.println("false");
        }







    }
}