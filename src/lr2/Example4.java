package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = in.nextInt();

        System.out.println("Число " + n + " " + (!(n >= 5 && n <= 10) ? "не " : "") + "попадает в диапазон от 5 до 10");

        in.close();
    }
}
