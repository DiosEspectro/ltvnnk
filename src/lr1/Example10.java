package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curYear = LocalDate.now().getYear();

        System.out.println("Input year of your birth: ");
        int birthYear = in.nextInt();

        System.out.println(birthYear<=curYear ? "You are " + (curYear-birthYear) + " years old":"Your birthday in the future?");
    }
}
