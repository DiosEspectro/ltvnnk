package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month name: ");
        String monthName = in.nextLine();

        System.out.println("Input a number of days in " + monthName + ": ");
        int daysNum = in.nextInt();

        System.out.println(monthName + " has " + daysNum + " days");
    }
}
