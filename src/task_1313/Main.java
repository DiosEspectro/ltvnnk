package task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String res = "";

        int[][] table = new int[n][n];

        for(int i=0;i<n;i++) {
            String s = in.nextLine();
            String[] split = s.split(" ");
            for(int j=0;j<n;j++){
                table[j][i] = Integer.parseInt(split[j]);
            }
        }


        int iterations = 2*n-1;
        int pos = 0;

        for(int i=0;i<iterations;i++) {
            for(int j=n-1;j>=0;j--) {
                int x= i-j;
                int y=j;

                if(x>=0 && x<n) {
                    res += table[x][y] + " ";
                }
            }
        }

        System.out.println(res.trim());
    }
}
