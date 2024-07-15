package math;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        String b0 = b + "";

        String[] B = b0.split("");

        int[] answer = new int[B.length];
        for(int i = 0; i <B.length; i++){
            String B0 = B[B.length-1-i];
            int B1 = Integer.parseInt(B0);

            answer[i] = a * B1;
            System.out.println(answer[i]);
        }
        System.out.println(a*b);

    }
}