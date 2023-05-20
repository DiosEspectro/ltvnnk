package timus_tasks_2.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string1 = in.nextLine();
        String string2 = in.nextLine();
        String string3 = in.nextLine();

        String[] nums = string1.split(" ");
        Integer a1 = Integer.parseInt(nums[0]);
        Integer b1 = Integer.parseInt(nums[1]);

        nums = string2.split(" ");
        Integer b2 = Integer.parseInt(nums[1]);

        nums = string3.split(" ");
        Integer a3 = Integer.parseInt(nums[0]);

        System.out.println((a1 - a3) + " " + (b1 - b2));
    }
}