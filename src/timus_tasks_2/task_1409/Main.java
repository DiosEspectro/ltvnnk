package timus_tasks_2.task_1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] sm = s.split(" ");

        int g = Integer.parseInt(sm[0]);
        int l = Integer.parseInt(sm[1]);

        int sum = g+l-1;
        if(sum > 10) sum = 10;

        System.out.println((sum-g)+ " " + (sum-l));
    }
}
