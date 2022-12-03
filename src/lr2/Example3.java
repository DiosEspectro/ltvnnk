package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = in.nextInt();

        System.out.println("Число " + n + " " + ((n % 4 != 0 || n < 10) ? "не " : "") + "удовлетворяет критериям, при которых оно делится на 4, и при этом не меньше 10");

        in.close();
    }
}
