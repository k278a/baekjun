package math;

import java.util.Scanner;

public class Main{
    public static double division(int a, int b){
        return (double) a/b;
    }

    public static void main(String[] args){
        double answer = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        answer = division(a,b);
        System.out.print(answer);
    }

}