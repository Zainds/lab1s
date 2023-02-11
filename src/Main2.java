import java.util.Scanner;

public class Main2 {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){

        double result, x, accuracy;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter argument"); x = in.nextInt();
        System.out.println("Enter accurecy"); accuracy = in.nextInt();
        result = 0;
        for (int i = 0; i < accuracy; i++){
            result += (Math.pow(-1, i) * Math.pow(x, i)) / factorial(i);
        }

        System.out.println(result);
        System.out.println(Math.pow(Math.E, -x));
    }
}
//