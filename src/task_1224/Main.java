package task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long m = in.nextLong();

        long ret = Math.min(2*(n-1),  2*m-1);

        System.out.println(ret);
    }
}
