package math;

import java.util.Scanner;
public class Main{
    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);

        int a  = scanner.nextInt();
        int b  = scanner.nextInt();
        answer = sum(a,b);
        System.out.print(answer);

    }
}
