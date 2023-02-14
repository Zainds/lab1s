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
        System.out.println("Enter argument"); x = in.nextDouble();
        //System.out.println("Enter accurecy"); accuracy = in.nextDouble();
        result = 0;
        double current = 1;
        int i = 0;
        while (Math.abs(current) > 1e-15) {
            current = (Math.pow(-1, i) * Math.pow(x, i)) / factorial(i);
            result += current;
            i++;
        }
        System.out.println(result);
        System.out.println(Math.pow(Math.E, -x));

    }
}


/*
        }*/