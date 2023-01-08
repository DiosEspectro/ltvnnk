package task_1243;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        System.out.println(a.mod(BigInteger.valueOf(7)));
    }
}
