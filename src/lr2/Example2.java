package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = in.nextInt();

        System.out.println("При делении числа " + n + " на 5 в остатке " + (n % 5 != 2 ? "не " : "") + "получается 2");
        System.out.println("При делении числа " + n + " на 7 в остатке " + (n % 7 != 1 ? "не " : "") + "получается 1");

        in.close();
    }
}
