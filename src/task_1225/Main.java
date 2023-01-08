package task_1225;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        long[] arr = new long[N+1]; // На 1 больше, чтобы адресация была по N, исключая 0

        arr[1] = 2;
        for(int i=2;i<=N;i++) arr[i] = arr[i-1] + arr[i-2];

        long M = arr[N];

        out.println(M);
        out.flush();
        in.close();
    }
}
