package timus_tasks_2.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();
        int n = Integer.parseInt(string.split(" ")[0]);
        int k = Integer.parseInt(string.split(" ")[1]);
        int mins = 0;

        if(k > n) mins = 2;
        else{
            if((n * 2) % k == 0) mins = n * 2 / k;
                else mins = (n * 2) / k + 1;
        }

        System.out.println(mins);
    }
}
