package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = in.nextInt();

        System.out.println("Число " + (n % 3 != 0 ? "не " : "") + "делится на 3");
        in.close();
    }
}