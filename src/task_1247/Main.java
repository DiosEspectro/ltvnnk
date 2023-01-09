package task_1247;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int n = in.nextInt();

        int sum = 0;
        String res = "";

        for (int i=0; i<s; i++) {
            int v = in.nextInt();
            v--;
            sum += v;
            if (sum > n) res = "NO";
            if(!res.isEmpty()) break;
            sum = Math.max(sum, 0);
        }

        if(res.isEmpty()) res = "YES";

        System.out.println(res);
    }
}
