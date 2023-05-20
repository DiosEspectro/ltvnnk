package timus_tasks_2.task_1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string1 = in.nextLine();
        String string2 = in.nextLine();

        String[] nums = string1.split(" ");

        int k = Integer.parseInt(nums[0]);
        int n = Integer.parseInt(nums[1]);
        int curcars = 0;

        nums = string2.split(" ");

        for(int i = 0; i < n; i++){
            curcars += Integer.parseInt(nums[i]) - k;
            if(curcars < 0) curcars = 0;
        }

        System.out.println(curcars);
    }
}