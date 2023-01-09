package task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] table = new int[n][n];

        int iterations = 2*n-1;
        int pos = 0;

        for(int i=1;i<=iterations;i++) {
            int startx = n-i;
            for(int j=0;j<n;j++)
            {
                int x=startx+j;
                int y=j;

                if(x>=0 && x<n) {
                    pos++;
                    table[x][y] = pos;
                }
            }
        }

        for(int i=0;i<n;i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                line += table[j][i] + " ";
            }
            System.out.println(line.trim());
        }

    }
}
