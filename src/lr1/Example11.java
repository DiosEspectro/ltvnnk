package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int curYear = LocalDate.now().getYear();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int birthYear = in.nextInt();

        System.out.println(birthYear<=curYear ? name + " are " + (curYear-birthYear) + " years old" : name + " not born yet");
    }
}
