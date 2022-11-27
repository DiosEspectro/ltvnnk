package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curYear = LocalDate.now().getYear();

        System.out.println("Input your age: ");
        int ages = in.nextInt();

        System.out.println("You born in " + (curYear-ages) + " year");
    }
}
