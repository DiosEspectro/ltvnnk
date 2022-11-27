package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input today's day of the week: ");
        String dotw = in.nextLine();

        System.out.println("Input today's month name: ");
        String monthName = in.nextLine();

        System.out.println("Input a number of the day in the month:");
        int dayNum = in.nextInt();

        System.out.println("Today is " + dotw + ", " + dayNum + " " + monthName);
    }
}
